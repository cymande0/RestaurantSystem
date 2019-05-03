package controllers.diningRoom;

import controllers.mainWindow.MenuButtonsController;
import datebase.entity.MealProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import utils.FxmlUtils;

import java.io.IOException;
import java.util.ArrayList;

public class RoomController {

    private static final String ORDERING = "/fxml/Ordering.fxml";
    private static final String ORDERING_LIST = "/fxml/OrderingList.fxml";
    private OrderingListController orderingListController = null;
    private FXMLLoader loader = null;
    private Stage stage;

    @FXML
    public void initialize() {
    }

    public void order1stTable(ActionEvent actionEvent) {
        showMenu();
    }

    public void pay1stTable(ActionEvent actionEvent) {
    }

    public void orderingList1stTable(MouseEvent mouseEvent) {
        showTable("1");
    }

    public void preview1stTable(MouseEvent mouseEvent) {

    }

    public void pay2ndTable(ActionEvent actionEvent) {
    }

    public void order2ndTable(ActionEvent actionEvent) {
    }

    public void preview2stTable(MouseEvent mouseEvent) {
    }

    public void orderingList2stTable(MouseEvent mouseEvent) {
        showTable("2");
    }

    public void order3rdTable(ActionEvent actionEvent) {
    }

    public void pay3rdTable(ActionEvent actionEvent) {
    }

    public void orderingList3thTable(MouseEvent mouseEvent) {
        showTable("3");
    }

    public void preview3thTable(MouseEvent mouseEvent) {
    }

    public void order4thTable(ActionEvent actionEvent) {
    }

    public void pay4thTable(ActionEvent actionEvent) {
    }

    public void orderingList4thTable(MouseEvent mouseEvent) {
        showTable("4");
    }

    public void preview4thTable(MouseEvent mouseEvent) {
    }

    public void order5thTable(ActionEvent actionEvent) {
    }

    public void pay5thTable(ActionEvent actionEvent) {
    }

    public void orderingList5thTable(MouseEvent mouseEvent) {
        showTable("5");
    }

    public void preview5thTable(MouseEvent mouseEvent) {
    }

    public void order6stTable(ActionEvent actionEvent) {
    }

    public void pay6stTable(ActionEvent actionEvent) {
    }

    public void orderingList6thTable(MouseEvent mouseEvent) {
        showTable("6");
    }

    public void preview6thTable(MouseEvent mouseEvent) {
    }

    public void order7stTable(ActionEvent actionEvent) {
    }

    public void pay7stTable(ActionEvent actionEvent) {
    }

    public void orderingList7thTable(MouseEvent mouseEvent) {
        showTable("7");
    }

    public void preview7thTable(MouseEvent mouseEvent) {
    }

    public void showMenu(){
        Pane tableOrdering = FxmlUtils.fxmlLoader(ORDERING);
        Stage stage = new Stage();
        stage.setScene(new Scene(tableOrdering));
        stage.show();
    }

    public void showTable(String numberOfTable)  {
        Pane pane = null;
        loader = FxmlUtils.getLoader(ORDERING_LIST);
        try {
            pane = loader.load();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        orderingListController = loader.getController();
        orderingListController.setNumberOfTable(numberOfTable);
        stage = new Stage();
        stage.setScene(new Scene(pane));
        stage.show();
    }
}
