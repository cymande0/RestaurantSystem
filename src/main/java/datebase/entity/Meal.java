package datebase.entity;

import javax.persistence.*;

@Entity
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="name_of_meal")
    private String nameOfMeal;

    @Column(name="price")
    private double price;

//    private StringProperty nameProp;
//    private DoubleProperty priceProp;

    public Meal(){}

    public Meal(String nameOfMeal, double price){
        this.nameOfMeal = nameOfMeal;
        this.price = price;
//        this.nameProp = new SimpleStringProperty(nameOfMeal);
//        this.priceProp = new SimpleDoubleProperty(price);
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

//    @Column(name = "name_of_meal")
//    public String getNameProp() {
//        return nameProp.get();
//    }
//
//    public void setNameProp(String nameProp) {
//        this.nameProp.set(nameProp);
//    }
//
//    public StringProperty namePropProperty() {
//        return nameProp;
//    }
//
//    @Column(name = "price")
//    public double getPriceProp() {
//        return priceProp.get();
//    }
//
//    public void setPriceProp(double priceProp) {
//        this.priceProp.set(priceProp);
//    }
//
//    public DoubleProperty pricePropProperty() {
//        return priceProp;
//    }

    public String toString(){
        return "Meal [id=" + id + ", nameOfMeal=" + nameOfMeal + ", price=" + price + "]";
    }
}
