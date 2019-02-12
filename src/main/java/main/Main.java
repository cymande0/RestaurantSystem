package main;

import dao.MealDao;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import utils.FillDatebase;
import utils.FxmlUtils;

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

        FillDatebase fd = new FillDatebase();
        fd.fillDatebase();

        Pane borderPane = FxmlUtils.fxmlLoader(BORDER_PANE_MAIN_FXML);
        borderPane.setBackground(new Background(new BackgroundImage(new Image(BACKGROUND_PATH), NO_REPEAT, NO_REPEAT, CENTER, DEFAULT)));
        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.show();
//
        MealDao dao = new MealDao();
        dao.getSth();
    }
}