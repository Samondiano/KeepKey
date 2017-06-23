package com.example.cathe.keepkey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class TelaCad extends AppCompatActivity {

    EditText email, password, confSenha;
    private UserDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cad);

        email = (EditText) findViewById(R.id.edemailcad);
        password = (EditText) findViewById(R.id.edsenhacad);
        confSenha = (EditText) findViewById(R.id.edcofsenha);

        dao = new UserDAO(this);
        dao.abrir();

    }

    @Override
    protected void onPause() {
        //dao.fechar();
        super.onPause();
    }

    public void cadastrar(View view) {
        //Colocar uma confirmação de email...
        //String mail = email.getText().toString();
        User c = new User();
        String mail = email.getText().toString();
        String pass = password.getText().toString();
        String confirmPass = confSenha.getText().toString();
        c.setEmail(email.getText().toString());
        c.setPassword(password.getText().toString());
        dao.inserir(c);//salva no banco

        email.setText("");
        password.setText("");

        if (pass.equals(confirmPass)) {
            Toast.makeText(TelaCad.this, "Cadastro realizado com sucesso!", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, TelaLogin.class);
            startActivity(i);
        } else
            Toast.makeText(TelaCad.this, "Senhas não correspondem", Toast.LENGTH_SHORT).show();


    }
}
