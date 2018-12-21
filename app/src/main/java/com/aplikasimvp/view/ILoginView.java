package com.aplikasimvp.view;

public interface ILoginView {
    /**
     *
     * @param message
     */
    void onLoginSuccess(String message);
    void onLoginError(String message);
}
