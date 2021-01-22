package be.ehb.cookme;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import be.ehb.cookme.fragments.recipe.RecipeListFragment;
import be.ehb.cookme.fragments.SettingsFragment;
import be.ehb.cookme.fragments.shopping.ShoppingListFragment;
import be.ehb.cookme.fragments.ShoppingMapFragment;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView mBottomNavigationView;
    AppBarConfiguration mAppBarConfiguration;
    NavController mNavController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBottomNavigationView = findViewById(R.id.nav_bottom);
        mBottomNavigationView.setOnNavigationItemSelectedListener(mNavigationItemSelectedListener);
        FragmentTransaction mFragmentTransaction = getSupportFragmentManager().beginTransaction();
        mFragmentTransaction.replace(R.id.nav_host, new RecipeListFragment()).commit();


        Toolbar mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        mNavController = Navigation.findNavController(this, R.id.nav_host);
        mAppBarConfiguration = new AppBarConfiguration.Builder(R.id.recipeListFragment, R.id.detailRecipeListFragment).build();
        NavigationUI.setupActionBarWithNavController(this,mNavController, mAppBarConfiguration);
    }

    @Override
    public boolean onSupportNavigateUp() {
        return NavigationUI.navigateUp(mNavController, mAppBarConfiguration) || super.onSupportNavigateUp();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            Fragment clickedFragment = null;
            switch (item.getItemId()){
                case R.id.recipeListFragment:
                    clickedFragment = RecipeListFragment.newInstance();
                    break;
                case R.id.shoppingListFragment:
                    clickedFragment = ShoppingListFragment.newInstance();
                    break;
                case R.id.shoppingMapFragment:
                    clickedFragment = ShoppingMapFragment.newInstance();
                    break;
                case R.id.settingsFragment:
                    clickedFragment = SettingsFragment.newInstance();
                    break;
            }
            FragmentTransaction mTransaction = getSupportFragmentManager().beginTransaction();
            mTransaction.replace(R.id.nav_host,clickedFragment).commit();
            return true;
        }
    };

}