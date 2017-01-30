package com.example.vaio.practica1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Omplir extends AppCompatActivity {

    protected Button btAcceptar;
    protected Button btCancelar;
    protected EditText editOmplir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omplir);

        btAcceptar = (Button) findViewById(R.id.btAcceptar);
        btCancelar = (Button) findViewById(R.id.btCancelar);
        editOmplir = (EditText) findViewById(R.id.editOmplir);

        btAcceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editOmplir.getText().length()!=0){
                    String introduit = editOmplir.getText().toString();

                    Intent i = getIntent();

                    i.putExtra("INTRODUCCIÓ", introduit);

                    setResult(RESULT_OK, i);

                    finish();
                } else {
                    Toast.makeText(Omplir.this, "No has introduït res", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED);

                finish();
            }
        });
    }
}
