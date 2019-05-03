package controllers.diningRoom;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class OrderingListController {

    @FXML
    public Pane pane;

    @FXML
    private Label numberOfTable;

    private RoomController roomController = null;

    private boolean visibility = false;

    @FXML
    public void initialize(){
    }

    public void setVisibility(){
        if(visibility == false){
            pane.setVisible(true);
        }
        else {
            pane.setVisible(false);
        }
    }

    public void setNumberOfTable(String numberOfTable) {
        this.numberOfTable.textProperty().setValue(numberOfTable);
    }

    public void setRoomController(RoomController roomController){
        this.roomController = roomController;
    }

}
