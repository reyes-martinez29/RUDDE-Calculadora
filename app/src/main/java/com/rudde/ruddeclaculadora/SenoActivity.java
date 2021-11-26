package com.rudde.ruddeclaculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SenoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seno);
    }

    Double numero1,resultado;


    public void onClicknumero1(View miView){
        TextView tv = findViewById(R.id.textView2);
        String value = tv.getText().toString();
        tv.setText(value + "1");
    }

    public void onClicknumero2(View miView){
        TextView tv = findViewById(R.id.textView2);
        String value = tv.getText().toString();
        tv.setText(value + "2");
    }

    public void onClicknumero3(View miView){
        TextView tv = findViewById(R.id.textView2);
        String value = tv.getText().toString();
        tv.setText(value + "3");
    }

    public void onClicknumero4(View miView){
        TextView tv = findViewById(R.id.textView2);
        String value = tv.getText().toString();
        tv.setText(value + "4");
    }
    public void onClicknumero5(View miView){
        TextView tv = findViewById(R.id.textView2);
        String value = tv.getText().toString();
        tv.setText(value + "5");
    }
    public void onClicknumero6(View miView){
        TextView tv = findViewById(R.id.textView2);
        String value = tv.getText().toString();
        tv.setText(value + "6");
    }
    public void onClicknumero7(View miView){
        TextView tv = findViewById(R.id.textView2);
        String value = tv.getText().toString();
        tv.setText(value + "7");
    }
    public void onClicknumero8(View miView){
        TextView tv = findViewById(R.id.textView2);
        String value = tv.getText().toString();
        tv.setText(value + "8");
    }
    public void onClicknumero9(View miView){
        TextView tv = findViewById(R.id.textView2);
        String value = tv.getText().toString();
        tv.setText(value + "9");
    }
    public void onClicknumero0(View miView){
        TextView tv = findViewById(R.id.textView2);
        String value = tv.getText().toString();
        tv.setText(value + "0");
    }



    public void Sen(View miView){
        TextView tv=(TextView)findViewById(R.id.textView2);
        try{
            numero1 = Double.parseDouble(tv.getText().toString());
            double rd= Math.toRadians(numero1);
            resultado= Math.sin(rd);
            tv.setText(String.valueOf(resultado));

        }catch (NumberFormatException nfe){}
    }



    public void onClickLimpia(View miView)
    {
        numero1=0.0;
        TextView tv = (TextView) findViewById(R.id.textView2) ;
        tv.setText("");
    }
}