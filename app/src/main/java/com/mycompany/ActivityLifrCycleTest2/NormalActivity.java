package com.mycompany.ActivityLifrCycleTest2;

import android.app.*;
import android.os.*;
import android.view.*;
import android.text.*;

public class NormalActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        // TODO: Implement this method
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.normal_layout);
    }

}
