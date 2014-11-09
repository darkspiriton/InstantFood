package com.food.instant.instantfood;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuPrincipal extends Activity implements View.OnClickListener{
    TextView tvNick;
    ImageView mapa,restaurante,recomendado,reservar,favorito;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        String user = getIntent().getStringExtra("usuario");

        tvNick = (TextView) findViewById(R.id.tvUsuario);
        tvNick.setText("Hola "+user);

        mapa = (ImageView) findViewById(R.id.mapa);
        restaurante = (ImageView) findViewById(R.id.restaurante);
        recomendado = (ImageView) findViewById(R.id.recomendado);
        reservar = (ImageView) findViewById(R.id.reservar);
        favorito = (ImageView) findViewById(R.id.favorito);

        mapa.setOnClickListener(this);
        restaurante.setOnClickListener(this);
        recomendado.setOnClickListener(this);
        reservar.setOnClickListener(this);
        favorito.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.mapa){
            Intent intent = new Intent(this,Mapa.class);
            startActivity(intent);
        }if(view.getId()==R.id.restaurante){
            Intent intent = new Intent(this,Categorias.class);
            startActivity(intent);
        }if(view.getId()==R.id.recomendado){
            Intent intent = new Intent(this,Recomendado.class);
            startActivity(intent);
        }if(view.getId()==R.id.reservar){
            Intent intent = new Intent(this,Categorias.class);
            startActivity(intent);
        }if(view.getId()==R.id.favorito){
            Intent intent = new Intent(this,Favorito.class);
            startActivity(intent);
        }
    }
}
