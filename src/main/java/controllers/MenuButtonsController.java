package controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import utils.FxmlUtils;

public class MenuButtonsController {

    private static final String AUTHOR_INFO_FXML = "/fxml/AuthorInformation.fxml";
    private static final String MENU_INFO = "/fxml/RestaurantMenu.fxml";

    @FXML
    public Button homeButton;

    @FXML
    public Button mainActionButton;

    @FXML
    public Button foodMenuButton;

    @FXML
    public Button historyOfOrdersButton;

    @FXML
    public Button infoAuthorButton;

    private MainController mainController;

    private AuthorInfoController authorInfoController;

    private BorderPane pane;

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public void setPane(BorderPane pane) {
        this.pane = pane;
    }

    @FXML
    public void homePage(ActionEvent actionEvent) {
        pane.getChildren().remove(pane.getCenter());
    }

    @FXML
    public void startProcess(ActionEvent actionEvent) {
    }

    @FXML
    public void showResuarantMenu(ActionEvent actionEvent) {
        Pane pane2 = FxmlUtils.fxmlLoader(MENU_INFO);
        pane.setCenter(pane2);
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

    public void enableButtons(){
        homeButton.setDisable(false);
        mainActionButton.setDisable(false);
        foodMenuButton.setDisable(false);
        historyOfOrdersButton.setDisable(false);
        infoAuthorButton.setDisable(false);
    }
}
