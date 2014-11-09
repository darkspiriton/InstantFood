package com.food.instant.instantfood;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class Recomendado extends Activity implements View.OnClickListener {
    Button atras;
    ImageView rec1,rec2,rec3,rec4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recomendado);
        rec1 = (ImageView) findViewById(R.id.rec1);
        rec2 = (ImageView) findViewById(R.id.rec2);
        rec3 = (ImageView) findViewById(R.id.rec3);
        rec4 = (ImageView) findViewById(R.id.rec4);

        rec1.setOnClickListener(this);
        rec2.setOnClickListener(this);
        rec3.setOnClickListener(this);
        rec4.setOnClickListener(this);
        atras = (Button) findViewById(R.id.buttAtrasRecomendado);
        atras.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.buttAtrasRecomendado){
            finish();
        }else{
            Intent intent = new Intent(this,Detalle.class);
            startActivity(intent);
        }

    }
}
