package com.example.vijsu.mytabapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Mutyalavijay_Sai on 10/5/2015.
 */
public class MyFragment extends Fragment {
    public static MyFragment newInstace(){
        MyFragment fragment = new MyFragment();
        return fragment;
    }
    public MyFragment(){

    }
    Button clickme;
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_main,container,false);
        return rootView;
    }
}
