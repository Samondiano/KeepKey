package com.example.cathe.keepkey;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by cathe on 21/06/2017.
 */

public class ListaPass extends ListActivity{

    private List<Pass> list;
    private ArrayAdapter arrayAdapter;
    private PassDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Intent intent = getIntent();

        dao = new PassDAO(this);
        dao.abrir();

        list = dao.list();
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        setListAdapter(arrayAdapter);


    }

   @Override
   protected void onPause() {
        dao.fechar();
        super.onPause();
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Pass c = (Pass) l.getItemAtPosition(position);
        Intent it = new Intent(this, Detalha.class);
        String informacoes = "Login: "+c.getLogin()+"\nSenha: "+c.getSenha();
        it.putExtra("info",informacoes);

        startActivity(it);
        Toast.makeText(this, c.getTitulo(), Toast.LENGTH_SHORT).show();

    }

}
