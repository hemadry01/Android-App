package com.example.hemadry.food;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class FoodDataBaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Food_db";
    public static final int DATABASE_VERSON = 1;

    public static final String TABLE_NAME ="tdl_food";
    public static final String COL_ID = "_id";
    public static final String COL_NAME = "custom_name";
    public static  final String COL_ADD= "custom_address";
    public static final String  COL_PRODUCT = "product_name";
    public static final String COL_ITEM = "product_item";
    public static final String COL_PHONE = "custom_phone_number";

    public FoodDataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSON);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table "+TABLE_NAME+"("+COL_ID+" integer primary key,"+COL_NAME+"text,"+COL_ADD+" text,"+COL_PRODUCT+" text,"+COL_ITEM+" text,"+COL_PHONE+"text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists "+TABLE_NAME);
        onCreate(db);

    }
}
