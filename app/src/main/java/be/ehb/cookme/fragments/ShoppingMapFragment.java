package be.ehb.cookme.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import be.ehb.cookme.R;

public class ShoppingMapFragment extends Fragment {




    public ShoppingMapFragment() {
        // Required empty public constructor
    }


    public static ShoppingMapFragment newInstance() {
        ShoppingMapFragment fragment = new ShoppingMapFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View MapView =  inflater.inflate(R.layout.fragment_shopping_map, container, false);
        return MapView;
    }
}