package utils;

import datebase.entity.Meal;
import datebase.entity.TypeOfMeal;
import javax.persistence.EntityManager;

public class FillDatebase {

    private EntityManager entityManager;

    public FillDatebase(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public void fillDatebase() {

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
    }

//    public void getSth(){
//        Query query = (Query) entityManager.createNativeQuery("select * FROM Meal");
//        List<TypeOfMeal> resultList = query.getResultList();
//        System.out.println(resultList.size());
//    }
}
