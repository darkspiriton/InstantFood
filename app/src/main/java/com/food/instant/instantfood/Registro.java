package com.food.instant.instantfood;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseUser;
import com.parse.ParseException;
import com.parse.SignUpCallback;


public class Registro extends Activity implements View.OnClickListener {
    Button cancelar,aceptar;
    EditText email,pass1,pass2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        Parse.initialize(this, "Bm4UwtB3oJUNYK9Zl1IkE3Ku6djfoUX3u3RYGmAt", "sBNYfW9VvAz0OwQ2ouXdn7LsNIszxQzJyt23URTU");

        aceptar=(Button) findViewById(R.id.buttonAceptar);
        cancelar=(Button) findViewById(R.id.buttonCancelar);
        email=(EditText) findViewById(R.id.etCorreo);
        pass1=(EditText) findViewById(R.id.etPass1);
        pass2=(EditText) findViewById(R.id.etPass2);

        aceptar.setOnClickListener(this);
        cancelar.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.buttonAceptar){
            String pas1=pass1.getText().toString().trim();
            String pas2=pass2.getText().toString().trim();
            String correo=email.getText().toString().trim();

            //verificar si son nulos

            if(pas1.equals(pas2)){
                if (correo.equals("")){
                    Context context = getApplicationContext();
                    CharSequence text = "Ingrese un correo valido";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }else {
                    ParseUser usuario = new ParseUser();
                    usuario.setUsername(correo.toLowerCase());
                    usuario.setEmail(correo.toLowerCase());
                    usuario.setPassword(pas1);
                    usuario.signUpInBackground(new SignUpCallback() {
                        public void done(ParseException e) {
                            if (e == null) {
                                finish();
                            } else {
                                Context context = getApplicationContext();
                                CharSequence text = "Los datos de registro estan incorrectos o el usuario ya existe";
                                int duration = Toast.LENGTH_SHORT;
                                Toast toast = Toast.makeText(context, text, duration);
                                toast.show();
                            }
                        }
                    });
                }
            }else {
                Context context = getApplicationContext();
                CharSequence text = "Las contraseñas no son iguales";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        }else{
            finish();
        }
    }
}

