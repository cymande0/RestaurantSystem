package controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import utils.FxmlUtils;

public class MainController {

    @FXML
    public VBox mainButtons;


    @FXML
    private BorderPane borderPane;

    @FXML
    private LoginController loginWindowController;

    @FXML
    public void initialize() {
        System.out.println(this);
        loginWindowController.setMainController(this);
    }


   public void setInfoInCentre(String fxmlPath){
        this.borderPane.setCenter(FxmlUtils.fxmlLoader(fxmlPath));
    }


//    public VBox getLoginWindow() {
//        return loginWindow;
//    }

    public BorderPane getBorderPane() {
        return borderPane;
    }

//    public void disabledLogin(){
//      //  System.out.println(this);
//        borderPane.getChildren().remove(loginWindow);
//    }
}


