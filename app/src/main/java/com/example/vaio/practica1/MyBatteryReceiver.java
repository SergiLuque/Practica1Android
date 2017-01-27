package com.example.vaio.practica1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyBatteryReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent){
        String action = intent.getAction();

        //Toast.makeText(context,"Action: " + action, Toast.LENGTH_SHORT).show();

        String strAction;

        if(action == Intent.ACTION_BATTERY_LOW){
            strAction = "ACTION_BATTERY_LOW)";

        }else if (action == Intent.ACTION_BATTERY_OKAY){
            strAction = "ACTION_BATTERY_OKAY";

        }else if (action == Intent.ACTION_POWER_CONNECTED){
            strAction = "ACTION_POWER_CONNECTED";

        }else if (action == Intent.ACTION_POWER_DISCONNECTED){
            strAction = "Bateria desconectada";
        }else{
            strAction = "unknown!";
        }

        Toast.makeText(context,"Action: " + strAction, Toast.LENGTH_SHORT).show();

    }
}
