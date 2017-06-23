package com.example.cathe.keepkey;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by cathe on 21/06/2017.
 */

public class PassDAO  {

    private SQLiteDatabase db;
    private  BancoOpenHelper openHelper;

    public PassDAO(Context context){
        openHelper = new BancoOpenHelper(context);
    }

    public void abrir(){db = openHelper.getWritableDatabase();}
    public void fechar(){db.close();}

    public Pass inserir(Pass pass){
        ContentValues values = new ContentValues();

        values.put("titulo", pass.getTitulo());
        values.put("login", pass.getLogin());
        values.put("senha", pass.getSenha());
        values.put("informAdd", pass.getInformAdd());

        Pass passwd;
        passwd = pass;
        passwd.setId(db.insert("passwd", null, values));
        return passwd;
    }

    public List<Pass> list(){
        List<Pass> list = new ArrayList<>();
        Cursor cursor = db.query("passwd", null, null, null, null, null, "titulo");
        while(cursor.moveToNext()){
            Pass c = new Pass();
            c.setId(cursor.getInt(0));
            c.setTitulo(cursor.getString(1));
            c.setLogin(cursor.getString(2));
            c.setSenha(cursor.getString(3));
            c.setInformAdd(cursor.getString(4));

            list.add(c);
        }
        return list;
    }


}
