package com.food.instant.instantfood;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.LogInCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseUser;




public class Login extends Activity implements View.OnClickListener {
    Button butIngresar;
    EditText correo,pass;
    TextView butRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Parse.initialize(this, "Bm4UwtB3oJUNYK9Zl1IkE3Ku6djfoUX3u3RYGmAt", "sBNYfW9VvAz0OwQ2ouXdn7LsNIszxQzJyt23URTU");

        setContentView(R.layout.activity_login);

        butIngresar = (Button) findViewById(R.id.buttonIngresar);
        butRegistrar = (TextView) findViewById(R.id.tvRegistro);
        correo = (EditText) findViewById(R.id.etCorreo);
        pass = (EditText) findViewById(R.id.etPass);

        butIngresar.setOnClickListener(this);
        butRegistrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.buttonIngresar){

            String pas1=pass.getText().toString().trim();
            String email=correo.getText().toString().trim().toLowerCase();

            ParseUser.logInInBackground(email, pas1, new LogInCallback() {
                public void done(ParseUser user, ParseException e) {
                    if (user != null) {
                        Intent intent = new Intent();
                        intent.putExtra("usuario",user.getUsername());
                        intent.setClass(Login.this,MenuPrincipal.class);
                        startActivity(intent);

                    } else {
                        Context context = getApplicationContext();
                        CharSequence text = "El usuario o la contraseña son incorrectos";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                    }
                }
            });

        }if (view.getId()==R.id.tvRegistro) {
            Intent intent = new Intent(this,Registro.class);
            startActivity(intent);
        }

    }

}
