//import domain.Employee;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//public class FindAndModify {
//
//    public static void main(String[] args) {
//
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        entityManager.getTransaction().begin();
//
//        Employee employee = entityManager.find(Employee.class, 1L);
//        System.out.println("First name: " + employee.getFirstName());
//        System.out.println(employee.getSalary());
//        employee.setSalary(5000);
//        System.out.println(employee.getSalary());
//
//        entityManager.getTransaction().commit();
//
//        entityManager.close();
//        entityManagerFactory.close();
//    }
//
//}
