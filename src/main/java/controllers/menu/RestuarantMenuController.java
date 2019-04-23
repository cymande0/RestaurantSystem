package controllers.menu;

import controllers.mainWindow.MainController;
import datebase.Dao.MealDao;
import datebase.entity.Meal;
import datebase.entity.MealDTO;
import datebase.entity.MealProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

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
    private Button entireMenu;

    @FXML
    private Button breakfast;

    @FXML
    private Button starters;

    @FXML
    private Button soups;

    @FXML
    private Button mainDishes;

    @FXML
    private Button drinks;

    @FXML
    private TableView table;
    private ArrayList<Meal> meals;


    private MainController mainController;

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    @FXML
    public void initialize(){
        setDataToTableColoums();
    }

    public void setDataToTableColoums(){
        ArrayList<MealProperty> mealProperties = new ArrayList<MealProperty>();
        mealProperties = mealDTO.convertMealToMealProperty(mealDao.getAllMeals());
        name.setCellValueFactory(new PropertyValueFactory<MealProperty, String>("nameProp"));
        price.setCellValueFactory(new PropertyValueFactory<MealProperty, Double>("priceProp"));
        final ObservableList<MealProperty> mealLists = FXCollections.observableArrayList(mealProperties);
        table.setItems(mealLists);
    }


    public void mainDishes(ActionEvent actionEvent) {
        ArrayList<MealProperty> mealProperties = new ArrayList<MealProperty>();
        mealProperties = mealDTO.convertMealToMealProperty(mealDao.getMainDishes());
        name.setCellValueFactory(new PropertyValueFactory<MealProperty, String>("nameProp"));
        price.setCellValueFactory(new PropertyValueFactory<MealProperty, Double>("priceProp"));
        final ObservableList<MealProperty> mealLists = FXCollections.observableArrayList(mealProperties);
        table.setItems(mealLists);
    }
}
