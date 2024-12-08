import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
   @Override
    public void start(Stage primaryStage) throws Exception {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("src/login.fxml"));
    Parent root = loader.load();
    primaryStage.setScene(new Scene(root,500, 250));
    primaryStage.setTitle("Login");
    primaryStage.show();
}


    public static void main(String[] args)
    {
         launch(args);
    }
}