import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class LoginController {
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;

    public void handleLogin() throws Exception {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.equals("josua102022300271") && password.equals("1234")) {
            Stage stage = (Stage) usernameField.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("src/inventory.fxml"))));
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Invalid Username or Password!");
            alert.showAndWait();
        }
    }
}
