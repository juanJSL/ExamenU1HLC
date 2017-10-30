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

    public void saludame(View v){
        Intent i = new Intent(this, Saludame.class);
        startActivity(i);
    }

    public void dondeStudias(View v){
        String dir = "Calle+Joaquin+Peralta";
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q="+dir));
        startActivity(i);
    }

    public void videoFav(View v){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"));
        startActivity(i);
    }


}
