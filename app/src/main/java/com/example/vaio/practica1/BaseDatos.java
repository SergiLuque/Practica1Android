package com.example.vaio.practica1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BaseDatos extends AppCompatActivity {

    protected Button bCrear;
    protected EditText etNombre;
    protected String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_datos);

        bCrear = (Button)findViewById(R.id.btCrear);
        etNombre = (EditText)findViewById(R.id.etNombre);

        //BOTON CREAR
        bCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BaseDatos.this, BaseDatos2.class);
                Bundle b = new Bundle();

                nombre = etNombre.getText().toString();
                b.putString("Nombre",nombre);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }

}
