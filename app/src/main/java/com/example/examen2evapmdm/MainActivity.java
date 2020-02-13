package com.example.examen2evapmdm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    ArrayList<Ciudades> ListaCiudadesRres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        Inicio_Fragment inicio_fragment = new Inicio_Fragment();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.Contenedor,inicio_fragment);
        ft.addToBackStack(null);
        ft.commit();
*/
        ListaCiudadesRres = new ArrayList<>();
        getCiudades();
        Toast.makeText(MainActivity.this,ListaCiudadesRres.get(1).codigopostal,Toast.LENGTH_SHORT).show();

    }

    public void getCiudades() {

        final ArrayList<String> arrayNicks=new ArrayList<>();

        List<Ciudades> listaCiudades;
        ProveedorServicios proveedorServicios = crearRetrofit();

        Call<List<Ciudades>> responseCall = proveedorServicios.getCiudades();


        responseCall.enqueue(new Callback<List<Ciudades>>() {
            @Override
            public void onResponse(Call<List<Ciudades>> call, Response<List<Ciudades>> response) {
                List<Ciudades> autosResponse = response.body();

                if (autosResponse != null) {
                   final List<Ciudades> listaCiudades = autosResponse;
                    for (Ciudades ciudad : listaCiudades)
                        ListaCiudadesRres.add(ciudad);
                }
            }

            @Override
            public void onFailure(Call<List<Ciudades>> call, Throwable t) {
                Log.e("Error", t.toString());
                Toast.makeText(MainActivity.this, "Error" + t.toString(), Toast.LENGTH_LONG).show();

            }
        });
    }



    private ProveedorServicios crearRetrofit() {

        String url = "http://xusa.iesdoctorbalmis.info/examenciudades/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(ProveedorServicios.class);
    }
}
