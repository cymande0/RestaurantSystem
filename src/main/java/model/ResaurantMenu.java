package model;

import java.util.ArrayList;
import java.util.List;

public class ResaurantMenu {

    private List<Meal> listOfAvailableMeals = new ArrayList <Meal>();

    public List<Meal> getListOfAvailableMeals() {
        return listOfAvailableMeals;
    }

    public void setListOfAvailableMeals(List<Meal> listOfAvailableMeals) {
        this.listOfAvailableMeals = listOfAvailableMeals;
    }
}
