package com.margi.task6_fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private Fragment_one f1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
               f1= new Fragment_one();

                FragmentManager fr1=getSupportFragmentManager();
                FragmentTransaction ft = fr1.beginTransaction();
                ft.add(R.id.linear_main,f1);
                ft.commit();

            }
        }

