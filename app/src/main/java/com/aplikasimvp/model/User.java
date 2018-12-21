package com.aplikasimvp.model;

import android.text.TextUtils;
import android.util.Patterns;

import android.text.TextUtils;
import android.util.Patterns;

public class User implements IUser {

    String email, password;

    public User(String email, String password) {
        /**
         * deklarasikan email dan password
         */
        this.email = email;
        this.password = password;
    }

    @Override
    public String getEmail() {
        /**
         * ambil value email
         */
        return email;
    }

    @Override
    public String getPassword() {
        /**
         * ambil value password
         */
        return password;
    }

    @Override
    /**
     * lakukan cek data
     */
    public int isValidData() {
        if(TextUtils.isEmpty(getEmail())) {
            return 0;
            /**
             * jika kolom email kosong maka error kode = 0 bro
             */
        } else if(!getEmail().equals("admin")) {
            return 1;
            /**
             * jika kolom email bukan admin maka error kode = 1 gan
             */
        } else if(!getPassword().equals("admin")) {
            return 2;
            /**
             * jika kolom password bukan admin maka error kode = 2 cuy
             */
        } else {
            /**
             * kalo gaada kondisi diatas maka error kodenya = -1
             */
            return -1;
        }
    }
}
