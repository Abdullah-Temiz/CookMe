package be.ehb.cookme.models.entities.recipe;


import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Recipe implements Serializable {
    //Serializable is nodig om data door te geven tussen schermen

    @PrimaryKey(autoGenerate = true)
    private long id;
    private String recipe_name;
    private String recipe_ingredients;
    private String recipe_description;

    //Constructor
    public Recipe() {
    }


    //Negeren voor het aanmaken van de database maar de methode moet wel bestaan.
    @Ignore
    public Recipe(String recipe_name, String recipe_ingredients, String recipe_description) {
        this.recipe_name = recipe_name;
        this.recipe_ingredients = recipe_ingredients;
        this.recipe_description = recipe_description;
    }

    //Getters & Setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getRecipe_name() {
        return recipe_name;
    }
    public void setRecipe_name(String recipe_name) {
        this.recipe_name = recipe_name;
    }
    public String getRecipe_ingredients() {
        return recipe_ingredients;
    }
    public void setRecipe_ingredients(String recipe_ingredients) { this.recipe_ingredients = recipe_ingredients; }
    public String getRecipe_description() {
        return recipe_description;
    }
    public void setRecipe_description(String recipe_description) { this.recipe_description = recipe_description; }
}
