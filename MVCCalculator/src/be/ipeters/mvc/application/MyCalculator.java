package be.ipeters.mvc.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class MyCalculator  extends Application {
    
  
    @Override
    public void start(Stage primaryStage) {
        try {
            // Read file fxml and draw interface.
            Parent root = FXMLLoader.load(getClass()
                    .getResource("/be/ipeters/mvc/application/MyScene.fxml"));
 
            primaryStage.setTitle("My CALCULATOR");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
         
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        launch(args);
        MVCView theView = new MVCView();

        MVCModel theModel = new MVCModel();

        MVCController theController = new MVCController(theView,theModel);

        theView.setVisible(true);
    }
    
}