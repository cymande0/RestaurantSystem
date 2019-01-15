package controllers;

import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;

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

    private String password = NULL;

    @FXML
    public PasswordField passwordFiled;

    public void numberOne(ActionEvent actionEvent) {
       procces(this.ONE);
    }

    public void numberTwo(ActionEvent actionEvent) {
        this.addChar(this.TWO);
        checkLenghtOfPassword();
        passwordFiled.setPromptText(password);
    }

    public void numberThree(ActionEvent actionEvent) {
        this.addChar(this.THREE);
        passwordFiled.setPromptText(password);
    }

    public void numberFour(ActionEvent actionEvent) {
        this.addChar(this.FOUR);
        passwordFiled.setPromptText(password);
    }

    public void numberFive(ActionEvent actionEvent) {
        this.addChar(this.FIVE);
        passwordFiled.setPromptText(password);
    }

    public void numberSix(ActionEvent actionEvent) {
        this.addChar(this.SIX);
        passwordFiled.setPromptText(password);
    }

    public void numberSeven(ActionEvent actionEvent) {
        this.addChar(this.SEVEN);
        passwordFiled.setPromptText(password);
    }

    public void numberEight(ActionEvent actionEvent) {
        this.addChar(this.EIGHT);
        passwordFiled.setPromptText(password);
    }

    public void numberNine(ActionEvent actionEvent) {
        this.addChar(this.NINE);
        passwordFiled.setPromptText(password);
    }

    public void confrmButton(ActionEvent actionEvent) {
        this.showPassword();
        passwordFiled.setPromptText(password);
    }

    public void deleteText(ActionEvent actionEvent) {
        this.password = this.NULL;
        passwordFiled.setPromptText(password);
    }

    public void addChar(String anotherUserString) {
        this.password = new StringBuilder(this.password).append(anotherUserString).toString();
    }

    public void showPassword() {
        System.out.println(this.password);
    }

    public void checkLenghtOfPassword() {
        if (this.password.length() > 4) {
            this.password = password.substring(0, 3);
        }
    }

    public void procces(String sign){
        checkLenghtOfPassword();
        addChar(sign);
        passwordFiled.setPromptText(password);
    }

}
