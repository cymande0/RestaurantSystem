package controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import utils.FxmlUtils;

public class MenuButtonsController {

    private static final String AUTHOR_INFO_FXML = "/fxml/AuthorInformation.fxml";

    private MainController mainController;

    private AuthorInfoController authorInfoController;

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    @FXML
    public void homePage(ActionEvent actionEvent) {
    }

    @FXML
    public void startProcess(ActionEvent actionEvent) {
    }

    @FXML
    public void showResuarantMenu(ActionEvent actionEvent) {
    }

    @FXML
    public void showHistoryOfChecks(ActionEvent actionEvent) {
    }

    @FXML
    public void showAuthorInfo(ActionEvent actionEvent) {
        Pane authorInfoWindow = FxmlUtils.fxmlLoader(AUTHOR_INFO_FXML);
        Stage stage = new Stage();
        stage.setScene(new Scene(authorInfoWindow));
        stage.show();
    }

    @FXML
    public void quitApplication(ActionEvent actionEvent) {
        Platform.exit();
    }
}
