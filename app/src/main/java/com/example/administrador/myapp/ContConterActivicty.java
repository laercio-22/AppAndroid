package com.example.administrador.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ContConterActivicty extends AppCompatActivity {

    TextView timeA;
    TextView timeB;

    private int pontuacaoA = 0;

    private int pontuacaoB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cont_conter_activicty);
        timeA = (TextView) findViewById(R.id.timeA);
        timeB = (TextView) findViewById(R.id.timeB);
    }

    public void zerar(View view){
        pontuacaoA = 0;
        timeA.setText(String.valueOf(pontuacaoA));
        pontuacaoB = 0;
        timeB.setText(String.valueOf(pontuacaoB));
    }

    public void addPontoA(View view){
        if(view.getId() == R.id.tresPontosA){
            pontuacaoA+=3;
        }
        if(view.getId() == R.id.doisPontosA){
            pontuacaoA+=2;
        }
        if(view.getId() == R.id.umPontoA){
            pontuacaoA++;
        }

        timeA.setText(String.valueOf(pontuacaoA));
    }

    public void addPontoB(View view){
        if(view.getId() == R.id.tresPontosB){
            pontuacaoB+=3;
        }
        if(view.getId() == R.id.doisPontosB){
            pontuacaoB+=2;
        }
        if(view.getId() == R.id.umPontoB){
            pontuacaoB++;
        }
        timeB.setText(String.valueOf(pontuacaoB));
    }

    public void ganhador(View view){
        Intent intent = new Intent(this,resultado.class);
        if(pontuacaoA>pontuacaoB){
            intent.putExtra("Texto","Time A ganhou");
        }else{
            if(pontuacaoA<pontuacaoB){
                intent.putExtra("Texto","Time B ganhou");
            }
            else{
                intent.putExtra("Texto","Empatou");
            }
        }
        startActivity(intent);
    }

}
