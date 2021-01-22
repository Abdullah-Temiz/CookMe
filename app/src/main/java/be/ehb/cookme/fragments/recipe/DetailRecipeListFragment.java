package be.ehb.cookme.fragments.recipe;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import be.ehb.cookme.R;
import be.ehb.cookme.models.entities.recipe.Recipe;

public class DetailRecipeListFragment extends Fragment {

    private EditText et_recipe_name, et_recipe_ingredients, et_recipe_description;
    private Button btn_add_recipe;
    private Recipe recipe;
    private FragmentActivity mFragmentActivity;

    public DetailRecipeListFragment() {
    }

    public static DetailRecipeListFragment newInstance() {
        DetailRecipeListFragment fragment = new DetailRecipeListFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mFragmentActivity = (FragmentActivity) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View DetailRecipeView =  inflater.inflate(R.layout.fragment_detail_recipe_list, container, false);
        return DetailRecipeView;
    }

}