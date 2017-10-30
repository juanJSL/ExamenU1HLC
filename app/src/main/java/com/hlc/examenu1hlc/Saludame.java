package com.hlc.examenu1hlc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Saludame extends AppCompatActivity {
    private TextView textView;//Mostrara el resultado devuielto por la activituy acepta saludo
    private EditText editText;//Sera el campo que se debe rellenar con el nombre
    private String nombre;//Cadena donde almacenare el valor del editText
    private final static int CODIGO = 0;//Me permite saber si el resultado que devuelve otra actividad va devuelto a esta

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludame);

        //Enlazo cada componente
        textView = (TextView) findViewById(R.id.tvRespuesta);
        editText = (EditText) findViewById(R.id.nombreET);
    }

    /**
     * Este metodo crea un nuevo intent explicito para llamar a la activity AceptaSaludo
     * ademas le pasa el contenido del EditText y un codigo para sincronizarse
     * @param v boton aceptar
     */
    public void aceptar(View v){
        Intent i = new Intent(this, AceptaSaludo.class);
        //Nombre que mandaremos como informacion a la actividad AceptaSaludo
        nombre = editText.getText().toString();
        //Creo unn nuevo Bundle para pasarlo a la nueva activity
        Bundle bundle = new Bundle();
        //Añado la cadena nombre
        bundle.putString("NOMBRE", nombre);
        
        i.putExtras(bundle);

        startActivityForResult(i, CODIGO);
    }

    /**
     * Cuando la activituy AceptaSaludo finaliza y emite una respuesta se llama a este metodo
     * @param requestCode coidgo de la activity que la llamo
     * @param resultCode indica si la respuesta es OK
     * @param data datos incluidos por la activity que se lanzo enn este caso contiene el texto que se debe mostrar
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CODIGO && resultCode == RESULT_OK) {
            textView.setText(data.getExtras().getString("TXT"));
        }
    }
}
