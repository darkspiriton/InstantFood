package com.food.instant.instantfood;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Favorito extends Activity implements View.OnClickListener {
    Button atras;
    Button fav1,fav2,fav3,fav4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorito);

        fav1 = (Button) findViewById(R.id.restF1);
        fav2 = (Button) findViewById(R.id.restF2);
        fav3 = (Button) findViewById(R.id.restF3);
        fav4 = (Button) findViewById(R.id.restF4);

        fav1.setOnClickListener(this);
        fav2.setOnClickListener(this);
        fav3.setOnClickListener(this);
        fav4.setOnClickListener(this);
        atras = (Button) findViewById(R.id.buttAtrasFavorito);
        atras.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.buttAtrasFavorito){
            finish();
        }else{
            Intent intent = new Intent(this,Detalle.class);
            startActivity(intent);
        }

    }

}
