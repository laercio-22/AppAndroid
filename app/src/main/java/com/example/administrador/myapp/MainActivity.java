package com.example.administrador.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView destinatario;

    private TextView remetente;

    private String newDestinatarioText = "From, Karol";

    private String newRemetentText = "Happy Birthay, Laercio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        destinatario= (TextView) findViewById(R.id.destinatario);
        remetente = (TextView) findViewById(R.id.remetente);
}

    public void invertNames(View view){

        String destinatarioText = (String)destinatario.getText();
        String remetentText = (String)remetente.getText();

        destinatario.setText(newDestinatarioText);
        remetente.setText(newRemetentText);

        newDestinatarioText = destinatarioText;
        newRemetentText = remetentText;
    }

    public void sendCard(View veiew){

        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("Texto"," Enviado com sucesso "+newDestinatarioText);
        startActivity(intent);

    }
}
