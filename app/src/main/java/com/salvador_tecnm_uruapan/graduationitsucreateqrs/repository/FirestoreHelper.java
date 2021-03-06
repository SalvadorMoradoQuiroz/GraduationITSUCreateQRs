package com.salvador_tecnm_uruapan.graduationitsucreateqrs.repository;


import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.WriteBatch;
import com.salvador_tecnm_uruapan.graduationitsucreateqrs.R;
import com.salvador_tecnm_uruapan.graduationitsucreateqrs.helpers.interfaces.Information;
import com.salvador_tecnm_uruapan.graduationitsucreateqrs.helpers.models.Alumno;
import com.salvador_tecnm_uruapan.graduationitsucreateqrs.helpers.utility.StringHelper;
import com.salvador_tecnm_uruapan.graduationitsucreateqrs.MainActivity;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;


public class FirestoreHelper
{
    private static FirebaseFirestore db = FirebaseFirestore.getInstance();
    private static final CollectionReference AlumnosCollection = db.collection("alumnos");
    public void getData(String document, final ProgressDialog dialog, final MainActivity information, final Context context)
    {
        dialog.show();
        AlumnosCollection.document(document).get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {

                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (Objects.requireNonNull(document).exists())
                    {
                        Map<String,Object> data=document.getData();
                        Alumno alumno = new  Alumno(document.getId(),String.valueOf(data.get("asiento")),String.valueOf(data.get("nombre")),String.valueOf(data.get("carrera")),String.valueOf(data.get("grupo")),String.valueOf(data.get("correo")).toLowerCase());
                        final AlertDialog.Builder  alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setCancelable(false);
                        alertDialogBuilder.setTitle("Datos Obtenidos");
                        alertDialogBuilder.setMessage("NCtrol: "+alumno.getId()+"\n"+
                                                      "Nombre: "+alumno.getNombre()+"\n"+
                                                      "Carrera: "+StringHelper.getCarrara(alumno.getCarrera()) +"\n"+
                                                      "Grupo: "+alumno.getGrupo()+"\n"+
                                                      "Si existe algún error, comunícate con el jefe de carrera de ISC.\n"+
                                                       context.getString(R.string.correo_jefe)+"\n\n"+
                                                      "Comparte la imagen con tu invitado ya que en la entrada será requerida.");
                        alertDialogBuilder.setPositiveButton("Recibir invitación por email.",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface alertDialog, int i)
                                    {
                                        information.status("fiesta");
                                        alertDialog.cancel();
                                    }
                                }
                        );
                        alumno.setCarrera(StringHelper.getCarrara(alumno.getCarrera()));
                        information.getData(alumno);
                        alertDialogBuilder.show();

                    }
                    else
                    {
                        final AlertDialog.Builder  alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setCancelable(false);
                        alertDialogBuilder.setTitle("Error de Obtención");
                        alertDialogBuilder.setMessage("No hay Información acerca del número de control ingresado, comunícate con el jefe de carrera de ISC. "+
                                context.getString(R.string.correo_jefe)+"\n\n");
                        alertDialogBuilder.setPositiveButton("Aceptar",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface alertDialog, int i)
                                    {

                                        alertDialog.cancel();
                                    }
                                }
                        );
                        information.getData(null);
                        alertDialogBuilder.show();
                    }
                }
                else
                {
                    information.getData(null);
                    information.status("Error, verifique su conexión a Internet, si los problemas continuan contacte al administrador.");
                }
                dialog.dismiss();

            }
        });

    }
    // este proceso solo se puede hacer de 500 en 500 no en más
   public void sendAllInformation(Information information, final ProgressDialog dialog)
    {
        dialog.show();
        WriteBatch batch = db.batch();
        StringHelper stringHelper = new StringHelper();
        ArrayList<Alumno> alumnos = stringHelper.getData();

        DocumentReference nycRef ;
        for(int i =0;i<stringHelper.getData().size();i++)
        {
            nycRef = AlumnosCollection.document(alumnos.get(i).getId());
            //batch.set(nycRef, new Alumno2());

            /*Map<String,Object> data = new HashMap<>();
            data.put("asiento",alumnos.get(i).getAsiento());
            data.put("correo",alumnos.get(i).getCorreo());
            data.put("nombre",alumnos.get(i).getNombre());
            data.put("grupo",alumnos.get(i).getGrupo());
            data.put("carrera",alumnos.get(i).getCarrera());
            data.put("status",alumnos.get(i).getStatus());
            batch.update(nycRef,data);*/
        }
        batch.commit().addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task)
            {
                if(task.isComplete())
                {
                    information.status(alumnos.size()+" escritos con exito");
                    dialog.dismiss();
                }
            }
        });


    }

    class Alumno2
    {
        String nombre;
        String asiento;
        String correo;
        String carrera;
        String grupo;
        int status;
        public Alumno2()
        {

        }

        public Alumno2(String nombre, String asiento, String correo, String carrera, String grupo, int status) {
            this.nombre = nombre;
            this.asiento = asiento;
            this.correo = correo;
            this.carrera = carrera;
            this.grupo = grupo;
            this.status = status;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getAsiento() {
            return asiento;
        }

        public void setAsiento(String asiento) {
            this.asiento = asiento;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public void setCarrera(String carrera) {
            this.carrera = carrera;
        }

        public void setGrupo(String grupo) {
            this.grupo = grupo;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getStatus() {
            return status;
        }
        public String getNombre() {
            return nombre;
        }

        public String getCarrera() {
            return carrera;
        }

        public String getGrupo() {
            return grupo;
        }

    }

}
