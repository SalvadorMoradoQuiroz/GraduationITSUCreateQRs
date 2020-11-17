package com.salvador.graduationitsucreateqrs.repository;

import android.content.Context;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.salvador.graduationitsucreateqrs.helpers.interfaces.Information;
import com.salvador.graduationitsucreateqrs.helpers.models.Alumno;
import com.salvador.graduationitsucreateqrs.helpers.utility.SenderAsyncTask;
import com.salvador.graduationitsucreateqrs.helpers.utility.StringHelper;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public class FirebaseStorageHelper
{
    private FirebaseStorage mStorage = FirebaseStorage.getInstance();
    private StorageReference studentsFiles = mStorage.getReference().child("alumnos");
    private Information information;

    public void addImage(final String numeroCtrl, Uri uri, Context context, Alumno alumno)
    {
        //Register observers to listen for when the download is done or if it fails.
        studentsFiles.child(numeroCtrl).putFile(uri).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception)
            {
                information.status("Error al subir la imagen de QR al sistema, verifica tu conexión a Internet");
            }
        }).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                //information.status("Se ha subido la imagen de QR al sistema.");
                studentsFiles.child(numeroCtrl).getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri)
                    {
                        //Enviar el correo electronico
                        sendEmailWithGmail(StringHelper.email, StringHelper.pass, alumno.getCorreo(), context, alumno, uri );
                    }
                });
            }
        });

    }

    public void deleteImage(final String document, Context context)
    {
        // Delete the file.
        studentsFiles.child(document).delete().addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid)
            {
                information.status("Se ha actualizado la imagen de QR en el sistema.");
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception)
            {
                information.status("Error de actualización de imagen QR, verifica tu conexión a Internet");
            }
        });
    }

    public void setInformationListener(Information status)
    {
        this.information=status;
    }

    private void sendEmailWithGmail(final String from, final String passwordfrom, String to, Context context, Alumno alumno, Uri uriQR) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, passwordfrom);
            }
        });

        SenderAsyncTask task = new SenderAsyncTask(session,from,to,context,alumno, uriQR);
        task.execute();
    }

}
