package com.example.cathe.keepkey;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by cathe on 20/06/2017.
 */

public class BancoOpenHelper extends SQLiteOpenHelper {

    public BancoOpenHelper(Context context) { super(context, "keepkey.db", null, 2); }

    @Override
    public void onCreate (SQLiteDatabase db) {
        String tbmuser = "CREATE TABLE usuario (" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "email TEXT, " +
                "password PASSWORD);";
        db.execSQL(tbmuser);

        String tbmpass = "CREATE TABLE passwd (" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "titulo TEXT, " +
                "login TEXT, " +
                "senha TEXT, " +
                "informAdd TEXT); ";
        db.execSQL(tbmpass);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


        onCreate(db);
    }

}
