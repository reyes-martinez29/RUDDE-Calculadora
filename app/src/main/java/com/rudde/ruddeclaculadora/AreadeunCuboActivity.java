package com.rudde.ruddeclaculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AreadeunCuboActivity extends AppCompatActivity {
//MENDEZ SANCHEZ RICARDO ANTONIO 5IM9
    float arista;
    float resultado;
    EditText Aristas, Resultados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areadeun_cubo);


        Aristas = findViewById(R.id.aristas);
        Resultados = findViewById(R.id.resultado);
        Resultados.setEnabled(false);


        Button btn;
        btn = findViewById(R.id.calcular);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculo();
            }
        });
    }

    public void calculo() {
        arista = Float.parseFloat(Aristas.getText().toString());
        resultado = (arista*arista)*(6);
        Resultados.setText(String.valueOf(resultado));
    }

}