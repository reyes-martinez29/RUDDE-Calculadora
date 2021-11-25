package com.rudde.ruddeclaculadora;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonMendezSanchez;
    private Button buttonRamirezBarrera;
    private Button buttonDanielBarron;
    private Button buttonRomeroSalyano;
    private Button buttonReyesMartinez;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMendezSanchez = findViewById(R.id.buttonMendezSanchez);
        buttonMendezSanchez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirAreadeunCubo();
            }
        });
        buttonRamirezBarrera = findViewById(R.id.buttonRamirezBarrera);
        buttonRamirezBarrera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirSeno();
            }
        });
        buttonDanielBarron = findViewById(R.id.buttonDanielBarron);
        buttonDanielBarron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirAceleracion();
            }
        });
        buttonRomeroSalyano = findViewById(R.id.buttonRomeroSalyano);
        buttonRomeroSalyano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirValorAbsoluto();
            }
        });
        buttonReyesMartinez = findViewById(R.id.buttonReyesMartinez);
        buttonReyesMartinez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirNumeroRandom();
            }
        });
    }

    private void abrirNumeroRandom() {
        Intent intent = new Intent(this,NumeroRandomActivity.class);
        startActivity(intent);
    }

    private void abrirValorAbsoluto() {
        Intent intent = new Intent(this,ValorAbsolutoActivity.class);
        startActivity(intent);
    }

    private void abrirAceleracion() {
        Intent intent = new Intent(this,AceleracionActivity.class);
        startActivity(intent);
    }

    private void abrirSeno() {
        Intent intent = new Intent(this,SenoActivity.class);
        startActivity(intent);
    }

    private void abrirAreadeunCubo() {
        Intent intent = new Intent(this,AreadeunCuboActivity.class);
        startActivity(intent);
    }
}