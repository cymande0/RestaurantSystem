package utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class FxmlUtils {

//    public Pane fxmlLoader(String fxmlPath) {
//
//        FXMLLoader loader = new FXMLLoader(this.getClass().getResource(fxmlPath));
//
//        try{
//            this.pane = loader.load();
//            return this.pane;
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//        return null;
//    }

    public static Pane fxmlLoader(String fxmlPath){
        FXMLLoader loader = new FXMLLoader(FxmlUtils.class.getResource(fxmlPath));
        try{
            return loader.load();
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static FXMLLoader getLoader(String fxmlPath) {
        FXMLLoader loader = new FXMLLoader(FxmlUtils.class.getResource(fxmlPath));
        return loader;
    }

}
