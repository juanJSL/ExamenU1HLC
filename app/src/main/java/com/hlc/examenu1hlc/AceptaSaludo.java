package com.hlc.examenu1hlc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AceptaSaludo extends AppCompatActivity {
    private TextView textView;//En el se mostrara un texto ademas del nombre que introdujo el usuario en la activity Saludame

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acepta_saludo);

        Bundle bundle = getIntent().getExtras();//Es el contenido que recibe de la activity Saludame

        String nombre = bundle.getString("NOMBRE");//Nombre recibido de Saludame

        textView = (TextView) findViewById(R.id.aceptaSaludoTV);
        textView.setText("Hola " + nombre + ". Esto es muy facil peroo date pisa");


    }

    /**
     * Finaliza esta actividad y manda el resultado a la actividad Saludame,
     * para ello crea un intent con una cadena de texto que despues sera mostrada por pantalla
     * @param v boton Acepto tu saludo
     */
    public void aceptaSaludo(View v){
        String texto = "Eres muy amable";
        Intent i = new Intent();
        i.putExtra("TXT", texto);
        setResult(RESULT_OK, i);
        finish();
    }

    /**
     * Finaliza esta actividad y manda el resultado a la actividad Saludame,
     * para ello crea un intent con una cadena de texto que despues sera mostrada por pantalla
     * @param v boton Acepto tu saludo
     */
    public void noAceptaSaludo(View v){
        String texto = "Recuerdame no volver a saludarte";
        Intent i = new Intent();
        i.putExtra("TXT", texto);
        setResult(RESULT_OK, i);
        finish();
    }




}
