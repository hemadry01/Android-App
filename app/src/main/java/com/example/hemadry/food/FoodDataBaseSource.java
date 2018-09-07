package com.example.hemadry.food;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class FoodDataBaseSource {

    private FoodDataBaseHelper helper;
    private SQLiteDatabase db;


    public FoodDataBaseSource(Context context) {
        helper = new FoodDataBaseHelper(context);
    }

    public void open() {
        db = helper.getWritableDatabase();
    }

    public void close() {
        db.close();
    }

    public boolean insertOrder(String name,String address,String productName,String item,String phoneNumber) {
        this.open();
        ContentValues values = new ContentValues();

        values.put(FoodDataBaseHelper.COL_NAME,name);
        values.put(FoodDataBaseHelper.COL_ADD, address);
        values.put(FoodDataBaseHelper.COL_PRODUCT, productName);
        values.put(FoodDataBaseHelper.COL_ITEM, item);
        values.put(FoodDataBaseHelper.COL_PHONE, phoneNumber);

        long insertedRow = db.insert(FoodDataBaseHelper.TABLE_NAME, null, values);

        //this.close();
        if (insertedRow == -1) {
            return false;
        } else {
            return true;
        }
    }



}