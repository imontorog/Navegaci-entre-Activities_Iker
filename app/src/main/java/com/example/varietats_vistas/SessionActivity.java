package com.example.varietats_vistas;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SessionActivity extends AppCompatActivity {

    private final String tag = "Events";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucess);
        Log.d(tag, "A l'event onCreate()");

        TextView tvBienvenida = findViewById(R.id.tvSuccess);
        Button btnLogout = findViewById(R.id.btnLogout);

        Intent intent = getIntent();
        String usuario = "Usuari";
        if (intent != null && intent.hasExtra("usuario")) {
            usuario = intent.getStringExtra("usuario");
        }

        if (tvBienvenida != null) {
            tvBienvenida.setText("Benvingut/da, " + usuario + "!");
        }

        final String nombreUsuario = usuario;
        if (btnLogout != null) {
            btnLogout.setOnClickListener(v -> {
                Intent intentLogout = new Intent(SessionActivity.this, LogoutActivity.class);

                // Enviament amb Bundle afegit mitjançant intent.putExtras()
                Bundle bundle = new Bundle();
                bundle.putString("usuario", nombreUsuario);
                intentLogout.putExtras(bundle);

                startActivity(intentLogout);
                finish(); // Finalitza l'Activity per evitar acumulació a la pila
            });
        }
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
