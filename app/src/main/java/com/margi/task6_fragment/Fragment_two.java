package com.margi.task6_fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Margi on 07-Feb-17.
 */
public class Fragment_two extends android.support.v4.app.Fragment
{

    Button buttonB,buttonB1;
    //EditText editTextsemester;
    //TextView txtsemester;
    Fragment_Three fragment_three;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {

    View  view=inflater.inflate(R.layout.fragment_b,container,false);
       final TextView txtsemester = (TextView)view.findViewById(R.id.textView1) ;
       final EditText editTextsemester =(EditText)view.findViewById(R.id.etsemester);
         buttonB = (Button)view.findViewById(R.id.btnB);
          buttonB1 = (Button)view.findViewById(R.id.btnb1);
        final String name = getArguments().getString("key1");
        buttonB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                fragment_three = new Fragment_Three();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();

                String semester=editTextsemester.getText().toString();
                Bundle bundle = new Bundle();


                bundle.putString("key2",name);
                bundle.putString("key3",semester);
               fragment_three.setArguments(bundle);

                ft.replace(R.id.linear_main,fragment_three);
                editTextsemester.setText("");
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        buttonB.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                FragmentManager fm= getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                // ft.replace(R.id.fragloc,fr);
                // ft.add(headlines_fragment,sp);
                // ft.add(R.id.headlines_fragment,sp);
                fm.popBackStack();
                ft.commit();

            }

        });
        return view;

    }
}
