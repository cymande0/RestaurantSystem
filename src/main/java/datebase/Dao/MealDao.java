package datebase.Dao;

import datebase.dbutils.HibernateUtil;
import datebase.entity.Meal;
import org.hibernate.*;
import view.Input;

import java.util.ArrayList;
import java.util.List;

public class MealDao {

    private Session session;
    private Input input;

    public MealDao(){
        this.session = HibernateUtil.getSessionFactory().openSession();
        this.input = new Input();
    }

    public void addMeal(){
        try {
            session.beginTransaction();
            session.save(new Meal(input.getMealName(), input.getTypeOfMeal(), input.getMealPrice()));
            session.getTransaction().commit();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void deleteMeal(){
        try {
            session.beginTransaction();
            session.createQuery("delete from Meal where id=" + input.getID()).executeUpdate();
            session.getTransaction().commit();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Meal> getAllMeals(){
        String sqlQuery = "SELECT * FROM Meal";
        SQLQuery query = session.createSQLQuery(sqlQuery);
        List<Meal> mealList = query.addEntity(Meal.class).list();
        return (ArrayList<Meal>) mealList;
    }

    public ArrayList<Meal> getTSpecficTypeOfMeals(String typeOfMeal){
        String sqlQuery = "SELECT * FROM Meal WHERE type_of_meal = '"+ typeOfMeal + "'";
        SQLQuery query = session.createSQLQuery(sqlQuery);
        List<Meal> mealList = query.addEntity(Meal.class).list();
        return (ArrayList<Meal>) mealList;
    }
}
