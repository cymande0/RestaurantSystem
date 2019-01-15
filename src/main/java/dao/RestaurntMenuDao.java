package dao;

import model.Meal;
import model.ResaurantMenu;

import java.util.ArrayList;
import java.util.List;

public class RestaurntMenuDao {

    private ResaurantMenu restaurantMenu = new ResaurantMenu();
    private List<Meal> listOfAvailableMeals = new ArrayList<Meal>();

    public List<Meal> getListOfAvailableMeals() {
        return listOfAvailableMeals;
    }

    public void addNewMeal(Meal meal){

        if (isMealExistsAlready(meal) == true) {
            System.out.println(meal.getName() + " existing already in menu.");
        }

        else {
            listOfAvailableMeals.add(meal);
            System.out.println(meal.getName() + " has been added properly.");
        }
    }

    public void removeMeal(String name) {
        int foundPosition = findMeal(name);
        if (foundPosition >= -1) {
            listOfAvailableMeals.remove(foundPosition);
        }
    }


    public int findMeal(Meal meal){
        return this.listOfAvailableMeals.indexOf(meal);

    }

    public int findMeal(String nameOfMeal){
        for(int i = 0; i < listOfAvailableMeals.size(); i++){
            if(listOfAvailableMeals.get(i).getName().equals(nameOfMeal)){
                return i;
            }
        }
        return -1;
    }

    public boolean isMealExistsAlready(Meal meal){
        for(Meal addedMeal:listOfAvailableMeals){
            if(addedMeal.getName().equals(meal.getName())){
                return true;
            }
        }
        return false;
    }

}
