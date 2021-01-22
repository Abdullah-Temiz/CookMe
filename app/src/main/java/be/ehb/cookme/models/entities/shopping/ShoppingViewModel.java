package be.ehb.cookme.models.entities.shopping;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import be.ehb.cookme.models.database.AppDatabase;
import be.ehb.cookme.models.entities.shopping.Shopping;

public class ShoppingViewModel extends AndroidViewModel {


    private LiveData<List<Shopping>> shoppinglist;
    private AppDatabase mAppDatabase;

    //Object opvragen (GETTER)
    //Android viewmodel maakt makkelijker om de database aan te spreken

    public ShoppingViewModel(@NonNull Application application) {
        super(application);
        mAppDatabase = AppDatabase.getInstance(application);
        shoppinglist = mAppDatabase.getShoppingDao().getAllShoppingItems();
    }

    public LiveData<List<Shopping>>getShoppinglist(){
        return mAppDatabase.getShoppingDao().getAllShoppingItems();
    }

    public void insertItem(Shopping shopping){
        //Execute een operation in het achtergrond
        AppDatabase.databaseExecutor.execute(()->{
            mAppDatabase.getShoppingDao().insertItem(shopping);
        });
    }

    public void deleteItem(Shopping shopping){
        AppDatabase.databaseExecutor.execute(()->{
            mAppDatabase.getShoppingDao().deleteItem(shopping);
        });
    }

    public void updateItem(Shopping shopping){
        AppDatabase.databaseExecutor.execute(()->{
            mAppDatabase.getShoppingDao().updateItem(shopping);
        });
    }


}



