package com.food.instant.instantfood;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Restaurante extends Activity implements View.OnClickListener {
    Button atras,res1,res2,res3,res4,res5,res6,res7,res8,res9,res10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante);
        res1 = (Button) findViewById(R.id.rest1);
        res2 = (Button) findViewById(R.id.rest2);
        res3 = (Button) findViewById(R.id.rest3);
        res4 = (Button) findViewById(R.id.rest4);
        res5 = (Button) findViewById(R.id.rest5);
        res6 = (Button) findViewById(R.id.rest6);
        res7 = (Button) findViewById(R.id.rest7);
        res8 = (Button) findViewById(R.id.rest8);
        res9 = (Button) findViewById(R.id.rest9);
        res10 = (Button) findViewById(R.id.rest10);


        res1.setOnClickListener(this);
        res2.setOnClickListener(this);
        res3.setOnClickListener(this);
        res4.setOnClickListener(this);
        res5.setOnClickListener(this);
        res6.setOnClickListener(this);
        res7.setOnClickListener(this);
        res8.setOnClickListener(this);
        res9.setOnClickListener(this);
        res10.setOnClickListener(this);

        atras = (Button) findViewById(R.id.buttAtrasRestaurante);
        atras.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.buttAtrasRestaurante){
            finish();
        }else{
            Intent intent = new Intent(this,Detalle.class);
            startActivity(intent);
        }

    }
}
