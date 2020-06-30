package com.example.geomob2.Interfaces;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.geomob2.Model.Country;

import java.util.ArrayList;
import java.util.List;


@Dao
public interface CountryDao {

    @Query("SELECT * FROM Country")
    List<Country> getAll();


    @Insert
    void insert(Country i);

    @Delete
    void delete(Country i);

    @Update
    void update(Country i);

}

