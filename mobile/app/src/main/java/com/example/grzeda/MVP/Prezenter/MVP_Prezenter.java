package com.example.grzeda.MVP.Prezenter;

import com.example.grzeda.MVP.Model.MVP_Model;
import com.example.grzeda.MVP.Model.ModelEventListener;
import com.example.grzeda.MVP.View.MVP_View;
import com.example.grzeda.MVP.View.ViewEventListener;

/**
 * Created by Jacek on 2018-09-18.
 */

public class MVP_Prezenter {
    private MVP_View mvp_view;
    private MVP_Model mvp_model;

    public MVP_Prezenter(){
        mvp_view = new MVP_View();
        mvp_view.setViewEventListener(new ViewEventListener() {
            @Override
            public void onEvent() {
                viewEventHandler();
            }
        });
        mvp_model = new MVP_Model();
        mvp_model.setModelEventListener(new ModelEventListener() {
            @Override
            public void onEvent() {
                modelEventHandler();
            }
        });
    }

    public void viewEventHandler(){

    }
    public void modelEventHandler(){

    }

}
