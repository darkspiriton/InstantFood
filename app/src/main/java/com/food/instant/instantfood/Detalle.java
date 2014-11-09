package com.food.instant.instantfood;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Detalle extends Activity implements View.OnClickListener {
    Button atras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        atras = (Button) findViewById(R.id.buttAtrasDetalle);
        atras.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        finish();
    }
}
