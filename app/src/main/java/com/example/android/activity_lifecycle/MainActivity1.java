package com.example.android.activity_lifecycle;

import android.content.res.Configuration;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity1 extends ActionBarActivity {

    Button nextPageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity1);
        Log.d("LifeCycleOncreateMethod","On Create was called");


    }

    public void doSomething ()
    {
     Log.i("Gov","The BUtton has been clicked");
    }
}
