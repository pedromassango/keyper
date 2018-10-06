package com.bukaapp.keyper;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public abstract class SenhaDao {

    /**
     * Retorna todas as senhas da Room Database
     * @return a lista de todas as senhas.
     */
    @Query("SELECT * FROM Senha")
    abstract List<Senha> getSenhas();

    @Insert
    abstract void insert(Senha s);


}
