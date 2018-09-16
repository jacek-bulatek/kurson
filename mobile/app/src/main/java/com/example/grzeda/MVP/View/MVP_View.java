package com.example.grzeda.MVP.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Jacek on 2018-09-18.
 */

public class MVP_View extends AppCompatActivity {
    ViewEventListener eventListener;

    public MVP_View(){
        Intent intent = new Intent(this, ViewActivity.class);
        startActivity(intent);
    }

    public void setViewEventListener(ViewEventListener listener){
        /*
         * When event occurs invoke:
         * eventListener.onEvent();
         */
        eventListener = listener;
    }
}