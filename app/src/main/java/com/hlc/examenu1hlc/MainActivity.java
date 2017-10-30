package com.hlc.examenu1hlc;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Metodo que al pulsar el boton saludame lanza una nueva actividad, Saludame
     * el onClick esta definido en el xml, por ello recibe un objeto View
     * @param v objeto que hace referencia al boton "Saludame"
     */
    public void saludame(View v){
        Intent i = new Intent(this, Saludame.class);
        startActivity(i);
    }

    /**
     *  Metodo que al pulsar el boton "¿Donde estudias?" te lleva a una ubicacion
     *  el onclick está definido en el xml
     *  @param v objeto que hace referencia al boton "¿Donde estudias?"
     */

    public void dondeStudias(View v){
        String dir = "Calle+Joaquin+Peralta";
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q="+dir));
        startActivity(i);
    }

    /**
     * metodo que al pulsar el boton "Selecciona tu video favorito" te lleva a la aplicacion de youtube si
     * esta instalada en tud ispositivo
     * @param v objeto que hace referencia al boton "Selecciona tu video favorito"
     */
    public void videoFav(View v){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"));
        startActivity(i);
    }


}
