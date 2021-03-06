package com.example.a15056251.p10_problemstatementswiper;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {
    Button btnChange;

    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment1, container, false);
        btnChange = (Button)view.findViewById(R.id.btnChange);


        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getView().setBackgroundColor(getRandomColor());
            }
        });

        return view;

    }

    public int getRandomColor(){
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }

}
