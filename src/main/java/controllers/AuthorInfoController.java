package controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import utils.FxmlUtils;

public class AuthorInfoController {
    @FXML
    private Button closeButton;

    private MainController mainController;

    public void backToMainWindow(ActionEvent actionEvent) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

}
