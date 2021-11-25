package com.rudde.ruddeclaculadora;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NumeroRandomActivity extends AppCompatActivity implements View.OnFocusChangeListener {

    private EditText NumeroX;
    private EditText NumeroY;
    private TextView NumeroRandom;
    private Integer nx , ny , nr;
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero_random);

        btn = findViewById(R.id.buttonGeneraNum);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickGenerarNumero();
            }
        });

        NumeroX = findViewById(R.id.editTextNumber5);
        NumeroY = findViewById(R.id.editTextNumber6);
        NumeroRandom = (TextView)findViewById(R.id.textViewNumRandom);

        NumeroRandom.setText(" ");

        //NumeroRandom.setEnabled(false);

    }

    public void onClickGenerarNumero(){

        nx = Integer.parseInt(NumeroX.getText().toString());
        ny = Integer.parseInt(NumeroY.getText().toString());

        nr = (int)(Math.random() * (ny - nx +1)+ nx);
        NumeroRandom.setText(String.valueOf("Tu numero es: " + nr));


        NumeroX.setText("");
        NumeroY.setText("");
    }

    @Override
    public void onFocusChange(View view, boolean b) {
        if( !b) {
            onClickGenerarNumero();
        }

    }
}