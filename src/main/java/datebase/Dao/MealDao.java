package datebase.Dao;

import datebase.dbutils.HibernateUtil;
import datebase.entity.Meal;
import org.hibernate.*;
import view.Input;

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
            session.save(new Meal(input.getMealName(), input.getMealPrice()));
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

    public List<Meal> getAllMeals(){
        String sqlQuery = "SELECT * FROM Meal";
        SQLQuery query = session.createSQLQuery(sqlQuery);
        List<Meal> mealList = query.addEntity(Meal.class).list();
        return mealList;
    }
}
