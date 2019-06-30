package com.example.androidarcheticturecomponent.model;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Information.class},version = 1)

public abstract class InformationRoomDatabase extends RoomDatabase {

    public abstract InformationDao infoDao();

    private static InformationRoomDatabase roomDatabase ;

    public static synchronized InformationRoomDatabase getInstance(Context context){
        if (roomDatabase == null){
          roomDatabase = Room.databaseBuilder(context.getApplicationContext() ,InformationRoomDatabase.class,"information_table")
          .build();
        }
        return roomDatabase ;
    }
}
