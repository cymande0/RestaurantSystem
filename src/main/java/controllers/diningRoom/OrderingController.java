package controllers.diningRoom;

import datebase.Dao.MealDao;
import datebase.entity.MealDTO;
import datebase.entity.MealProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.ArrayList;
import java.util.PropertyPermission;

public class OrderingController {

    @FXML
    public static ListView listView;

    @FXML
    public Label numberOfTable;

    @FXML
    public Pane pane;

    private MealDTO mealDTO = new MealDTO();
    private MealDao mealDao = new MealDao();
    @FXML
    public TableColumn<MealProperty, String> name;
    @FXML
    public TableColumn<MealProperty, String> composition;
    @FXML
    public TableColumn<MealProperty, Double> price;
    @FXML
    public TableColumn<MealProperty, Button> add;
    @FXML
    private TableView table;

    private ArrayList<MealProperty> mealsProperties;

    public static ObservableList<MealProperty> tableDate;
    public static ObservableList<String> tableDateStr;

    public static ObservableList<String> getTableDateStr() {
        return tableDateStr;
    }

    public static void setTableDateStr(ObservableList<String> tableDateStr) {
        OrderingController.tableDateStr = tableDateStr;
    }

    @FXML
    public void initialize() {
        initTable();
        loadData();
//        mealsProperties = mealDTO.convertMealToMealProperty(mealDao.getAllMeals());
//        name.setCellValueFactory(new PropertyValueFactory<MealProperty, String>("nameProp"));
//        price.setCellValueFactory(new PropertyValueFactory<MealProperty, Double>("priceProp"));
//        add.setCellValueFactory(new PropertyValueFactory<MealProperty, String>("button"));
//        final ObservableList<MealProperty> mealLists = FXCollections.observableArrayList(mealsProperties);
//        table.setItems(mealLists);

    }

    private void initTable(){
        initCols();
    }

    private void initCols(){
        mealsProperties = mealDTO.convertMealToMealProperty(mealDao.getAllMeals());
        name.setCellValueFactory(new PropertyValueFactory<>("nameProp"));
        price.setCellValueFactory(new PropertyValueFactory<>("priceProp"));
        add.setCellValueFactory(new PropertyValueFactory<>("button"));
//        final ObservableList<MealProperty> mealLists = FXCollections.observableArrayList(mealsProperties);

        editableCols();
    }

    private void editableCols(){
        name.setCellFactory(TextFieldTableCell.forTableColumn());
        name.setOnEditCommit(e -> {
          e.getTableView().getItems().get(e.getTablePosition().getRow()).setNameProp(e.getNewValue());
        });

//        price.setCellFactory(TextFieldTableCell.forTableColumn());
//        price.setOnEditCommit(e -> {
//            e.getTableView().getItems().get(e.getTablePosition().getRow()).setPriceProp(e.getNewValue());
//        });

        table.setEditable(true);
    }

    private void loadData(){
        tableDate = FXCollections.observableArrayList(mealsProperties);
//        tableDate.add(mealsProperties);
        table.setItems(tableDate);
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

    public void setNumberOfTable(String numberOfTable) {
        this.numberOfTable.textProperty().setValue(numberOfTable);
        listView.setItems(tableDateStr);
    }
}
