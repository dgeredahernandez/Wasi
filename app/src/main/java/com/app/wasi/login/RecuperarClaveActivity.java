package com.app.wasi.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.app.wasi.R;

public class RecuperarClaveActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnRecuperar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_clave);

        btnRecuperar = findViewById(R.id.btnRecuperar);

        btnRecuperar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(
                RecuperarClaveActivity.this,
                "Gracias, ahora revisar su bandeja de correo.",
                Toast.LENGTH_LONG
        ).show();

        Intent intent = new Intent(RecuperarClaveActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}
