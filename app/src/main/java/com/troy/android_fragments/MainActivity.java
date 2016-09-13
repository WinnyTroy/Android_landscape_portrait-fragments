package com.troy.android_fragments;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        FragmentManager fragmentManager = getSupportFragmentManager();

//        Transaction begins helps automate activities of the fragment like create, replace, delete
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

//        Create a configuration object that can hold the device configuration information in our application

        Configuration configInfo = getResources().getConfiguration();

//        Now to check screen orientation
        if(configInfo.orientation == Configuration.ORIENTATION_LANDSCAPE){

//            creating a fragment landscape object to manipulate
            fragment_landscape fragmentLandscape = new fragment_landscape();
            fragmentTransaction.replace(android.R.id.content,
                    fragmentLandscape);
        }else{
            portrait_fragment fragmentPortrait = new portrait_fragment();
            fragmentTransaction.replace(android.R.id.content,
                    fragmentPortrait);

        }

        fragmentTransaction.commit();

//        setContentView(R.layout.activity_main);
    }
}
