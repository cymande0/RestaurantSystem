package datebase.models;

import javax.persistence.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nameOfMeal;
    private double price;

    @OneToMany(mappedBy = "meal")
    private List<TypeOfMeal> typeOfMeal = new ArrayList<TypeOfMeal>();

    public Meal(String nameOfMeal, double price){
        this.nameOfMeal = nameOfMeal;
    //    this.typeOfMeal = typeOfMeal;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameOfMeal() {
        return nameOfMeal;
    }

    public void setNameOfMeal(String nameOfMeal) {
        this.nameOfMeal = nameOfMeal;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
