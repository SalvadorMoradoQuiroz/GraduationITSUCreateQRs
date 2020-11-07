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
    private StorageReference productFiles = mStorage.getReference().child("alumnos");

    private Information information;
    public void addImage(final String numeroCtrl, Uri uri, final AlertDialog dialog, Context context)
    {

        //Register observers to listen for when the download is done or if it fails
        productFiles.child(numeroCtrl).putFile(uri).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception)
            {
                dialog.dismiss();
                //status.status(context.getString(R.string.error_image_update));
            }
        }).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
               // status.status(context.getString(R.string.imagen_update));

                productFiles.child(numeroCtrl).getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri)
                    {
                        //firestoreHelperProductos.updateDataProductImage(document,uri.toString(),dialog,status,context);
                    }
                });

            }
        });

    }
    public void deleteImage(final String document, final AlertDialog dialog, Context context)
    {
        // Delete the file
        productFiles.child(document).delete().addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid)
            {
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception)
            {
            }
        });
    }

    public void setInformationListener(Information status)
    {
        this.information=status;
    }

}
