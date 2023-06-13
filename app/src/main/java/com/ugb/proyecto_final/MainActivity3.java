package com.ugb.proyecto_final;

import android.os.Bundle;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;


public class MainActivity3 extends AppCompatActivity {

    SensorManager sensorManager;
    android.hardware.Sensor Sensor;
    SensorEventListener sensorEventListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final TextView texto = (TextView)findViewById(R.id.tvSensor);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        Sensor = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        if (Sensor == null) finish();
        sensorEventListener = new SensorEventListener(){
            @Override
            public void onSensorChanged(SensorEvent sensorEvent){
                if (sensorEvent.values[0]< Sensor.getMaximumRange()){
                    getWindow().getDecorView().setBackgroundColor(Color.RED);
                    texto.setText("Demasiado Cerca");
                }else{
                    getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                    texto.setText("Sensor");
                }
            }

            @Override
            public void onAccuracyChanged(android.hardware.Sensor sensor, int i) {

            }

        };

    }
    public void start(){
        sensorManager.registerListener(sensorEventListener,Sensor,2000*1000);
    }
    public void stop(){
        sensorManager.unregisterListener(sensorEventListener);
    }
    @Override
    protected void onPause(){
        stop();
        super.onPause();
    }
    @Override
    protected void onResume() {
        start();
        super.onResume();
    }

}