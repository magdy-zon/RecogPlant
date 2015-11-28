package com.example.magdy.recogplant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class galeria extends Activity implements View.OnClickListener{

    private ImageView visor, im01, im02, im03, im04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.galeria);

        visor = (ImageView)findViewById(R.id.imageGallery);
        im01 = (ImageView)findViewById(R.id.school);
        im02 = (ImageView)findViewById(R.id.abstr);
        im03 = (ImageView)findViewById(R.id.iphone);
        im04 = (ImageView)findViewById(R.id.tower);

        im01.setOnClickListener(this);
        im02.setOnClickListener(this);
        im03.setOnClickListener(this);
        im04.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent imageVista;

        switch (v.getId()) {
            case R.id.school:
                visor.setImageResource(R.drawable.school);
                break;

            case R.id.abstr:
                visor.setImageResource(R.drawable.abst);
                break;

            case R.id.iphone:
                visor.setImageResource(R.drawable.iphone);
                break;

            case R.id.tower:
                visor.setImageResource(R.drawable.tower);
                break;
        }

    }
}
