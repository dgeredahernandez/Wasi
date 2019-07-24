package com.app.wasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class BusquedaTecnicoActivity extends AppCompatActivity implements ListaTecnicoFragment.OnListFragmentInteractionListener, View.OnClickListener {

    ImageButton btnHome;
    String titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda_tecnico);

        btnHome = findViewById(R.id.imageButtonHome2);
        Bundle extras = getIntent().getExtras();
        titulo = extras.get("titulo").toString();
        setTitle(titulo);

        btnHome.setOnClickListener(this);
    }

    @Override
    public void onListFragmentInteraction(Tecnico item) {

        Log.i("APP",item.getNombres());

        Intent intent = new Intent(this, ReservaActivity.class);
        intent.putExtra("titulo",titulo);
        startActivity(intent);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.imageButtonHome2:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
        }

    }

}
