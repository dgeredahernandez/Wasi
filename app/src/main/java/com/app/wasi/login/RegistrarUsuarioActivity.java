package com.app.wasi.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.app.wasi.R;

public class RegistrarUsuarioActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnRegistrar;
    private TextView tvIrLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_usuario);

        btnRegistrar = findViewById(R.id.btnRegistrar);
        tvIrLogin = findViewById(R.id.tvIniciarSession);

        btnRegistrar.setOnClickListener(this);
        tvIrLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnRegistrar: {
                Toast.makeText(
                        RegistrarUsuarioActivity.this,
                        "Gracias, usuario registrado correctamente.",
                        Toast.LENGTH_LONG
                ).show();
                Intent intent = new Intent(RegistrarUsuarioActivity.this, LoginActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                break;
            }

            case R.id.tvIniciarSession: {
                Intent intent = new Intent(RegistrarUsuarioActivity.this, LoginActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
