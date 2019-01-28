package utils;

import datebase.models.Meal;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FillDatebase {


    public void fillDatebase() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Meal schabowy = new Meal("Schanowy", "Obiad", 13.99);
        Meal bigos = new Meal("Bigos", "Obiad", 9.99);
//        Meal zurek = new Meal();
//        zurek.setNameOfMeal("Zurek");
//        zurek.setPrice(8.00);
//        zurek.setTypeOfMeal("Obiad");

        entityManager.getTransaction().begin();
        entityManager.persist(schabowy);
        entityManager.persist(bigos);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
