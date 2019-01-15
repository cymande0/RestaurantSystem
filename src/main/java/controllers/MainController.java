package controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import utils.FxmlUtils;


public class MainController {

    @FXML
    public LoginController loginWindowController;

    @FXML
    private BorderPane borderPane;

    @FXML
    private MenuButtonsController mainButtonsController;

    @FXML
    private void initialize() {
        mainButtonsController.setMainController(this);
    }

    public void setInfoInCentre(String fxmlPath){
        this.borderPane.setCenter(FxmlUtils.fxmlLoader(fxmlPath));
    }


//    public void setScreen(Pane pane){
//
//        mainPane.getChildren().clear();
//        mainPane.getChildren().add(pane);
//    }

}
