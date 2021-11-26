package com.rudde.ruddeclaculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ValorAbsolutoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valor_absoluto);
    }

    int result, number;

    public void onClickCalcula(View miView){
        TextView numb = findViewById(R.id.number);
        number = Integer.parseInt(numb.getText().toString());
        try{
            if(number < 0){
                result = number * (-1);
            }
            if(number > 0){
                result = number;
            }
            if(number == 0){
                result = 0;
            }
            numb.setText(String.valueOf(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}