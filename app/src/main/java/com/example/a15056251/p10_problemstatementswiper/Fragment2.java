package com.example.a15056251.p10_problemstatementswiper;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {

    ImageView iv;
    View view;


    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment2, container, false);
        iv = (ImageView)view.findViewById(R.id.iv);
        String imageUrl = "http://68.media.tumblr.com/1440327d069c8e21fa52097ae6fe2306/tumblr_otq11n888k1roqv59o1_500.png";
        Picasso.with(getContext()).load(imageUrl).into(iv);


        // Inflate the layout for this fragment
        return view;


    }

}
