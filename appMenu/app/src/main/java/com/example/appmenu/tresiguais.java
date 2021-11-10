package com.example.appmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class tresiguais extends AppCompatActivity {
    Button botao,botao2,botao3;
    ImageView img1,img2,img3;
    TextView venceu;
    public void sorteio(){
        Random meuAleatorio = new Random();
        int number = meuAleatorio.nextInt(3) +1;
        int number2 = meuAleatorio.nextInt(3) +1;
        int number3 = meuAleatorio.nextInt(3) +1;

               /* if(number==1){
                    img1.setImageResource(R.drawable.um);
                }
                if(number==2){
                    img2.setImageResource(R.drawable.dois);
                }
                if(number==3){
                    img3.setImageResource(R.drawable.tres);
                }*/

        switch(number){
            case 1:
                img1.setImageResource(R.drawable.um);
                break;
            case 2:
                img1.setImageResource(R.drawable.dois);
                break;
            case 3:
                img1.setImageResource(R.drawable.tres);
                break;
        }
        switch(number2){
            case 1:
                img2.setImageResource(R.drawable.um);
                break;
            case 2:
                img2.setImageResource(R.drawable.dois);
                break;
            case 3:
                img2.setImageResource(R.drawable.tres);
                break;
        }
        switch(number3){
            case 1:
                img3.setImageResource(R.drawable.um);
                break;
            case 2:
                img3.setImageResource(R.drawable.dois);
                break;
            case 3:
                img3.setImageResource(R.drawable.tres);
                break;
        }
        if(number==number2 && number2==number3){
            venceu.setText("Você Ganhou");
            botao.setVisibility(View.GONE);

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tresiguais);

        botao = (Button) findViewById(R.id.bt);
        botao2 = (Button) findViewById(R.id.btClose);
        botao3 = (Button) findViewById(R.id.btRestart);
        img1 = (ImageView) findViewById(R.id.figura);
        img2 = (ImageView) findViewById(R.id.figura2);
        img3 = (ImageView) findViewById(R.id.figura3);
        venceu = (TextView) findViewById(R.id.txtGanhou);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sorteio();
            }
        });
        botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recreate();
            }
        });

        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Intent cacaniquel = new Intent(MainActivity.this,cacaniquel.class);
               // startActivity(cacaniquel);
                Intent main = new Intent(tresiguais.this,MainActivity.class);
                startActivity(main);
            }
        });

    }
}