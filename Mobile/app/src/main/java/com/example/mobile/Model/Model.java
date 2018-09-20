package com.example.mobile.Model;
/**
 * Created by Jacek on 2018-09-19.
 */
public class Model implements ILoginModel {
    Telegram telegram;
    @Override
    public boolean setLogin(String login) {
        if (validateLogin(login)){
            telegram.setUsername(login);
            return true;
        }
        else
            return false;
    }
    private boolean validateLogin(String login){
        return true;

    }
}
