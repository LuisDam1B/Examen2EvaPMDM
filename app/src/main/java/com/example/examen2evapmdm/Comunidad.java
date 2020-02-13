package com.example.examen2evapmdm;

import androidx.annotation.NonNull;

public class Comunidad {
    int codigoComunidad;
    String nombreComunidad;
    int codigoPostalProvincia;
    String nombrPRovincia;

    public Comunidad(int codigoComunidad, String nombreComunidad, int codigoPostalProvincia, String nombrPRovincia) {
        this.codigoComunidad = codigoComunidad;
        this.nombreComunidad = nombreComunidad;
        this.codigoPostalProvincia = codigoPostalProvincia;
        this.nombrPRovincia = nombrPRovincia;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
