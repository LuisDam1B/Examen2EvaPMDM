package com.example.examen2evapmdm;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface ProveedorServicios {

    @GET("ciudades")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call<List<Ciudades>> getCiudades();//@Query("search") String search);
}
