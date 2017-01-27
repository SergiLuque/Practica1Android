package com.example.vaio.practica1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Intent2 extends AppCompatActivity {

    TextView etiTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent2);
        etiTelefono = (TextView) findViewById( R.id.tvNumero2 );

        Intent intent=getIntent();
        Bundle extras =intent.getExtras();
        if (extras != null) {//ver si contiene datos
            //String datoNombre=(String)extras.get("nombre");//Obtengo el nombre
            String datoTelefono= (String) extras.get("telefono");//Obtengo la edad
            //String  datoTelefono2=String.valueOf(datoTelefono);
            etiTelefono.setText(datoTelefono);
        }
    }
}