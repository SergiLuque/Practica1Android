package com.example.vaio.practica1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class StartActivityForResult extends AppCompatActivity {

    private final static int MARCA = 0;
    private final static int TIPUS = 1;
    protected EditText editMarca;
    protected EditText editTipus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_activity_for_result);

        editMarca = (EditText)findViewById(R.id.editMarca);
        editTipus = (EditText)findViewById(R.id.editTipus);
    }

    public void posarMarca (View view){
        Intent intent = new Intent(this, Omplir.class);
        findViewById(R.id.btMarca);
        startActivityForResult(intent, MARCA);
    }
    public void posarTipus (View view){
        Intent intent = new Intent(this, Omplir.class);
        findViewById(R.id.btTipus);
        startActivityForResult(intent, TIPUS);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(resultCode == RESULT_CANCELED){
            Toast.makeText(this, "Introducció cancel·lada", Toast.LENGTH_SHORT).show();
        } else{
            String introduit = data.getExtras().getString("INTRODUCCIÓ");

            switch (requestCode){
                case MARCA:
                    editMarca.setText(introduit); break;
                case TIPUS:
                    editTipus.setText(introduit); break;
            }
        }
    }
}
