package controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import utils.FxmlUtils;

public class MainController {

    @FXML
    private Pane pane;

    @FXML
    private BorderPane borderPane;

    @FXML
    private LoginController loginWindowController;

    @FXML
    private MenuButtonsController menuButtonsController;

    @FXML
    public void initialize() {
        loginWindowController.setMainController(this);
        loginWindowController.setMenuButtonsController(menuButtonsController);
    }

   public void setInfoInCentre(String fxmlPath){
        this.borderPane.setCenter(FxmlUtils.fxmlLoader(fxmlPath));
    }


    public void disableLogin(){
        borderPane.getChildren().remove(pane);
    }

}