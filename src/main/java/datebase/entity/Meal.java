package datebase.entity;

import javax.persistence.*;

@Entity
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="name_of_meal")
    private String nameOfMeal;

    @Column(name="type_of_meal")
    private String typeOfMeal;

    @Column(name="price")
    private double price;


    public Meal(){}

    public Meal(String nameOfMeal, String type, double price){
        this.nameOfMeal = nameOfMeal;
        this.price = price;
        this.typeOfMeal = type;
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

    public String getTypeOfMeal() {
        return typeOfMeal;
    }

    public void setTypeOfMeal(String typeOfMeal) {
        this.typeOfMeal = typeOfMeal;
    }

    public String toString(){
        return "Meal [id=" + id + ", nameOfMeal=" + nameOfMeal + ", typeOfMeal=" + typeOfMeal + ", price=" + price +
                "]";
    }
}
