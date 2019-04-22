package controllers.mainWindow;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import utils.FxmlUtils;

public class MainController {

    public VBox restaurantMenu;
    @FXML
    private Pane loginPopup;

    @FXML
    private BorderPane borderPane;

    @FXML
    private LoginController loginWindowController;

    @FXML
    private MenuButtonsController menuButtonsController;

    @FXML
    public void initialize() {
        loginWindowController.setMainController(this);
        menuButtonsController.setPane(borderPane);
        loginWindowController.setMenuButtonsController(menuButtonsController);
    }

   public void setInfoInCentre(String fxmlPath){
        this.borderPane.setCenter(FxmlUtils.fxmlLoader(fxmlPath));
    }


    public void disableLogin(){
        borderPane.getChildren().remove(loginPopup);
    }

}