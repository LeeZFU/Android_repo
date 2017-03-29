package com.application3;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity4 extends Activity {
    private static final String LIFT_TAG = "LogActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        Log.v(MainActivity4.LIFT_TAG, "SecondActivity--->onCreate");
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        Log.v(MainActivity4.LIFT_TAG, "SecondActivity --->onDestory");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        Log.v(MainActivity4.LIFT_TAG, "SecondActivity --->onPause");
        super.onPause();
    }
}

