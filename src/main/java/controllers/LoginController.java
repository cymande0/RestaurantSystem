package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import utils.FxmlUtils;

public class LoginController {

    private static final String ONE = "1";
    private static final String TWO = "2";
    private static final String THREE = "3";
    private static final String FOUR = "4";
    private static final String FIVE = "5";
    private static final String SIX = "6";
    private static final String SEVEN = "7";
    private static final String EIGHT = "8";
    private static final String NINE = "9";
    private static final String NULL = "";
    private static final String CORRECT_PASSWORD = "1233";
    private static final String CORRECT_LOGIN_POPUP = "/fxml/CorrectLogin.fxml";
    private static final String UNCCORECT_LOGIN_POPUP = "/fxml/UncorrectLogin.fxml";


    private static String password = NULL;

    private double percentOfProgessBar = 0;

    @FXML
    public Button successfulLogin;

    @FXML
    public Button unsuccessfulLogin;

    @FXML
    private ProgressBar progressBar;

    @FXML
    private PasswordField passwordFiled;

    public MainController mainController;

    public MenuButtonsController menuButtonsController;


    public void numberOne(ActionEvent actionEvent) {
        loginProcess(ONE);
    }

    public void numberTwo(ActionEvent actionEvent) {
        loginProcess(TWO);
    }

    public void numberThree(ActionEvent actionEvent) {
        loginProcess(THREE);
    }

    public void numberFour(ActionEvent actionEvent) {
        loginProcess(FOUR);
    }

    public void numberFive(ActionEvent actionEvent) {
        loginProcess(FIVE);
    }

    public void numberSix(ActionEvent actionEvent) {
        loginProcess(SIX);
    }

    public void numberSeven(ActionEvent actionEvent) {
        loginProcess(SEVEN);
    }

    public void numberEight(ActionEvent actionEvent) {
        loginProcess(EIGHT);
    }

    public void numberNine(ActionEvent actionEvent) {
        loginProcess(NINE);
    }

    public void confrmButton(ActionEvent actionEvent) {

        Pane popup = new Pane();
        Stage stage = new Stage();

        if(CORRECT_PASSWORD.equals(password)){
            popup = FxmlUtils.fxmlLoader(CORRECT_LOGIN_POPUP);
            stage.setScene(new Scene(popup));
            stage.show();
            mainController.disableLogin();
            menuButtonsController.enableButtons();
        }
        else{
            popup = FxmlUtils.fxmlLoader(UNCCORECT_LOGIN_POPUP);
            stage.setScene(new Scene(popup));
            stage.show();
        }

    }

    public void deleteText(ActionEvent actionEvent) {
        password = NULL;
        passwordFiled.setText(password);
        progressBarProcess(false);
    }

    public void correctLogin(ActionEvent actionEvent) {
        Stage stage = (Stage) successfulLogin.getScene().getWindow();
        stage.close();

    }

    public void tryLoggingAgain(ActionEvent actionEvent) {
    }

    public void addCharToPassword(String anotherUserString) {
        password = new StringBuilder(password).append(anotherUserString).toString();
    }

    public void checkLenghtOfPassword() {
        if (password.length() > 4) {
            password = password.substring(0, 4);
        }
    }

    public void loginProcess(String character){
        addCharToPassword(character);

        checkLenghtOfPassword();
        passwordFiled.setText(password);
        progressBarProcess(true);
    }

    public void progressBarProcess(boolean isIncreaseProgess){
        if(isIncreaseProgess == true) {
            percentOfProgessBar += 0.25;
        }
        else{
            percentOfProgessBar = 0;
        }
        progressBar.setProgress(percentOfProgessBar);
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public void setMenuButtonsController(MenuButtonsController menuButtonsController) {
        this.menuButtonsController = menuButtonsController;
    }
}
