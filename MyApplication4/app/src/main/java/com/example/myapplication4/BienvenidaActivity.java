package com.example.myapplication4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class BienvenidaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        Button btnVolverInicioSesion = findViewById(R.id.btnLogin);
        Button btnVolverRegistro = findViewById(R.id.btnRegister);


        // Volver al inicio de sesión
        btnVolverInicioSesion.setOnClickListener(v -> {
            Intent intent = new Intent(BienvenidaActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });

        // Ir a consulta
        btnVolverRegistro.setOnClickListener(v -> {
            Intent intent = new Intent(BienvenidaActivity.this, RegistroActivity.class);
            startActivity(intent);
        });


    }
}