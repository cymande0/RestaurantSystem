package utils;

import datebase.dbutils.HibernateUtil;
import datebase.entity.Meal;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import java.util.List;

public class PreparingDatebase {

    public static void fillDatebase() {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Meal schabowy = new Meal("Schanowy",13.99);
        Meal bigos = new Meal("Bigos", 9.99);
        Meal zur = new Meal("Zur",8.00);

        try {
            session.save(bigos);
            session.save(schabowy);
            session.save(zur);
            session.getTransaction().commit();
        }
        finally {
            session.close();
        }



    }
}
