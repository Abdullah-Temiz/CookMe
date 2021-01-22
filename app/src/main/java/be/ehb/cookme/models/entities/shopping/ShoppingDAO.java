package be.ehb.cookme.models.entities.shopping;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import be.ehb.cookme.models.entities.recipe.Recipe;

@Dao
public interface ShoppingDAO {



    @Insert
    void insertItem(Shopping shopping);
    //Rij toevoegen in tabel

    @Delete
    void deleteItem(Shopping shopping);
    //Rij verwijderen van tabel a.d.h.v. PK van het object

    @Update
    void updateItem(Shopping shopping);
    //if PK bestaat in table dan update men dat rij

    @Query("SELECT * FROM Shopping")
        //Opvragen van alle data a.d.h.v. query --> Alle recipes opvragen
        //Enkel een entity of een lijst aanvragen waar men livedata kan aanmaken
    LiveData<List<Shopping>> getAllShoppingItems();


    @Query("SELECT * FROM Shopping WHERE Id = :Id")
        //Object opzoeken d.m.v. Id
    Shopping getById(Long Id);





}
