package com.bukaapp.keyper;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {Senha.class}, version = 1)
public abstract class SenhaDatabase extends RoomDatabase {

    abstract SenhaDao getSenhaDao();

    private static SenhaDatabase db;
    public static SenhaDatabase getInstancia(Context context){

        if(db == null){
            db = Room.databaseBuilder(
                    context,
                    SenhaDatabase.class,
                    "senha_database")
                    .allowMainThreadQueries()
                    .build();
        }

        return db;
    }
}
