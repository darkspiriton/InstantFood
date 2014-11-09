package com.food.instant.instantfood;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;



public class Categorias extends Activity implements View.OnClickListener {

    ImageView romantico,desayuno,familia,child,turista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
        romantico = (ImageView) findViewById(R.id.romantica);
        desayuno = (ImageView) findViewById(R.id.desayuno);
        familia = (ImageView) findViewById(R.id.familia);
        child = (ImageView) findViewById(R.id.niños);
        turista = (ImageView) findViewById(R.id.turista);

        romantico.setOnClickListener(this);
        desayuno.setOnClickListener(this);
        familia.setOnClickListener(this);
        child.setOnClickListener(this);
        turista.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
            Intent intent = new Intent(this,Restaurante.class);
            startActivity(intent);
    }
}
