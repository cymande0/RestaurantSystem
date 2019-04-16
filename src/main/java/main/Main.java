package main;

import datebase.Dao.MealDao;
import datebase.dbutils.DBManager;
import datebase.entity.Meal;
import javafx.application.Application;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sqlite.core.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main extends Application {

    private static final String BORDER_PANE_MAIN_FXML = "/fxml/MainBorderPane.fxml";
    private static final String BACKGROUND_PATH = "graphics/gallery_restaurant_04.jpg";
//    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
//    private final EntityManager entityManager = entityManagerFactory.createEntityManager();

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {

        MealDao dao = new MealDao();
        dao.addMeal();
        dao.deleteMeal();


//        SessionFactory factory = new Configuration()
//                .configure("hibernate.cfg.xml")
                /*.addAnnotatedClass(Meal.class)*/
//                .buildSessionFactory();
//
//
//        Session session = factory.getCurrentSession();
//
//        try {
//            System.out.println("Creating new meal object");
//            Meal meal = new Meal("Zupa", 3.99);
//            session.beginTransaction();
//            System.out.println("Saving the meal...");
//            session.save(meal);
//            session.getTransaction().commit();
//            System.out.println("Done");
//        } finally {
//            factory.close();
//        }
////
//        String jdbcUrl = "jdbc:mysql://localhost:3306/mojaBaza";
//        String user = "konrad";
//        String pass = "pelikan123";
//
//        try {
//            System.out.println("Connecting to database: " + jdbcUrl);
//
//            Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
//
//            System.out.println("Connection successful!!!");
//
//        }
//        catch (Exception exc) {
//            exc.printStackTrace();
//        }

//        FillDatebase fd = new FillDatebase(entityManager);
//        fd.fillDatebase();

//        Pane borderPane = FxmlUtils.fxmlLoader(BORDER_PANE_MAIN_FXML);
//        borderPane.setBackground(new Background(new BackgroundImage(new Image(BACKGROUND_PATH), NO_REPEAT, NO_REPEAT, CENTER, DEFAULT)));
//        Scene scene = new Scene(borderPane);
//        primaryStage.setScene(scene);
//        primaryStage.show();

//        MealDao mealDao = new MealDao(entityManager);
//        mealDao.getSth();

    }
}