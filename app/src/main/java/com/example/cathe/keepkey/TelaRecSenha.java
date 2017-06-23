package com.example.cathe.keepkey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TelaRecSenha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_rec_senha);
    }

    public void recuperarsenha (View v)
    {
        Intent it = new Intent(this, TelaMudaSenha.class);
        startActivity(it);
    }

}
