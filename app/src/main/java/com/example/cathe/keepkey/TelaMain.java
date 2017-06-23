package com.example.cathe.keepkey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TelaMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_main);
    }

    public void add(View view)
    {
        Intent it = new Intent(this, TelaFormulario.class);
        startActivity(it);
    }

    public void listagem(View view){
        Intent i = new Intent(this, ListaPass.class);
        startActivity(i);
    }
}
