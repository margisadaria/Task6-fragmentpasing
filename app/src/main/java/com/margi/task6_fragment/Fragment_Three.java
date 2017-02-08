package com.margi.task6_fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Margi on 07-Feb-17.
 */
public class Fragment_Three extends Fragment {
    TextView textViewname,textViewsemester;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_three, container, false);
        textViewname = (TextView) view.findViewById(R.id.main_txtname);
        textViewsemester = (TextView)view.findViewById(R.id.main_txtsemester);
        String s1 = getArguments().getString("key2");
        String s = getArguments().getString("key3");

        textViewname.setText(s);
        textViewsemester.setText(s1);
        Button btnc = (Button) view.findViewById(R.id.btnc1);
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                fm.popBackStack();
                ft.commit();
            }
        });

        return view;

    }
}
