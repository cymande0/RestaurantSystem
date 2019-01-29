package utils;

import datebase.models.Meal;
import datebase.models.TypeOfMeal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FillDatebase {


    public void fillDatebase() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Meal schabowy = new Meal("Schanowy",13.99);
        Meal bigos = new Meal("Bigos", 9.99);
        Meal zur = new Meal("Zur",8.00);
        TypeOfMeal obiad = new TypeOfMeal("Obiad", schabowy);

        entityManager.getTransaction().begin();
        entityManager.persist(schabowy);
        entityManager.persist(bigos);
        entityManager.persist(zur);
        entityManager.persist(obiad);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
