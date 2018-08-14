package com.example.umairansari.fragmentsexample;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    UpperFragment upperFragment;
    LowerFragment lowerFragment;
    void initviews()
    {
        //in initview function we are creating the instances of the constructor
        upperFragment=new UpperFragment();
        lowerFragment=new LowerFragment();
        //using fragment manager
        android.support.v4.app.FragmentManager fragmentManager=getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.upperfragment,upperFragment).commit();
        fragmentManager.beginTransaction().add(R.id.lowerfragment,lowerFragment).commit();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    initviews();}
}
