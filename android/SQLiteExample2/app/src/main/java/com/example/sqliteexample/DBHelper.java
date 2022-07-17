package com.example.sqliteexample;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {
    //DB 버전, 이름 선언
    private static final int DB_VERSION = 1;
    public static final String DB_NAME = "junjaboy.db";

    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) { //DB 데이터베이스 생성 시 호출

        //DB > TABLE > COLUMN > VALUE
        db.execSQL(
                "CREATE TABLE IF NOT EXISTS `TodoList` (id INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "/*변수 'id'를 PRIMARY KEY(기본키)로 지정하고, AUTOINCREMENT(1씩 자동 증가)를 설정한다*/" +

                        "title TEXT NOT NULL," +
                        "/*변수 'title'이 NOT NULL(값이 없지 않은)이어야 DB에 입력된다 ≠ NOT NULL을 입력하지 않은 경우 NULL값을 허용한다*/" +

                        "content TEXT NOT NULL, writeDate TEXT NOT NULL)"
        );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);
    }

    //SELECT (할 일 목록 DB에서 조회)
    public ArrayList<TodoItem> getTodoList() {
        ArrayList<TodoItem> todoItems = new ArrayList<>();

        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM `TodoList` ORDER BY writeDate DESC", null);
        if (cursor.getCount() != 0) { //조회 시 데이터가 있을 때 실행
            while (cursor.moveToNext()) {
                @SuppressLint("Range") int id = cursor.getInt(cursor.getColumnIndex("id"));
                @SuppressLint("Range") String title = cursor.getString(cursor.getColumnIndex("title"));
                @SuppressLint("Range") String content = cursor.getString(cursor.getColumnIndex("content"));
                @SuppressLint("Range") String writeDate = cursor.getString(cursor.getColumnIndex("writeDate"));

                TodoItem todoItem = new TodoItem();
                todoItem.setId(id);
                todoItem.setTitle(title);
                todoItem.setContent(content);
                todoItem.setWriteDate(writeDate);
                todoItems.add(todoItem);

            }
        }
        cursor.close();

        return todoItems;
    }


    //INSERT (할 일 목록 DB에 삽입)
    public void InsertTodo(String _title, String _content, String _writeDate) { //id 값은 insert 시 자동으로 입력된다
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(
                "INSERT INTO `TodoList` (title, content, writeDate) VALUES('" + _title + "', '" + _content + "', '" + _writeDate + "');"
        );
    }

    //UPDATE (할 일 목록 DB에서 수정)
    public void UpdateTodo(String _title, String _content, String _writeDate, int _id) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(
                "UPDATE `TodoList` SET title = '" + _title + "'," +
                        "content = '" + _content + "'," +
                        "writeDate = '" + _writeDate + "' WHERE id = , '" + _id + "'" +
                        ")"
        );
    }

    //DELETE (할 일 목록 DB에서 제거)
    public void DeleteTodo(int _id) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(
                "DELETE FROM `TodoList` WHERE id = '" + _id + "'"

        );
    }
}
