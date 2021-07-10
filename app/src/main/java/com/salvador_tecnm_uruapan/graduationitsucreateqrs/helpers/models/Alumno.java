package com.salvador_tecnm_uruapan.graduationitsucreateqrs.helpers.models;

public class Alumno
{
    String asiento;
    String id;
    String nombre;
    String carrera;
    String grupo;
    int status;
    String correo;

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Alumno(String id, String asiento,String nombre, String carrera, String grupo, String correo) {
        this.id = id;
        this.asiento=asiento;
        this.nombre = nombre;
        this.carrera = carrera;
        this.grupo = grupo;
        this.correo=correo;
        status=0;

    }

    public Alumno(String id, String nombre, String carrera, String grupo,int status) {
        this.id = id;
        this.nombre = nombre;
        this.carrera = carrera;
        this.grupo = grupo;
        this.status=status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
