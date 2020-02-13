package com.example.examen2evapmdm;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class BDAdapter {

    BDImagenesOH bdImagenesOH;
    Context context;

    public BDAdapter(Context context,String nombreBD,int version) {
        this.context = context;
        bdImagenesOH = new BDImagenesOH(context,nombreBD,null,version);

    }

    public void insertarUnDato(Imagen imagen,SQLiteDatabase sqLiteDatabase){

        sqLiteDatabase = bdImagenesOH.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put("codigopostal",imagen.getCodigopostal());
        contentValues.put("descripcion",imagen.getDescripcion());
        contentValues.put("imagen",Foto.getBytesFromBitmap(Foto.convertirStringBitmap(imagen.imagen)));

        sqLiteDatabase.insert("imagenes",null,contentValues);
        sqLiteDatabase.close();

    }

    public void insertarDatos(){
        SQLiteDatabase sqLiteDatabase = bdImagenesOH.getWritableDatabase();

        ArrayList<Imagen> listaImagenes = Utilidades.listaDeImagenesCiudades(context);
        for (Imagen img : listaImagenes) {
            insertarUnDato(img,sqLiteDatabase);
        }
        sqLiteDatabase.close();
    }

}
