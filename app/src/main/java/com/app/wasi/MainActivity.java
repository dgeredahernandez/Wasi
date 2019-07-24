package com.app.wasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnQr, btnHome, btnCarpinteria, btnInstalaciones, btnLimpieza, btnCerrajeria, btnElectricidad, btnGasfiteria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnQr = findViewById(R.id.imageButtonQR);
        btnHome = findViewById(R.id.imageButtonHome);
        btnInstalaciones = findViewById(R.id.imageButtonInstalaciones);
        btnCarpinteria = findViewById(R.id.imageButtonCarpinteria);
        btnLimpieza = findViewById(R.id.imageButtonLimpieza);
        btnCerrajeria = findViewById(R.id.imageButtonCerrajeria);
        btnElectricidad = findViewById(R.id.imageButtonElectricidad);
        btnGasfiteria = findViewById(R.id.imageButtonGasfiteria);

        btnQr.setOnClickListener(this);
        btnHome.setOnClickListener(this);
        btnInstalaciones.setOnClickListener(this);
        btnCarpinteria.setOnClickListener(this);
        btnLimpieza.setOnClickListener(this);
        btnCerrajeria.setOnClickListener(this);
        btnElectricidad.setOnClickListener(this);
        btnGasfiteria.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.imageButtonQR:
                Intent intent = new Intent(this,QrActivity.class);
                startActivity(intent);
                break;

            case R.id.imageButtonHome:
                intent = new Intent(this,MainActivity.class);
                startActivity(intent);
                break;

            case R.id.imageButtonInstalaciones:
                Log.i("APP","clic en Menu Instalaciones");
                intent = new Intent(this,BusquedaTecnicoActivity.class);
                intent.putExtra("titulo","Instalaciones");
                startActivity(intent);
                break;

            case R.id.imageButtonCarpinteria:
                Log.i("APP","clic en Menu Carpinteria");
                intent = new Intent(this,BusquedaTecnicoActivity.class);
                intent.putExtra("titulo","Carpinteria");
                startActivity(intent);
                break;

            case R.id.imageButtonCerrajeria:
                Log.i("APP","clic en Menu Cerrajeria");
                intent = new Intent(this,BusquedaTecnicoActivity.class);
                intent.putExtra("titulo","Cerrajeria");
                startActivity(intent);
                break;

            case R.id.imageButtonElectricidad:
                Log.i("APP","clic en Menu Electricidad");
                intent = new Intent(this,BusquedaTecnicoActivity.class);
                intent.putExtra("titulo","Electricidad");
                startActivity(intent);
                break;

            case R.id.imageButtonGasfiteria:
                Log.i("APP","clic en Menu Gasfiteria");
                intent = new Intent(this,BusquedaTecnicoActivity.class);
                intent.putExtra("titulo","Gasfiteria");
                startActivity(intent);
                break;

            case R.id.imageButtonLimpieza:
                Log.i("APP","clic en Menu Limpieza");
                intent = new Intent(this,BusquedaTecnicoActivity.class);
                intent.putExtra("titulo","Limpieza");
                startActivity(intent);
                break;

        }

    }
}
