package com.example.appmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class cacaniquel extends AppCompatActivity {

    Button bt1,bt2,bt3,bt4;

    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9;
    TextView texto2,texto3;
    int numeroPontos,seq,contador;

    public void sorteio(){
        Random meuAleatorio = new Random();
        int number1 = meuAleatorio.nextInt(6) +1;
        int number2 = meuAleatorio.nextInt(6) +1;
        int number3 = meuAleatorio.nextInt(6) +1;
        int number4 = meuAleatorio.nextInt(6) +1;
        int number5 = meuAleatorio.nextInt(6) +1;
        int number6 = meuAleatorio.nextInt(6) +1;
        int number7 = meuAleatorio.nextInt(6) +1;
        int number8 = meuAleatorio.nextInt(6) +1;
        int number9 = meuAleatorio.nextInt(6) +1;


        switch(number1){
            case 1:
                img1.setImageResource(R.drawable.bulbasaur);
                break;
            case 2:
                img1.setImageResource(R.drawable.charmander);
                break;
            case 3:
                img1.setImageResource(R.drawable.squirtle);
                break;
            case 4 :
                img1.setImageResource(R.drawable.machop);
                break;
            case 5 :
                img1.setImageResource(R.drawable.machamp);
                break;
            case 6 :
                img1.setImageResource(R.drawable.chikorita);
                break;
        }
        switch(number2){
            case 1:
                img2.setImageResource(R.drawable.bulbasaur);
                break;
            case 2:
                img2.setImageResource(R.drawable.charmander);
                break;
            case 3:
                img2.setImageResource(R.drawable.squirtle);
                break;
            case 4 :
                img2.setImageResource(R.drawable.machop);
                break;
            case 5 :
                img2.setImageResource(R.drawable.machamp);
                break;
            case 6 :
                img2.setImageResource(R.drawable.chikorita);
                break;
        }
        switch(number3){
            case 1:
                img3.setImageResource(R.drawable.bulbasaur);
                break;
            case 2:
                img3.setImageResource(R.drawable.charmander);
                break;
            case 3:
                img3.setImageResource(R.drawable.squirtle);
                break;
            case 4 :
                img3.setImageResource(R.drawable.machop);
                break;
            case 5 :
                img3.setImageResource(R.drawable.machamp);
                break;
            case 6 :
                img3.setImageResource(R.drawable.chikorita);
                break;
        }
        switch(number4){
            case 1:
                img4.setImageResource(R.drawable.bulbasaur);
                break;
            case 2:
                img4.setImageResource(R.drawable.charmander);
                break;
            case 3:
                img4.setImageResource(R.drawable.squirtle);
                break;
            case 4 :
                img4.setImageResource(R.drawable.machop);
                break;
            case 5 :
                img4.setImageResource(R.drawable.machamp);
                break;
            case 6 :
                img4.setImageResource(R.drawable.chikorita);
                break;
        }
        switch(number5){
            case 1:
                img5.setImageResource(R.drawable.bulbasaur);
                break;
            case 2:
                img5.setImageResource(R.drawable.charmander);
                break;
            case 3:
                img5.setImageResource(R.drawable.squirtle);
                break;
            case 4 :
                img5.setImageResource(R.drawable.machop);
                break;
            case 5 :
                img5.setImageResource(R.drawable.machamp);
                break;
            case 6 :
                img5.setImageResource(R.drawable.chikorita);
                break;
        }
        switch(number6){
            case 1:
                img6.setImageResource(R.drawable.bulbasaur);
                break;
            case 2:
                img6.setImageResource(R.drawable.charmander);
                break;
            case 3:
                img6.setImageResource(R.drawable.squirtle);
                break;
            case 4 :
                img6.setImageResource(R.drawable.machop);
                break;
            case 5 :
                img6.setImageResource(R.drawable.machamp);
                break;
            case 6 :
                img6.setImageResource(R.drawable.chikorita);
                break;
        }
        switch(number7){
            case 1:
                img7.setImageResource(R.drawable.bulbasaur);
                break;
            case 2:
                img7.setImageResource(R.drawable.charmander);
                break;
            case 3:
                img7.setImageResource(R.drawable.squirtle);
                break;
            case 4 :
                img7.setImageResource(R.drawable.machop);
                break;
            case 5 :
                img7.setImageResource(R.drawable.machamp);
                break;
            case 6 :
                img7.setImageResource(R.drawable.chikorita);
                break;
        }
        switch(number8){
            case 1:
                img8.setImageResource(R.drawable.bulbasaur);
                break;
            case 2:
                img8.setImageResource(R.drawable.charmander);
                break;
            case 3:
                img8.setImageResource(R.drawable.squirtle);
                break;
            case 4 :
                img8.setImageResource(R.drawable.machop);
                break;
            case 5 :
                img8.setImageResource(R.drawable.machamp);
                break;
            case 6 :
                img8.setImageResource(R.drawable.chikorita);
                break;
        }
        switch(number9){
            case 1:
                img9.setImageResource(R.drawable.bulbasaur);
                break;
            case 2:
                img9.setImageResource(R.drawable.charmander);
                break;
            case 3:
                img9.setImageResource(R.drawable.squirtle);
                break;
            case 4 :
                img9.setImageResource(R.drawable.machop);
                break;
            case 5 :
                img9.setImageResource(R.drawable.machamp);
                break;
            case 6 :
                img9.setImageResource(R.drawable.chikorita);
                break;
        }

        if(number1==number2 && number2==number3){
            //texto1.setText("Você Ganhou");

            numeroPontos=numeroPontos+1;
            texto2.setText(String.valueOf(numeroPontos));

        }//horizontal
        if(number4==number5 && number5==number6){
            numeroPontos=numeroPontos+1;
            texto2.setText(String.valueOf(numeroPontos));
        }//horizontal
        if (number7==number8 && number7==number9){
            //texto1.setText("Você Ganhou");
            numeroPontos=numeroPontos+1;
            texto2.setText(String.valueOf(numeroPontos));

        }//horizontal

        if (number1==number4 && number1==number7){
            //texto1.setText("Você Ganhou");
            numeroPontos=numeroPontos+1;
            texto2.setText(String.valueOf(numeroPontos));

        }//vertical
        if((number2==number5 && number2==number8)){
            //texto1.setText("Você Ganhou");
            numeroPontos=numeroPontos+1;
            texto2.setText(String.valueOf(numeroPontos));

        }//vertical
        if (number3==number6 && number3==number9){
            numeroPontos=numeroPontos+1;
            texto2.setText(String.valueOf(numeroPontos));
        }
        if(number1==number5 && number1==number9){


            //texto1.setText("Você Ganhou");
            numeroPontos=numeroPontos+1;
            texto2.setText(String.valueOf(numeroPontos));

        }//diagonal

        if(number3==number5 && number3==number7){
           // texto1.setText("Você Ganhou");
            numeroPontos=numeroPontos+1;
            texto2.setText(String.valueOf(numeroPontos));

        }//diagonal


        if( (number1==number4 && number1==number7) & (number2==number5 && number5 == number8)){

            seq=2;


        }
        if( (number2==number5 && number2==number8) & (number3==number6 && number6 == number9)){

            seq=2;


        }
        if( (number1==number4 && number1==number7) & (number3==number6 && number6 == number9)){

            seq=2;


        }
        if( (number1==number4 && number1==number7) & (number1==number5 && number5 == number9)){

            seq=2;


        }
        if( (number1==number4 && number1==number7) & (number3==number5 && number5 == number7)){

            seq=2;


        }
        if( (number2==number5 && number2==number8) & (number1==number5 && number5 == number9)){

            seq=2;


        }
        if( (number2==number5 && number2==number8) & (number3==number5 && number5 == number7)){

            seq=2;


        }
        if( (number3==number6 && number6==number9) & (number3==number5 && number5 == number7)){

            seq=2;


        }
        if( (number3==number6 && number6==number9) & (number1==number5 && number5 == number9)){

            seq=2;


        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cacaniquel);

        bt1 = (Button) findViewById(R.id.btPlay);
        bt2 = (Button) findViewById(R.id.btClose2);
        bt3 = (Button) findViewById(R.id.btRestart2);
        bt4 = (Button) findViewById(R.id.btContar);
        img1 = (ImageView) findViewById(R.id.picture);
        img2 = (ImageView) findViewById(R.id.picture2);
        img3 = (ImageView) findViewById(R.id.picture3);
        img4 = (ImageView) findViewById(R.id.picture4);
        img5 = (ImageView) findViewById(R.id.picture5);
        img6 = (ImageView) findViewById(R.id.picture6);
        img7 = (ImageView) findViewById(R.id.picture7);
        img8 = (ImageView) findViewById(R.id.picture8);
        img9 = (ImageView) findViewById(R.id.picture9);

        texto2= (TextView) findViewById(R.id.pontosResultado);
        texto3 = (TextView) findViewById(R.id.txt23);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sorteio();
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recreate();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador=0;
                seq=0;
                sorteio();

                while(seq==0){
                    sorteio();
                    contador=contador+1;
                }
                texto3.setText(String.valueOf(contador));
            }
        });
    }
    }
