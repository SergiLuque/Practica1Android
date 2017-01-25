package com.example.vaio.practica1;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Created by VAIO on 23/01/2017.
 */



public class Ficheros extends AppCompatActivity {

    private Button btn_W_Interna;
    private Button btn_W_Externa ;
    private Button btn_R_Raw ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ficheros);

        btn_W_Interna = (Button)findViewById(R.id.bt_Interna);
        btn_W_Interna = (Button)findViewById(R.id.bt_Externa);
        btn_R_Raw = (Button)findViewById(R.id.bt_Raw);

        btn_W_Interna.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
                try
                {
                    OutputStreamWriter fout =
                            new OutputStreamWriter(
                                    openFileOutput("prueba_int.txt", Context.MODE_PRIVATE));

                    fout.write("Texto de prueba.");
                    fout.close();

                    Log.i("Ficheros", "Fichero creado!");
                }
                catch (Exception ex)
                {
                    Log.e("Ficheros", "Error al escribir fichero a memoria interna");
                }
            }
        });

        btn_R_Raw.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
                String linea = "";

                try
                {
                    InputStream fraw =
                            getResources().openRawResource(R.raw.pruebaraw);

                    BufferedReader brin =
                            new BufferedReader(new InputStreamReader(fraw));

                    linea = brin.readLine();
                    fraw.close();

                    Log.i("Ficheros", "Fichero RAW leido!");
                    Log.i("Ficheros", "Texto: " + linea);
                }
                catch (Exception ex)
                {
                    Log.e("Ficheros", "Error al leer fichero desde recurso raw");;
                }
            }
        });

    }
}
