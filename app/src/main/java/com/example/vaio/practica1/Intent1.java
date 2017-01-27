package com.example.vaio.practica1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Intent1 extends AppCompatActivity implements View.OnClickListener {

    private Button btnEnviar;
    private EditText etTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        btnEnviar=(Button)findViewById(R.id.btEnviar);
       // ediNombre = (EditText) findViewById( R.id.edi_nombre );
        etTelefono = (EditText) findViewById( R.id.etNumero );

        btnEnviar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent explicit_intent;//Declaro el Intent

        //Instanciamos el Intent dandole:
        // el contexto y la clase a la cual nos deseamos dirigir
        explicit_intent = new Intent(this,Intent2.class);

        String auxTelefono=etTelefono.getText().toString();
        explicit_intent.putExtra("telefono",auxTelefono);//Guardamos un entero

        //lo iniciamos pasandole la intencion, con todos sus parametros guardados
        startActivity(explicit_intent);
    }
}


