package com.example.cathe.keepkey;

import java.io.Serializable;

/**
 * Created by cathe on 22/06/2017.
 */

public class User implements Serializable {

    private long id;
    private String email, password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
