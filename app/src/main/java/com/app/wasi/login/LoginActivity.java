package com.app.wasi.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.app.wasi.MainActivity;
import com.app.wasi.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText correo;
    private EditText password;
    private TextView tvRecordar;
    private TextView tvUnete;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //getSupportActionBar().hide();

        tvRecordar = findViewById(R.id.tvRecordar);
        tvUnete = findViewById(R.id.tvUnete);
        login = findViewById(R.id.btn_login);

        login.setOnClickListener(this);
        tvUnete.setOnClickListener(this);
        tvRecordar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login: {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                break;
            }

            case R.id.tvUnete: {
                Intent intent = new Intent(LoginActivity.this, RegistrarUsuarioActivity.class);
                startActivity(intent);
                break;
            }

            case R.id.tvRecordar: {
                Intent intent = new Intent(LoginActivity.this, RecuperarClaveActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
