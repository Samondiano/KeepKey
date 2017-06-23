package com.example.cathe.keepkey;

import java.io.Serializable;

/**
 * Created by cathe on 21/06/2017.
 */

public class Pass implements Serializable{
    private long id;
    private String titulo, login, senha, informAdd;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLogin() { return login;}

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getInformAdd() {
        return informAdd;
    }

    public void setInformAdd(String informAdd) {
        this.informAdd = informAdd;
    }


    @Override
    public String toString() {

        return getTitulo();
    }

}
