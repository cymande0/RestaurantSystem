package main;

import datebase.Dao.MealDao;
import datebase.dbutils.HibernateUtil;
import datebase.entity.Meal;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sqlite.core.DB;
import utils.PreparingDatebase;
import utils.FxmlUtils;
import utils.PreparingDatebase;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.sql.DriverManager;

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

        Pane borderPane = FxmlUtils.fxmlLoader(BORDER_PANE_MAIN_FXML);
        borderPane.setBackground(new Background(new BackgroundImage(new Image(BACKGROUND_PATH), NO_REPEAT, NO_REPEAT,
                CENTER, DEFAULT)));

        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.show();

        PreparingDatebase.fillDatebase();
    }
}