package com.example.magdy.recogplant;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class menu_principal extends Activity implements View.OnClickListener {

    private View menu01;
    private View menu02;
    private View menu03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/menulis.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());

        menu01 = findViewById(R.id.comenzemos);
        menu02 = findViewById(R.id.galeria);
        menu03 = findViewById(R.id.creditos);

        menu01.setOnClickListener(this);
        menu02.setOnClickListener(this);
        menu03.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent navegar;

        switch (v.getId()){
            case R.id.comenzemos:
                navegar = new Intent(this, MainActivity.class);
                startActivity(navegar);
                break;

            case R.id.galeria:
                navegar = new Intent(this, galeria.class);
                startActivity(navegar);
                break;

            case R.id.creditos:
                navegar = new Intent(this, MainActivity.class);
                startActivity(navegar);
                break;
        }
    }

    // Instanciacion de lib para cambiar tipografía
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
