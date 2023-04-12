package com.example.nyobadrawer;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {
    public Fragment2() {
        // Required empty public constructor
    }

    public static Fragment2 newInstance(){
        return new Fragment2();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_2, container, false);

//        return inflater.inflate(R.layout.fragment_1, container, false);

        return rootView;    }
}