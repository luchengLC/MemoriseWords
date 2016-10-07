package com.example.lc.memorisewords;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by LC on 2016/10/7.
 */
public class MyDatabaseHelper extends SQLiteOpenHelper {

    final String CREATE_TABLE_SQL = "create table dict ( _id integer primary key autoincrement ," +
            " word ," +
            " detail )";

    public MyDatabaseHelper(Context context, String name, int version) {
        super(context,name,null,version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_SQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        System.out.println("-----onUpdate Called-----" + oldVersion + "--->" + newVersion);
    }
}
