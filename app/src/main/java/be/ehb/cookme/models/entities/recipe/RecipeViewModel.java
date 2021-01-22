package be.ehb.cookme.models.entities.recipe;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import be.ehb.cookme.models.database.AppDatabase;
import be.ehb.cookme.models.entities.recipe.Recipe;

public class RecipeViewModel extends AndroidViewModel {

    // Ljst van Recipes
    //Is generiek en geven we welke soort object we zullen aanmaken en verwijzen we naar de klasse
    //Observeer maken door observerroot te plaatsen. Lijst is mutable live data, data die we kunnen aanpassen, kunnen gaan overschrijven

    private LiveData<List<Recipe>> recipes;
    private AppDatabase mAppDatabase;

    //Object opvragen (GETTER)
    //Android viewmodel maakt makkelijker om de database aan te spreken

    public RecipeViewModel(@NonNull Application application) {
        super(application);
        mAppDatabase = AppDatabase.getInstance(application);
        recipes = mAppDatabase.getRecipeDao().getAllRecipes();
    }

    public LiveData<List<Recipe>>getRecipeList(){
        return mAppDatabase.getRecipeDao().getAllRecipes();
    }

    public void insertRecipe(Recipe recipe){
        //Execute een operation in het achtergrond
        AppDatabase.databaseExecutor.execute(()->{
            mAppDatabase.getRecipeDao().insertRecipe(recipe);
        });
    }

    public void deleteRecipe(Recipe recipe){
        AppDatabase.databaseExecutor.execute(()->{
            mAppDatabase.getRecipeDao().deleteRecipe(recipe);
        });
    }

    public void updateRecipe(Recipe recipe){
        AppDatabase.databaseExecutor.execute(()->{
            mAppDatabase.getRecipeDao().updateRecipe(recipe);
        });
    }


}
