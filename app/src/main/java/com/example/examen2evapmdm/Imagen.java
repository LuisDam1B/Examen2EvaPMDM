package com.example.examen2evapmdm;

public class Imagen {
    public int id;
    public int codigopostal;
    public String descripcion;
    public String imagen;
    public Imagen(){}

    public Imagen(int codigopostal, String descripcion, String imagen) {
        this.codigopostal = codigopostal;
        this.imagen = imagen;
        this.descripcion=descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(int codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
