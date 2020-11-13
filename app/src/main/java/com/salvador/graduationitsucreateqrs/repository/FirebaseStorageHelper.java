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

public class FirebaseStorageHelper
{
    private FirebaseStorage mStorage = FirebaseStorage.getInstance();
    private StorageReference studentsFiles = mStorage.getReference().child("alumnos");
    private Information information;

    public void addImage(final String numeroCtrl, Uri uri, Context context, String email)
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

                        //firestoreHelperProductos.updateDataProductImage(document,uri.toString(),dialog,status,context);
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
}
