package com.example.vaio.practica1;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class Calculadora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/

    Double numero1,numero2,resultado;
    String operador;

    public void onClick_Igual(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        numero2 = Double.parseDouble(tv.getText().toString());

        if(operador.equals("+"))
        {
            resultado= numero1+numero2;
        }
        else if(operador.equals("-"))
        {
            resultado= numero1-numero2;
        }
        else if(operador.equals("*"))
        {
            resultado= numero1*numero2;
        }
        else if(operador.equals("/"))
        {
            resultado= numero1/numero2;
        }
        tv.setText(resultado.toString());
    }

    public void onClick_Suma(View miView)
    {
        operador="+";
        onClickOperacionCapturaNumero1(miView);

    }
    public void onClick_Resta(View miView)
    {
        operador="-";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClick_Multiplicar(View miView)
    {
        operador="*";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClick_Dividir(View miView)
    {
        operador="/";
        onClickOperacionCapturaNumero1(miView);
    }

    public void onClickOperacionCapturaNumero1(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void onClick_CE(View miView)
    {
        numero1=0.0;
        numero2=0.0;
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText("");
    }

    public void onClick_C(View miView)
    {
/*
        TextView tv = (TextView) findViewById(R.id.textView) ;
        String str = tv.getText().toString();
        tv.setText(str.substring(0,1));*/

        Toast.makeText(this, "No hace nada", Toast.LENGTH_SHORT).show();


    }

    public void onClick_1(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "1");
    }
    public void onClick_2(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "2");
    }
    public void onClick_3(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "3");
    }
    public void onClick_4(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "4");
    }
    public void onClick_5(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "5");
    }
    public void onClick_6(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "6");
    }
    public void onClick_7(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "7");
    }
    public void onClick_8(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "8");
    }
    public void onClick_9(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "9");
    }
    public void onClick_0(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "0");
    }
    public void onClick_Punto(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + ".");
    }





    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
/*
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }
}



