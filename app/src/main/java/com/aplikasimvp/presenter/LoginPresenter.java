package com.aplikasimvp.presenter;

import com.aplikasimvp.model.User;
import com.aplikasimvp.view.ILoginView;

public class LoginPresenter implements ILoginPresenter {
    ILoginView loginView;

    public LoginPresenter(ILoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void onLogin(String email, String password) {
        /**
         * buat objek baru user
         */
        User user = new User(email, password);
        int loginCode = user.isValidData();
/**
 * cek login kode yang tadi di class User.java
 */
        if(loginCode == 0) {
            loginView.onLoginError("Email tidak boleh kosong!");
        } else if(loginCode == 1) {
            loginView.onLoginError("Login Gagal, Email anda Salah!");
        } else if(loginCode == 2) {
            loginView.onLoginError("Login Gagal, Password anda Salah!");
        } else {
            loginView.onLoginSuccess("Login Berhasil");
        }
    }
}
