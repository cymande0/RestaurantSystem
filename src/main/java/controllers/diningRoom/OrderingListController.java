package controllers.diningRoom;

import datebase.entity.MealProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import utils.FxmlUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderingListController {

    @FXML
    public Pane pane;

    @FXML
    public static ListView listView;

    public static ListView listView2;

    @FXML
    private Label numberOfTable;
    private RoomController roomController = null;
    private ObservableList<String> data = FXCollections.observableArrayList();
    private MealProperty mealProperty = new MealProperty();

    @FXML
    public void initialize(){
//        listView = listView2;
//        listView2 = listView;
//        mealProperty.setOrderingListController(this);
//        List<String> values = Arrays.asList("one", "two", "three");
//
//        listView.setItems(FXCollections.observableList(values));

    }

    public void setNumberOfTable(String numberOfTable) {
        this.numberOfTable.textProperty().setValue(numberOfTable);
    }

    public void setRoomController(RoomController roomController){
        this.roomController = roomController;
    }

    public ListView getListView(ObservableList<String> items) {
        return listView;
    }

    public ObservableList<String> getData() {
        return data;
    }

    public void setData(ObservableList<String> data) {
        this.data = data;
    }

    public ListView<String> getListView() {
        return listView;
    }

    public void setListView(ListView<String> listView) {
        this.listView = listView;
    }

    public void addItemToListView(String item){
    }

    public static void add(String add){
    }
}
