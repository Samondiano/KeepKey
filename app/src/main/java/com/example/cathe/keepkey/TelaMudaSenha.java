package com.example.cathe.keepkey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TelaMudaSenha extends AppCompatActivity {

    EditText newsenha, confsenha, senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_muda_senha);

        newsenha = (EditText) findViewById(R.id.ednewsenha);
        confsenha = (EditText) findViewById(R.id.edcofnewsenha);
        senha = (EditText) findViewById(R.id.edsenha);

    }

    public void alterasenha(View v)
    {
        String pass = newsenha.getText().toString();
        String confirmPass = confsenha.getText().toString();

        if(pass.equals(confirmPass)) {
            senha=newsenha; //Essa linha deve alterar o valor da variavel senha(Eu espero rsrs)
            Toast.makeText(TelaMudaSenha.this, "Senha alterada com sucesso!", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, TelaLogin.class);
            startActivity(i);
        }else
            Toast.makeText(TelaMudaSenha.this, "Senhas não correspondem", Toast.LENGTH_SHORT).show();
    }

}
