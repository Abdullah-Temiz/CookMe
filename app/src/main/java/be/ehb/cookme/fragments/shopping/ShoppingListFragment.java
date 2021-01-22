package be.ehb.cookme.fragments.shopping;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import be.ehb.cookme.R;


public class ShoppingListFragment extends Fragment {




    public ShoppingListFragment() {
        // Required empty public constructor
    }


    public static ShoppingListFragment newInstance() {
        ShoppingListFragment fragment = new ShoppingListFragment();
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
        View ShoppingView =  inflater.inflate(R.layout.fragment_shopping_list, container, false);
        return ShoppingView;
    }
}