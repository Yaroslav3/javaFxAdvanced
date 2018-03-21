package start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppManager extends Application{
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/salary.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("css/main.css");
        primaryStage.setScene(scene);
        primaryStage.setTitle("Salary");
        primaryStage.show();

    }

}
