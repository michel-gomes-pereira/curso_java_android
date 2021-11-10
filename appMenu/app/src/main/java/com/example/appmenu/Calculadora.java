package com.example.appmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculadora extends AppCompatActivity {
    EditText txt1,txt2,txt3;
    Button bt1,bt2,bt3,bt4;
    //mapeamento dos objetos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        txt1 = (EditText) findViewById(R.id.txt1);
        txt2 = (EditText)  findViewById(R.id.txt23);
        txt3 = (EditText) findViewById(R.id.txt3);

        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1=Float.valueOf(txt1.getText().toString());
                float n2=Float.valueOf(txt2.getText().toString());
                float res = n1+n2;

                txt3.setText(String.valueOf(res));
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1=Float.valueOf(txt1.getText().toString());
                float n2=Float.valueOf(txt2.getText().toString());
                float res = n1-n2;

                txt3.setText(String.valueOf(res));
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1=Float.valueOf(txt1.getText().toString());
                float n2=Float.valueOf(txt2.getText().toString());
                float res = n1*n2;

                txt3.setText(String.valueOf(res));
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1=Float.valueOf(txt1.getText().toString());
                float n2=Float.valueOf(txt2.getText().toString());
                float res = n1/n2;

                txt3.setText(String.valueOf(res));
            }
        });
    }
}