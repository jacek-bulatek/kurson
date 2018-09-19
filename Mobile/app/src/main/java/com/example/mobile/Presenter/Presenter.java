package com.example.mobile.Presenter;

import com.example.mobile.Model.Model;

/**
 * Created by Jacek on 2018-09-19.
 */

public class Presenter implements ILoginPresenter {
    Model model;
    public Presenter(){
        model = new Model();
    }

    @Override
    public boolean setLogin(String login) {
        return model.setLogin(login);
    }
}
