package com.ugb.proyecto_final;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class pantalla_principal extends AppCompatActivity{

    @Override

    protected void onCreate(Bundle savedIntanceState) {


        super.onCreate(savedIntanceState);
        setContentView(R.layout.pantalla_principal);


        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(pantalla_principal.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(tarea,3000);

    }

}
