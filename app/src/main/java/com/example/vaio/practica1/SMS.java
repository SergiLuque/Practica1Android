package com.example.vaio.practica1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import android.app.Activity;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by VAIO on 24/01/2017.
 */

public class SMS extends AppCompatActivity implements OnClickListener{

    Button btnAll;
    Button btnInbox;
    Button btnSent;
    EditText etMensaje;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);



        try {
            /*
             * Initializing Widgets
             */



            btnSent = (Button) findViewById(R.id.btEnviar);
            btnSent.setOnClickListener(this);

            etMensaje = (EditText) findViewById(R.id.etMenaje);
            etMensaje.setOnClickListener(this);





        } catch (Exception ex) {
            Toast.makeText(this,
                    "Error in MainActivity.onCreate: " + ex.getMessage(),
                    Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {
        Uri smsUri = Uri.parse("content://sms/");
/*
        switch (v.getId()) {

            case R.id.btEnviar:
                smsUri = Uri.parse("content://sms/sent");

                strPhone = "XXXXXXXXXXX";
                String strMessage = etMensaje.getText();

                Uri sms_uri = Uri.parse("smsto:+" + strPhone);
                Intent sms_intent = new Intent(Intent.ACTION_SENDTO, sms_uri);
                sms_intent.putExtra("sms_body", txtMessage.getText().toString());
                startActivity(sms_intent);
                break;

        }

        Cursor cursor = getContentResolver().query(smsUri, null, null, null, null);

        Cursor2TableLayout(cursor, tblMain);
    }*/

    }
}
