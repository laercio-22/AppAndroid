package com.example.administrador.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class resultado extends AppCompatActivity {

    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        textResult = (TextView) findViewById(R.id.textView);

        Bundle bundle = getIntent().getExtras();

        textResult.setText(bundle.getString("Texto"));

    }
}
