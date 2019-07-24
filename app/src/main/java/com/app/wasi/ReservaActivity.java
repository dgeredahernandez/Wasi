package com.app.wasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ReservaActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnHome;
    Button btnBuscarOtro;
    String titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserva);

        btnHome = findViewById(R.id.imageButtonHomeReserva);
        btnBuscarOtro = findViewById(R.id.btn_buscarOtro);

        btnHome.setOnClickListener(this);
        btnBuscarOtro.setOnClickListener(this);

        Bundle extras = getIntent().getExtras();
        titulo = extras.get("titulo").toString();

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.imageButtonHomeReserva:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_buscarOtro:
                intent = new Intent(this, BusquedaTecnicoActivity.class);
                intent.putExtra("titulo", titulo);
                startActivity(intent);
                break;
        }
    }
}
