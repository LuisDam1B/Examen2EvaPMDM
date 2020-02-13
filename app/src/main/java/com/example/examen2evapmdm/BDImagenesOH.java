package com.example.examen2evapmdm;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BDImagenesOH extends SQLiteOpenHelper {

    Context context;
    public BDImagenesOH(Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);

        this.context = context;


    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE imagenes (ID  INTEGER PRIMARY KEY  AUTOINCREMENT NOT NULL, codigopostal INTEGER, descripcion TEXT, imagen BLOB);");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

