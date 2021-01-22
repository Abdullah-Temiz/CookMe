package be.ehb.cookme.fragments.shopping;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import be.ehb.cookme.R;

public class DetailShoppingListFragment extends Fragment {


    public DetailShoppingListFragment() {
        // Required empty public constructor
    }


    public static DetailShoppingListFragment newInstance() {
        DetailShoppingListFragment fragment = new DetailShoppingListFragment();
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
        return inflater.inflate(R.layout.fragment_detail_shopping_list, container, false);
    }

}