package com.example.varietats_vistas;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LogoutActivity extends AppCompatActivity {

    private final String tag = "Events";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);
        Log.d(tag, "A l'event onCreate()");

        TextView tvLogoutMessage = findViewById(R.id.tvLogoutMessage);
        Button btnReturnLogin = findViewById(R.id.btnReturnLogin);

        // Recuperació de dades des del Bundle
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("usuario")) {
            String usuario = extras.getString("usuario");
            if (tvLogoutMessage != null) {
                tvLogoutMessage.setText("Sessió tancada per a " + usuario + ".\nFins aviat!");
            }
        }

        if (btnReturnLogin != null) {
            btnReturnLogin.setOnClickListener(v -> {
                Intent intentLogin = new Intent(LogoutActivity.this, MainActivity.class);
                startActivity(intentLogin);
                finish(); // Finalitza l'Activity de Logout
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
