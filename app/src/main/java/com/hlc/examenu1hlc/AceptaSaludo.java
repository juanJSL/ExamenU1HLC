package com.hlc.examenu1hlc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AceptaSaludo extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acepta_saludo);

        Bundle bundle = getIntent().getExtras();

        String nombre = bundle.getString("NOMBRE");

        textView = (TextView) findViewById(R.id.aceptaSaludoTV);
        textView.setText("Hola " + nombre + ". Esto es muy facil peroo date pisa");


    }

    public void aceptaSaludo(View v){
        String texto = "Eres muy amable";
        Intent i = new Intent();
        i.putExtra("TXT", texto);
        setResult(RESULT_OK, i);
        finish();
    }

    public void noAceptaSaludo(View v){
        String texto = "Recuerdame no volver a saludarte";
        Intent i = new Intent();
        i.putExtra("TXT", texto);
        setResult(RESULT_OK, i);
        finish();
    }




}
