package be.ehb.cookme.models.entities.shopping;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;


@Entity
public class Shopping implements Serializable {


    @PrimaryKey(autoGenerate = true)
    long id;
    String item;


    public Shopping() {
    }


    public Shopping(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
