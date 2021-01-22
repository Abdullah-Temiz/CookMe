package be.ehb.cookme.fragments.recipe;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import be.ehb.cookme.R;
import be.ehb.cookme.models.util.RecipeAdapter;


public class RecipeListFragment extends Fragment {

    private RecipeAdapter recipeAdapter;
    private FragmentActivity mFragmentActivity;

    public RecipeListFragment() {
        // Required empty public constructor
    }

    public static RecipeListFragment newInstance() {
        RecipeListFragment fragment = new RecipeListFragment();
        return fragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mFragmentActivity = (FragmentActivity) context;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View RecipeView =  inflater.inflate(R.layout.fragment_recipe_list, container, false);


        FloatingActionButton fab_add = RecipeView.findViewById(R.id.fab_add_recipe);
        fab_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_recipeListFragment_to_detailRecipeListFragment);
            }
        });



        return RecipeView;

    }
}