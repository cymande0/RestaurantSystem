package datebase.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="name_of_meal")
    private String nameOfMeal;

    @Column(name="price")
    private double price;

    @Column(name="type_of_meal")
    private String type;

    public Meal(String nameOfMeal, double price){
        this.nameOfMeal = nameOfMeal;
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

    public String getType() {
        return type;
    }

    public void setType_of_meal(String type) {
        this.type = type;
    }

    public String toString(){
        return "Meal [id=" + id + ", nameOfMeal=" + nameOfMeal + ", price=" + price + ", type=" + type +"]";
    }
}
