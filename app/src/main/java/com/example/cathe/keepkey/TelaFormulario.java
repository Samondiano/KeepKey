package com.example.cathe.keepkey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TelaFormulario extends AppCompatActivity {

    EditText titulo, login, senha, informAdd;

    private PassDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_formulario);

        titulo = (EditText) findViewById(R.id.edtitulo);
        login = (EditText) findViewById(R.id.edlogin);
        senha = (EditText) findViewById(R.id.edsenha);
        informAdd = (EditText) findViewById(R.id.edadd);

        titulo.setFocusable(true);

        dao = new PassDAO(this);
        dao.abrir();
    }


    @Override
    protected void onPause() {
        //dao.fechar();
        super.onPause();
    }

    public void salvar(View view){
        Pass c = new Pass();
        c.setTitulo(titulo.getText().toString());
        c.setLogin(login.getText().toString());
        c.setSenha(senha.getText().toString());
        c.setInformAdd(informAdd.getText().toString());
        dao.inserir(c);//salva no banco

        Toast.makeText(this, "Nova nota adicionada: "+c.getTitulo(), Toast.LENGTH_SHORT).show();

        titulo.setText("");
        login.setText("");
        senha.setText("");
        informAdd.setText("");
    }

    public void cancelar(View view){
        Intent i = new Intent(this, TelaMain.class);
        startActivity(i);
    }

}
