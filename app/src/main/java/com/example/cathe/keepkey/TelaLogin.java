package com.example.cathe.keepkey;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class TelaLogin extends AppCompatActivity {

    EditText senha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);


        senha = (EditText) findViewById(R.id.edsenha);
    }

    public void opcad(View v)
    {
        Intent it = new Intent(this, TelaCad.class);
        startActivity(it);
    }

    public void btacesso (View v)
    {
        String pass = senha.getText().toString();


        if (new UserDAO(this).validaSenha(pass))//pesquisar no banco
        {
            Intent it = new Intent(this, TelaMain.class);
            startActivity(it);
        }

        else
            Toast.makeText(TelaLogin.this, "Senha incorreta", Toast.LENGTH_SHORT).show();


    }

    public void oprecupsenha(View v)
    {
        Intent it = new Intent(this, TelaRecSenha.class);
        startActivity(it);
    }

}
