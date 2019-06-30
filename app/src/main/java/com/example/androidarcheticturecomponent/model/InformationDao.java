package com.example.androidarcheticturecomponent.model;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface InformationDao {

    // insert information . . . ;
    @Insert
    void insert(Information information);

    // get all information . . . . ;
    @Query("SELECT * FROM  Information")
    LiveData<List<Information>> infoList() ;

    // get information depending of his id . . .  ;
    @Query("SELECT * FROM Information WHERE id =:informationId")
    LiveData<Information> getInfo(Information informationId);

    // update information  . . . ;
    @Update
    void UpdateInformation(Information information);
    // delete information .. . . .;
    @Delete
    void DeleteInformation(Information information);
}
