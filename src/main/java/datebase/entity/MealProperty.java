package datebase.entity;

import controllers.diningRoom.OrderingController;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class MealProperty {

    private StringProperty nameProp;
    private StringProperty typeProp;
    private DoubleProperty priceProp;
    private Button button;


    public MealProperty(String name, String type, double price, String buttonText) {
        this.nameProp = new SimpleStringProperty(name);
        this.priceProp = new SimpleDoubleProperty(price);
        this.typeProp = new SimpleStringProperty(type);
        this.button = new Button(buttonText);

        button.setOnAction(event -> {
            //TODO
        });
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

    public String getTypeProp() {
        return typeProp.get();
    }

    public StringProperty typePropProperty() {
        return typeProp;
    }

    public void setTypeProp(String typeProp) {
        this.typeProp.set(typeProp);
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }
}
