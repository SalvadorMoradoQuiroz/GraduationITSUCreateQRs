package com.salvador.graduationitsucreateqrs.helpers.utility;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.widget.Toast;

import com.salvador.graduationitsucreateqrs.helpers.models.Alumno;

import java.io.UnsupportedEncodingException;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SenderAsyncTask extends AsyncTask<String, String, String> {
    private String from, to;
    private ProgressDialog progressDialog;
    private Session session;
    private Context context;
    private Alumno alumno;
    private Uri uriQR;

    public SenderAsyncTask(Session session, String from, String to, Context context, Alumno alumno, Uri uriQR) {
        this.session = session;
        this.from = from;
        this.to = to;
        this.context = context;
        this.alumno = alumno;
        this.uriQR=uriQR;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        progressDialog = ProgressDialog.show(context, "Enviando", "Espere", true);
        progressDialog.setCancelable(false);
    }

    @Override
    protected String doInBackground(String... params) {
        try {
                enviarInvitacion();
        } catch (MessagingException e) {
            e.printStackTrace();
            return e.getMessage();
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
        return null;
    }

    @Override
    protected void onProgressUpdate(String... values) {
        super.onProgressUpdate(values);
        progressDialog.setMessage(values[0]);
    }

    @Override
    protected void onPostExecute(String result) {
        progressDialog.dismiss();
        new AlertDialogPersonalized().alertDialogInformacion("Se enviará la invitación de la ceremonia de gradución a tu correo: "+ alumno.getCorreo()+". Además se almacenó el QR en tu galeria con tu nombre.", context);
        //Toast.makeText(context, "Se enviará la invitación de la ceremonia de gradución a tu correo "+ alumno.getCorreo(), Toast.LENGTH_LONG).show();
    }

    private void enviarInvitacion() throws UnsupportedEncodingException, MessagingException {
        Message mimeMessage = new MimeMessage(session);
        mimeMessage.setFrom(new InternetAddress(from, "ITSU"));
        mimeMessage.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
        mimeMessage.setSubject("Invitación Ceremonia De Graduación ITSU.");
        String htmlImagenInvitacion = "<p ALIGN=\"center\"><img  width=\"2924\" height=\"1836\" src=\"https://firebasestorage.googleapis.com/v0/b/graduacion-itsu.appspot.com/o/Invitcion_Graduacion2015_2020_ac.png?alt=media&token=6432079e-3056-4235-b482-4c8fbfb18b79\"></p>";

        String htmlText =
                "<body> " +
                        "<h4><font size=3 face=\"Sans Serif,arial,verdana\">Hola, Ing. " + alumno.getNombre() + "</font></h4> " +
                        "<br>" +
                        htmlImagenInvitacion +
                        "<hr>" +
                        "<br>" +
                        "<p ALIGN=\"justify\"><font size=3 face=\"Sans Serif,arial,verdana\">" + "Este QR es tú pase para la ceremonia de graduación.<br>Compartelo con tu invitado.</p>"+/*nombre*/
                        "<br>" +
                        "<p ALIGN=\"center\"><img  width=\"200\" height=\"200\" src="+uriQR+"></p>"+
                        "<hr>" +
                        "<footer>" +
                        "<p><font size=2 face=\"Sans Serif,arial,verdana\">Felicidades!!!</font></p>" +
                        "<p ALIGN=\"justify\"><font color=\"#aba7a7\" size=1 face=\"Sans Serif,arial,verdana\"><font color=\"#0047BA\" size=1 face=\"Sans Serif,arial,verdana\">©Graduación ITSU</font> created in Instituto Tecnológico Superior de Uruapan, Carretera Uruapan-Carapan No. 5555 Col. La Basilia Uruapan, Michoacán. Este correo fue enviado para: <font color=\"#1a73e8\" size=1 face=\"Sans Serif,arial,verdana\">" + to + "</font> y fue enviado por <font color=\"#0047BA\" size=1 face=\"Sans Serif,arial,verdana\">itsu.sistemas.apps@gmail.com</font></font></p>" +
                        "</footer>" +
                        "</body>";
        mimeMessage.setContent(htmlText, "text/html; charset=utf-8");
        Transport.send(mimeMessage);
    }
}