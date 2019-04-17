package datebase.Dao;

import datebase.dbutils.DBManager;
import datebase.entity.Meal;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import view.Input;

public class MealDao {

    private SessionFactory sessionFactory;
    private Input input;

    public MealDao(){
        this.sessionFactory = DBManager.getSessionFactory();
        this.input = new Input();
    }

    public void addMeal(){
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            session.save(new Meal(input.getMealName(), input.getMealPrice()));
            session.getTransaction().commit();
        }
        finally {
            session.close();
        }
    }

    public void deleteMeal(){
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            session.createQuery("delete from Meal where id=" + input.getID()).executeUpdate();
            session.getTransaction().commit();
        }
        finally {
            sessionFactory.close();
            session.close();
        }
    }
}
