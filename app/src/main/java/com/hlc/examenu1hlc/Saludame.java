package com.hlc.examenu1hlc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Saludame extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private String nombre;
    private final static int CODIGO = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludame);

        //Enlazo cada componente
        textView = (TextView) findViewById(R.id.tvRespuesta);
        editText = (EditText) findViewById(R.id.nombreET);
    }

    public void aceptar(View v){
        Intent i = new Intent(this, AceptaSaludo.class);

        nombre = editText.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("NOMBRE", nombre);

        i.putExtras(bundle);

        startActivityForResult(i, CODIGO);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CODIGO && resultCode == RESULT_OK) {
            textView.setText(data.getExtras().getString("TXT"));
        }
    }
}
