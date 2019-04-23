package datebase.entity;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class MealProperty {

    private StringProperty nameProp;
    private DoubleProperty priceProp;

    public MealProperty(String name, double price){
        this.nameProp = new SimpleStringProperty(name);
        this.priceProp = new SimpleDoubleProperty(price);
    }

    public String getNameProp() {
        return nameProp.get();
    }

    public StringProperty namePropProperty() {
        return nameProp;
    }

    public void setNameProp(String nameProp) {
        this.nameProp.set(nameProp);
    }

    public double getPriceProp() {
        return priceProp.get();
    }

    public DoubleProperty pricePropProperty() {
        return priceProp;
    }

    public void setPriceProp(double priceProp) {
        this.priceProp.set(priceProp);
    }
}
