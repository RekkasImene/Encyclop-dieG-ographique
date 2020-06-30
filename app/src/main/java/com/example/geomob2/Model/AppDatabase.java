package com.example.geomob2.Model;


import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.geomob2.Interfaces.CountryDao;
import com.example.geomob2.Interfaces.DiapoDao;
import com.example.geomob2.Interfaces.HistoriqueDao;
import com.example.geomob2.Interfaces.PersonnaliteDao;
import com.example.geomob2.Interfaces.RessourceDao;
import com.example.geomob2.Interfaces.VideoDao;
import com.example.geomob2.Model.Country;

@Database(entities = {Country.class,Personnalites.class,Ressources.class,Videos.class,Diapo.class,Historique.class}, version = 1, exportSchema = false)

public abstract class AppDatabase extends RoomDatabase {
    public abstract CountryDao CountryDao();
    public abstract PersonnaliteDao PersonnalitesDao();
    public abstract RessourceDao RessourcesDao();
    public abstract VideoDao VideoDao();
    public abstract DiapoDao DiapoDao();
    public abstract HistoriqueDao HistoriqueDao();

}