package com.salvador.graduationitsucreateqrs.helpers.utility;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

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
    private String[] datos;

    public SenderAsyncTask(Session session, String from, String to, Context context, String[] datos) {
        this.session = session;
        this.from = from;
        this.to = to;
        this.context = context;
        this.datos = datos;
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

                recuperacionCredenciales();

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

            Toast.makeText(context, "Se enviará tu "+ datos[2]+ " al equipo de IntegraTec.", Toast.LENGTH_LONG).show();

    }

    private void recuperacionCredenciales() throws UnsupportedEncodingException, MessagingException {
        Message mimeMessage = new MimeMessage(session);
        mimeMessage.setFrom(new InternetAddress(from, "IntegraTec"));
        mimeMessage.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
        mimeMessage.setSubject("Recuperación de credenciales");
        String htmlText2 = "<p ALIGN=\"center\"><img  width=\"200\" height=\"200\" src=\"https://firebasestorage.googleapis.com/v0/b/integratec-itsu.appspot.com/o/integratec4.png?alt=media&token=67ee39a5-9dbb-4cf7-b0cb-5fe09d9222fc\"></p>";
        String htmlText =
                "<body> " +
                        "<h4><font size=3 face=\"Sans Serif,arial,verdana\">Hola, Ing. " + datos[0] + "</font></h4> " +
                        "<br>" +
                        htmlText2 +
                        "<hr>" +
                        "<p ALIGN=\"justify\"><font size=3 face=\"Sans Serif,arial,verdana\">" + "Tus credenciales <strong>" + datos[0]/*nombre*/
                        +
                        "</strong> son:" + "</font></p>" +
                        "<p ALIGN=\"center\"><font size=3 face=\"Sans Serif,arial,verdana\">" + "<br><strong>" + to + "<br><br>" + datos[1]/*contraseña*/ + "</strong>" + "</font></p>" +
                        "<p ALIGN=\"justify\"><font size=3 face=\"Sans Serif,arial,verdana\">Si tú no solisitaste esto no tienes porque preocuparte tus datos están protegidos.</p>" +
                        "<p ALIGN=\"justify\"><font size=3 face=\"Sans Serif,arial,verdana\">Saludos cordiales,</font></p>" +
                        "<p><font size=3 face=\"Sans Serif,arial,verdana\">El equipo </font><font color=\"#EA2925\" size=3 face=\"Sans Serif,arial,verdana\">IntegraTec.</font>.</p>" +
                        "<br>" +
                        "<hr>" +
                        "<footer>" +
                        "<p><font color=\"#C5BFBF\" size=2 face=\"Sans Serif,arial,verdana\">Gracias!!</font></p>" +
                        "<p ALIGN=\"justify\"><font color=\"#C5BFBF\" size=1 face=\"Sans Serif,arial,verdana\"><font color=\"#EA2925\" size=1 face=\"Sans Serif,arial,verdana\">©IntegraTec</font> from Instituto Tecnológico Superior de Uruapan, Carretera Uruapan-Carapan No. 5555 Col. La Basilia Uruapan, Michoacán. Este correo fue enviado para: <font color=\"#1a73e8\" size=1 face=\"Sans Serif,arial,verdana\">" + to + "</font> y fue enviado por <font color=\"#EA2925\" size=1 face=\"Sans Serif,arial,verdana\">IntegraTec</font></font>.</p>" +
                        "</footer>" +
                        "</body>";
        mimeMessage.setContent(htmlText, "text/html; charset=utf-8");
        Transport.send(mimeMessage);
    }




}