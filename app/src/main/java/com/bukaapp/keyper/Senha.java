package com.bukaapp.keyper;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Senha {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String tipo;
    private String senha;

    public Senha(String tipo, String senha){
        this.tipo = tipo;
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
