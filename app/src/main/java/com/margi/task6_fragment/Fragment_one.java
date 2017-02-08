package com.margi.task6_fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Fragment_one extends Fragment

{

    Fragment_two fragmentTwo;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {

       View  view=inflater.inflate(R.layout.fragment_fragment_one,container,false);
        //container = (ViewGroup) inflater.inflate(R.layout.fragment_fragment_one, container, false);
       Button btnA = (Button)view.findViewById(R.id.btnA1);
        final EditText editTextname = (EditText)view.findViewById(R.id.etname);
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)

            {
                fragmentTwo = new Fragment_two();


                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                String str = editTextname.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("key1",str);
                fragmentTwo.setArguments(bundle);

                ft.replace(R.id.linear_main,fragmentTwo);
                editTextname.setText("");
                ft.addToBackStack("");
                ft.commit();
            }
        });

        return view;

    }
}
