package com.example.mobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mobile.Presenter.Presenter;
import com.example.mobile.View.ILoginView;

public class MainActivity extends AppCompatActivity implements ILoginView {
    Presenter presenter;
    EditText loginInput;
    Button   loginSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new Presenter();
        loginInput = (EditText) findViewById(R.id.loginInput);
        loginSubmit = (Button) findViewById(R.id.loginSubmit);
        displayLoginForm();
    }

    @Override
    public void displayLoginForm() {
        loginInput.setVisibility(View.VISIBLE);
        loginSubmit.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoginFrom() {
        loginInput.setVisibility(View.INVISIBLE);
        loginSubmit.setVisibility(View.INVISIBLE);
    }

    @Override
    public void displayLoginError() {

    }

    @Override
    public void handleLogin(View view) {
        if(presenter.setLogin(loginInput.getText().toString())){
            hideLoginFrom();
        }
        else
            displayLoginError();
    }
}
