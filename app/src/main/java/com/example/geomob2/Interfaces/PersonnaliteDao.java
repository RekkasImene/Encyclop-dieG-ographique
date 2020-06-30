package com.example.geomob2.Interfaces;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.geomob2.Model.Personnalites;

import java.util.List;

@Dao
public interface PersonnaliteDao {

    @Insert
    void insert(Personnalites i);

    @Query("SELECT * FROM Personnalites WHERE title LIKE :title")
    List<Personnalites> getPersonnalites(String title);



}



