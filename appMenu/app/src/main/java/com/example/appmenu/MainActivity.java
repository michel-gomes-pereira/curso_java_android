package com.example.appmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = (Button) findViewById(R.id.btCalc);
        bt2 = (Button) findViewById(R.id.btTresIguais);
        bt3 = (Button) findViewById(R.id.btCacaNiquel);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calculadora = new Intent(MainActivity.this,Calculadora.class);
                startActivity(calculadora);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tresiguais = new Intent(MainActivity.this,tresiguais.class);
                startActivity(tresiguais);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cacaniquel = new Intent(MainActivity.this,cacaniquel.class);
                startActivity(cacaniquel);
            }
        });
    }
}