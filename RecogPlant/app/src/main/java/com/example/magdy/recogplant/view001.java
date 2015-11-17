package com.example.magdy.recogplant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class view001 extends Activity implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view001);

        View op1 = findViewById(R.id.op1);
        View op2 = findViewById(R.id.op2);
        op1.setOnClickListener(this);
        op2.setOnClickListener(this);
    }

    public void onClick(View view) {
        Intent abrir;
        switch (view.getId()) {
            case R.id.op1:
                abrir = new Intent(this, viewf001.class);
                startActivity(abrir);
                break;

            case R.id.op2:
                abrir = new Intent(this, view002.class);
                startActivity(abrir);
                break;
        }

    }
}
