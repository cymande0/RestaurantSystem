package datebase.entity;

import datebase.Dao.MealDao;

import java.util.ArrayList;
import java.util.List;

public class MealDTO {

    MealDao mealDao = new MealDao();

    public ArrayList<MealProperty> convertMealToMealProperty(){
        ArrayList<MealProperty> mealPropertyList = new ArrayList<MealProperty>();
        List<Meal> mealList = new ArrayList<Meal>();
        mealList.addAll(mealDao.getAllMeals());

        for(Meal meal : mealList){
            mealPropertyList.add(new MealProperty(meal.getNameOfMeal(), meal.getTypeOfMeal(), meal.getPrice()));
        }
        return mealPropertyList;
    }

}
