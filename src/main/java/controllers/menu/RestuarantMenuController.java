package controllers.menu;

import controllers.mainWindow.MainController;
import datebase.Dao.MealDao;
import datebase.entity.Meal;
import datebase.entity.MealDTO;
import datebase.entity.MealProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.*;
import java.util.ArrayList;

public class RestuarantMenuController {

    private MealDTO mealDTO = new MealDTO();
    private MealDao mealDao = new MealDao();
    @FXML
    public TableColumn name;
    @FXML
    public TableColumn composition;
    @FXML
    public TableColumn price;
    @FXML
    private TableView table;
    private ArrayList<Meal> meals;
    private ArrayList<MealProperty> mealsProperties;
    private MainController mainController;
    public Button addMealButton;
    public TextField nameTextFiled;
    public TextField priceTypeField;
    public ChoiceBox choiceTypeOfMeal;

    @FXML
    public void initialize(){
        processOfDisplayingSpecificTypeOfMeals("all");
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public void processOfDisplayingSpecificTypeOfMeals(String typeOfMeal){
        if(typeOfMeal.equals("all")) {
            mealsProperties = mealDTO.convertMealToMealProperty(mealDao.getAllMeals());
        }
        else {
            mealsProperties = mealDTO.convertMealToMealProperty(mealDao.getTSpecficTypeOfMeals(typeOfMeal));
        }
        name.setCellValueFactory(new PropertyValueFactory<MealProperty, String>("nameProp"));
        price.setCellValueFactory(new PropertyValueFactory<MealProperty, Double>("priceProp"));
        final ObservableList<MealProperty> mealLists = FXCollections.observableArrayList(mealsProperties);
        table.setItems(mealLists);
    }

    public void showAllDishes(ActionEvent actionEvent) {
       processOfDisplayingSpecificTypeOfMeals("all");
    }

    public void showMainDishes(ActionEvent actionEvent) {
        processOfDisplayingSpecificTypeOfMeals("Danie glowne");
    }

    public void showBreakfasts(ActionEvent actionEvent) {
        processOfDisplayingSpecificTypeOfMeals("Sniadanie");
    }

    public void showStarters(ActionEvent actionEvent) {
        processOfDisplayingSpecificTypeOfMeals("Przystawka");
    }

    public void showSoups(ActionEvent actionEvent) {
        processOfDisplayingSpecificTypeOfMeals("Zupa");
    }

    public void showDrinks(ActionEvent actionEvent) {
        processOfDisplayingSpecificTypeOfMeals("Napoj");
    }

    public void createMealInstance(ActionEvent actionEvent) {
        String name = nameTextFiled.getText();
        String type = choiceTypeOfMeal.getValue().toString();
        Double price = Double.valueOf(priceTypeField.getText());
        mealDao.addMeal(new Meal(name, type, price));
    }
}
