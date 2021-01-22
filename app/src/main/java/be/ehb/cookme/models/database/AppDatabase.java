package be.ehb.cookme.models.database;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import be.ehb.cookme.models.entities.recipe.Recipe;
import be.ehb.cookme.models.entities.recipe.RecipeDAO;
import be.ehb.cookme.models.entities.shopping.Shopping;
import be.ehb.cookme.models.entities.shopping.ShoppingDAO;

@Database(version = 1, entities = {Recipe.class, Shopping.class}, exportSchema = false)
//Verwijzen naar een database

public abstract class AppDatabase extends RoomDatabase {
    //Abstract classe omdat de DAO is een interface, dus de methode zelf is abstract omdat de gegevens nog overschreven moet worden. Hierdoor moet men de classe ook abstract aanmaken
    //De DAO wordt abstract aangeboden. Hierdoor is de DAO abstract omdat de builder alles gaat opbouwen


    private static final String DB_Name = "CookRecipeDatabase.db";
    private static AppDatabase instance;

    //Benodigheden voor Threads
    //Final omdat deze niet meer zal gewijzigd worden nadat het aangemaakt is
    //Threadpool om meer dan 1 tegelijk uit te voeren
    public static final ExecutorService databaseExecutor = Executors.newFixedThreadPool(4);

    public static AppDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context, AppDatabase.class, DB_Name).build();
        }
        return instance;
        //Nakijken of de instance aangemaakt is of niet. Zo niet, wordt er een nieuwe instance aangemaakt. Zo ja, wordt de bestaande instance returned

    }

    public abstract RecipeDAO getRecipeDao();
    public abstract ShoppingDAO getShoppingDao();

}
