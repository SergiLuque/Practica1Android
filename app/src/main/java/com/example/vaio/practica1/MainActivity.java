package com.example.vaio.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//Propiedad es mia 2

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void abrirIntent(View view){
        // Hace algo cuando pulsemos el botón
        Intent intent = new Intent(this, Intent1.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void abrirSharedPreferences(View view){
        // Hace algo cuando pulsemos el botón
        Intent intent = new Intent(this, Calculadora.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void abrirFitxers(View view){
        // Hace algo cuando pulsemos el botón
        Intent intent = new Intent(this, Ficheros.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void abrirMissatgeria(View view){
        // Hace algo cuando pulsemos el botón
        Intent intent = new Intent(this, SMS.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void abrirBateria(View view){
        // Hace algo cuando pulsemos el botón
        Intent intent = new Intent(this, MyBatteryReceiver.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void abrirStartActivityForResult (View view){
        Intent intent = new Intent(this, StartActivityForResult.class);
        //findViewById(R.id.btStartActivityForResult);
        startActivity(intent);
    }

    public void abrirSQLite (View view){
        Intent intent = new Intent(this, BaseDatos.class);
        //findViewById(R.id.btStartActivityForResult);
        startActivity(intent);
    }

}
