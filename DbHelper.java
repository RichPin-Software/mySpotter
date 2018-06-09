package com.richardpinegar.myspotter;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "MySpotter.db";
    public static final String TABLE_NAME = "mySpotter_table";
    public static final String COL_1 = "Id";
    public static final String COL_2 = "MuscleGroup";
    public static final String COL_3 = "DayOfWeek";
    public static final String COL_4 = "ExerciseType";
    public static final String COL_5 = "WeightAmt";
    public static final String COL_6 = "Completed";

    public DbHelper(Context context) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + " (Id INTEGER PRIMARY KEY AUTOINCREMENT, MuscleGroup TEXT, DayofWeek TEXT," +
                "ExerciseType TEXT, WeightAmt INTEGER, Completed TEXT)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
