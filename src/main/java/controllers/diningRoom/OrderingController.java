package controllers.diningRoom;

import datebase.Dao.MealDao;
import datebase.entity.MealDTO;
import datebase.entity.MealProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.PropertyPermission;

public class OrderingController {

    private MealDTO mealDTO = new MealDTO();
    private MealDao mealDao = new MealDao();
    @FXML
    public TableColumn name;
    @FXML
    public TableColumn composition;
    @FXML
    public TableColumn price;
    @FXML
    public TableColumn add;
    @FXML
    private TableView table;
    private ArrayList<MealProperty> mealsProperties;

    @FXML
    public void initialize(){
        mealsProperties = mealDTO.convertMealToMealProperty(mealDao.getAllMeals());
        name.setCellValueFactory(new PropertyValueFactory<MealProperty, String>("nameProp"));
        price.setCellValueFactory(new PropertyValueFactory<MealProperty, Double>("priceProp"));
        add.setCellValueFactory(new PropertyValueFactory<MealProperty, String>("button"));

        final ObservableList<MealProperty> mealLists = FXCollections.observableArrayList(mealsProperties);
        table.setItems(mealLists);

    }

    public void showAllDishes(ActionEvent actionEvent) {
    }

    public void showBreakfasts(ActionEvent actionEvent) {
    }

    public void showStarters(ActionEvent actionEvent) {
    }

    public void showSoups(ActionEvent actionEvent) {
    }

    public void showMainDishes(ActionEvent actionEvent) {
    }

    public void showDrinks(ActionEvent actionEvent) {
    }
}
