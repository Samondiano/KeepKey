package com.example.cathe.keepkey;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by cathe on 22/06/2017.
 */

public class UserDAO {

    private SQLiteDatabase db;
    private  BancoOpenHelper openHelper;

    public UserDAO(Context context){
        openHelper = new BancoOpenHelper(context);
    }

    public void abrir(){db = openHelper.getWritableDatabase();}
    public void fechar(){db.close();}

    public User inserir (User user){
        ContentValues values = new ContentValues();

        values.put("email", user.getEmail());
        values.put("password", user.getPassword());


        User comp;
        comp = user;
        comp.setId(db.insert("usuario", null, values));
        return comp;
    }

    public boolean validaSenha(String pass){
        Cursor cursor = db.query("usuario",null,"password=?",new String[]{pass},null,null,null);
        //Log.i("senha",cursor.toString());
        cursor.moveToFirst();
        User user = new User();
        user.setId(cursor.getInt(0));
        user.setPassword(cursor.getString(1));
        user.setEmail(cursor.getString(2));

        if(user.getPassword() != null)
            return true;
        return false;
    }
}
