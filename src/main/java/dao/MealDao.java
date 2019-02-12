package dao;

import datebase.models.Meal;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class MealDao {

    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;

    public MealDao(){
        entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void getSth(){
        String queryAllMeals = "select m from Meal m where m.nameOfMeal = 'Bigos'";
//        Query query = entityManager.createQuery(queryAllMeals);
//        List results = query.list();
        TypedQuery<Meal> query = entityManager.createQuery(queryAllMeals, Meal.class);
        List<Meal> meals = query.getResultList();

        System.out.println(meals.size());
//        for(Meal meal:meals){
//            System.out.println(meal.getNameOfMeal());
//        }


        entityManager.close();
        entityManagerFactory.close();
    }

}
