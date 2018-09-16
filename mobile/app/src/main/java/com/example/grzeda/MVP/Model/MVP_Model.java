package com.example.grzeda.MVP.Model;

/**
 * Created by Jacek on 2018-09-18.
 */

public class MVP_Model {
    ModelEventListener eventListener;


    public void setModelEventListener(ModelEventListener listener){
        /*
         * When event occurs invoke:
         * eventListener.onEvent();
         */
        eventListener = listener;
    }
}