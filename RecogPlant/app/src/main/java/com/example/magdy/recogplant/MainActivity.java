package com.example.magdy.recogplant;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;


public class MainActivity extends Activity implements View.OnClickListener {

    protected TextView personalized;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/menulis.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());

        View t1 = findViewById(R.id.inicio);
        t1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent abrir = new Intent(this, view001.class);
        startActivity(abrir);
        Toast.makeText(this, "Espere...", Toast.LENGTH_SHORT).show();
    }

    // Instanciacion de lib para cambiar tipografía
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

}
