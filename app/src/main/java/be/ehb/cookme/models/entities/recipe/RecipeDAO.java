package be.ehb.cookme.models.entities.recipe;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import be.ehb.cookme.models.entities.recipe.Recipe;

@Dao
public interface RecipeDAO {
    //Bepalen van wat we moeten kunnen doen (CRUD-Operations)


    @Insert
    void insertRecipe(Recipe recipe);
    //Rij toevoegen in tabel

    @Delete
    void deleteRecipe(Recipe recipe);
    //Rij verwijderen van tabel a.d.h.v. PK van het object

    @Update
    void updateRecipe(Recipe recipe);
    //if PK bestaat in table dan update men dat rij

    @Query("SELECT * FROM Recipe")
        //Opvragen van alle data a.d.h.v. query --> Alle recipes opvragen
        //Enkel een entity of een lijst aanvragen waar men livedata kan aanmaken
    LiveData<List<Recipe>> getAllRecipes();


    @Query("SELECT * FROM Recipe WHERE Id = :Id")
        //Object opzoeken d.m.v. Id
    Recipe getById(Long Id);


}
