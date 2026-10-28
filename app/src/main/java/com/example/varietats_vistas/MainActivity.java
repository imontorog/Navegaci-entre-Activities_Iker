package com.example.varietats_vistas;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private final String tag = "Events";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "A l'event onCreate()");

        EditText etUsuario = findViewById(R.id.etUsuario);
        EditText etPassword = findViewById(R.id.etPassword);
        Button btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> {
            String usuario = etUsuario.getText().toString().trim();
            String password = etPassword.getText().toString().trim();

            if (usuario.isEmpty() || password.isEmpty()) {
                Toast.makeText(MainActivity.this, "Si us plau, omple tots els camps", Toast.LENGTH_SHORT).show();
                if (usuario.isEmpty()) {
                    etUsuario.setError("El nom d'usuari és obligatori");
                }
                if (password.isEmpty()) {
                    etPassword.setError("La contrasenya és obligatòria");
                }
            } else {
                // Enviament amb intent.putExtra() de MainActivity a SessionActivity
                Intent intentSuccess = new Intent(MainActivity.this, SessionActivity.class);
                intentSuccess.putExtra("usuario", usuario);
                startActivity(intentSuccess);
                finish(); // Evitar que les Activities s'acumulin a la pila
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(tag, "A l'event onStart()");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.d(tag, "A l'event onRestart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(tag, "A l'event onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(tag, "A l'event onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(tag, "A l'event onStop()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(tag, "A l'event onDestroy()");
    }
}
