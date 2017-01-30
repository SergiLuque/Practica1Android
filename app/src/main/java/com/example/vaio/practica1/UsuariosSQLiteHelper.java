package com.example.vaio.practica1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class UsuariosSQLiteHelper extends SQLiteOpenHelper {

    protected String sqlCreate = "CREATE TABLE PRODUCTO (ID INTEGER ,Tipo TEXT ,Marca TEXT, Nombre TEXT, Precio REAL)";

    public UsuariosSQLiteHelper(Context contexto, String nombre, SQLiteDatabase.CursorFactory factory, int version) {
        super(contexto, nombre, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sqlCreate);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAnterior, int versionNueva) {

        db.execSQL("DROP TABLE IF EXISTS PRODUCTO");

        db.execSQL(sqlCreate);
    }
}
