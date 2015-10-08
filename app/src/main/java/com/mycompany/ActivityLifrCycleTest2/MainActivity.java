package com.mycompany.ActivityLifrCycleTest2;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.view.View.*;
import android.content.*;
import android.util.*;


public class MainActivity extends Activity 
{
    private Button btn_normal,btn_dialog;
    public static final String TAG = "MainActivity";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btn_normal = (Button) findViewById(R.id.start_normal_activity);
        btn_dialog = (Button) findViewById(R.id.start_dialog_activity);


        btn_normal.setOnClickListener(new OnClickListener(){
                @Override
                public void onClick(View v)
                {

                    Intent intentk = new Intent(MainActivity.this,NormalActivity.class);
                    startActivity(intentk);
                }
            });

        btn_dialog.setOnClickListener(new OnClickListener(){
                @Override
                public void onClick(View v)
                {
                    Intent intent = new Intent(MainActivity.this,DialogActivity.class);
                    startActivity(intent);



                }
            });
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d(TAG, "onstart");
    }

    @Override
    public void onStop()
    {
        super.onStop();
        Log.d(TAG, "onstop");
    }

    @Override
    protected void onResume()
    {

        super.onResume();
        Log.d(TAG, "onresume");

    }

    @Override
    protected void onPause()
    {
        // TODO: Implement this method
        super.onPause();
        Log.d(TAG, "onpause");
    }

    @Override
    protected void onRestart()
    {
        // TODO: Implement this method
        super.onRestart();
        Log.d(TAG, "onrestart");
    }

    @Override
    protected void onDestroy()
    {
        // TODO: Implement this method
        super.onDestroy();
        Log.d(TAG, "ondestroy");

    }//增加注释

}    
