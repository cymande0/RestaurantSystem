package datebase.dbutils;

import datebase.entity.Meal;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class DBManager {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory(){
        try {
            if(sessionFactory == null) {
                Configuration configuration = new Configuration()
                        .addAnnotatedClass(Meal.class)
                        .configure("hibernate.cfg.xml");
                System.out.println("Hibarante configuration loaded");

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().
                        applySettings(configuration.getProperties())
                        .build();

                System.out.println("Hibernate serviceRegistry created");
                SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
                return sessionFactory;
            }
        } catch (Throwable ex){
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        return null;
    }
}
