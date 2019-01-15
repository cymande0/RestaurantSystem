package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import utils.FxmlUtils;

import java.util.Locale;
import java.util.ResourceBundle;

import static javafx.scene.layout.BackgroundPosition.CENTER;
import static javafx.scene.layout.BackgroundRepeat.NO_REPEAT;
import static javafx.scene.layout.BackgroundSize.DEFAULT;

public class Main extends Application {

    private static final String BORDER_PANE_MAIN_FXML = "/fxml/MainBorderPane.fxml";
    private static final String BACKGROUND_PATH = "graphics/gallery_restaurant_04.jpg";

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {

        FxmlUtils fxml = new FxmlUtils();

     //   FXMLLoader loader = new FXMLLoader(this.getClass().getResource(BORDER_PANE_MAIN_FXML));
        
        Pane borderPane = FxmlUtils.fxmlLoader(BORDER_PANE_MAIN_FXML);
        borderPane.setBackground(new Background(new BackgroundImage(new Image(BACKGROUND_PATH), NO_REPEAT, NO_REPEAT, CENTER, DEFAULT)));
        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

//
//        //  Using bundles in purpose make an application more flexiable. It's possible choice a defult language of application
//        Locale.setDefault(new Locale("eng"));
//        ResourceBundle bundle = ResourceBundle.getBundle("bundles.messages");
//        loader.setResources(bundle);
//
//        BorderPane borderPane = loader.load();
//
//        String BACKGROUND_PATH = "graphics/gallery_restaurant_04.jpg" ;
//        Scene scene = new Scene(borderPane);
//
//        primaryStage.setScene(scene);
//        primaryStage.setTitle(bundle.getString("title.application"));
//        primaryStage.show();

//    public BackgroundImage getBackground(){
//      //  String url = "/home/konrad/Praca/src/main/resources/graphics/LaBoqueriaRestaurante06.jpg";
//        Image image = new Image("/home/konrad/Praca/src/main/resources/graphics/LaBoqueriaRestaurante06.jpg");
//
//        BackgroundImage myBackground = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
//        return  myBackground;
//    }
}
//        List<Meal> listOfAvailableMelas = new ArrayList<Meal>();
//
//
//        Meal meal1 = new Meal("Schabowy", "Danie glowne", 23.22);
//        Meal meal2 = new Meal("Schabowy", "Danie glowne", 23.22);
//        Meal meal3 = new Meal("Gulasz", "Danie glowne", 21.33);
//
//        restaurntMenu.addNewMeal(meal1);
//        restaurntMenu.addNewMeal(meal2);
//        restaurntMenu.addNewMeal(meal3);
//
//        listOfAvailableMelas = restaurntMenu.getListOfAvailableMeals();
//
//        for(Meal meal:listOfAvailableMelas){
//            System.out.println(meal.getName());
//        }
//
//
//        System.out.println("2");
//        restaurntMenu.removeMeal("Schabowy");
//        restaurntMenu.removeMeal("Gulasz");
//
//        listOfAvailableMelas = restaurntMenu.getListOfAvailableMeals();
//
//        for(Meal meal:listOfAvailableMelas){
//            System.out.println(meal.getName());
//        }
//




//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();

//        Owner owner = new Owner();
//        Cat cat = new Cat();
//
//        owner.setFirstName("Konrad");
//        owner.setLastName("Nowak");
//        cat.setName("Patsi");
//
//        owner.setCat(cat);

//        Employee employee = new Employee();
//        employee.setFirstName("Jan");
//        employee.setLastName("Nowak");
//        employee.setSalary(3000);
//
//        Phone phone1 = new Phone();
//        Phone phone2 = new Phone();
//
//        phone1.setNumber("2222");
//        phone1.setType("Private");
//
//        phone2.setNumber("11111");
//        phone2.setType("Work phone");
//
//        List<Phone> phones = new ArrayList<Phone>();
//        phones.add(phone1);
//        phones.add(phone2);
//
//        employee.setPhones(phones);
//        phone1.setEmployee(employee);
//        phone2.setEmployee(employee);

//        employee2.setFirstName("Konrad");
//        employee2.setLastName("Nowak");
//        employee2.setSalary(4000);
//
//        entityManager.getTransaction().begin();
//        entityManager.persist(employee);
//        entityManager.persist(phone1);
//        entityManager.persist(phone2);
//        entityManager.getTransaction().commit();
//
//        TypedQuery <Employee> query = entityManager.createQuery("select e from Employee e where e.lastName = : name", Employee.class);
//        query.setParameter("name","Nowak");
//
//        List <Employee> returnedEmployes = query.getResultList();
//
//        for(Employee e : returnedEmployes) {
//            System.out.println(e.getFirstName());
//        }


//        address.setLocality("Krakow");
//        address.setStreet("Krakowska");
//        address.setStreetNumber(32);
//        address.setZipCode("22-322");

//        address.setEmployee(employee);




//        employee.setId(1);
//        employee.setFirstName("Konrad");
//        employee.setLastName("Pieta");
//        employee.setSalary(5000.9);
//        employee.setSalary2(new BigDecimal(7326732.32));
//


//        entityManager.close();
//        entityManagerFactory.close();

