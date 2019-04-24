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

        Meal schabowy = new Meal("Schabowy", "Danie glowne", 13.99);
        Meal bigos = new Meal("Bigos", "Przystawka", 9.99);
        Meal zur = new Meal("Zur", "Zupa", 8.00);
        Meal jajecznica = new Meal("Jajecznica", "Sniadanie", 11.99);
        Meal omlet = new Meal("Omlet", "Sniadanie", 10.99);
        Meal sajgonki = new Meal("Sajgonki", "Przystawka", 9.00);
        Meal rosol = new Meal("Rosol", "Zupa", 9.00);
        Meal woda = new Meal("Woda", "Napoj", 3.00);
        Meal cola = new Meal("Cola", "Napoj", 4.00);

        try {
            session.save(bigos);
            session.save(schabowy);
            session.save(zur);
            session.save(jajecznica);
            session.save(omlet);
            session.save(sajgonki);
            session.save(rosol);
            session.save(woda);
            session.save(cola);
            session.getTransaction().commit();
        }
        finally {
            session.close();
        }
    }
}
