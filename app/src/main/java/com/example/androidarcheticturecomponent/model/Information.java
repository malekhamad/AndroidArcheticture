package com.example.androidarcheticturecomponent.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Information {
    @PrimaryKey(autoGenerate = true)
    private int id ;

    @ColumnInfo(name = "name")
    @NonNull
    private String Name;

    @ColumnInfo(name = "age")
    @NonNull
    private int Age ;

    @ColumnInfo(name = "gpa")
    @NonNull
    private double Gpa ;

    private void setId(int id){
        this.id=id ;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public double getGpa() {
        return Gpa;
    }
}
