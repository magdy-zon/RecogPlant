package com.example.magdy.recogplant;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class view014 extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view014);

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/menulis.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());

        View op1 = findViewById(R.id.op1);
        View op2 = findViewById(R.id.op2);
        op1.setOnClickListener(this);
        op2.setOnClickListener(this);
    }

    public void onClick(View view) {
        Intent abrir;
        switch (view.getId()) {
            case R.id.op1:
                abrir = new Intent(this, viewf013.class);
                startActivity(abrir);
                break;

            case R.id.op2:
                abrir = new Intent(this, view015.class);
                startActivity(abrir);
                break;
        }

    }

    // Instanciacion de lib para cambiar tipografía
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
