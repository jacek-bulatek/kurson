package com.example.mobile.View;
import android.view.View;
/**
 * Created by Jacek on 2018-09-19.
 */
public interface ILoginView {
    void displayLoginForm();
    void hideLoginFrom();
    void displayLoginError();
    void handleLogin(View view);
}