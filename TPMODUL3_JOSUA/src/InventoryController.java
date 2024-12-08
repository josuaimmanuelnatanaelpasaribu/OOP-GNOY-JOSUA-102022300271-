import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventoryController {
    @FXML private TableView<Album> albumTable;
    @FXML private TextField albumNameField, artistField, totalField, availableField;

    public void initialize() {
        albumTable.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("albumName"));
        albumTable.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("artist"));
        albumTable.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("total"));
        albumTable.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("available"));
        albumTable.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("rented"));
    }

    public void addAlbum() {
        try {
            String name = albumNameField.getText();
            String artist = artistField.getText();
            int total = Integer.parseInt(totalField.getText());
            int available = Integer.parseInt(availableField.getText());
            albumTable.getItems().add(new Album(name, artist, total, available));
            showAlert("Album added successfully!");
        } catch (Exception e) {
            showAlert("Invalid data input!");
        }
    }

    public void deleteAlbum() {
        Album selected = albumTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            albumTable.getItems().remove(selected);
            showAlert("Album deleted successfully!");
        } else {
            showAlert("No album selected!");
        }
    }

    public void updateAlbum() {
        // Implementasi mirip dengan `addAlbum`.
    }

    public void rentSelected() {
        // Implementasi untuk mengurangi `available` dan menambah `rented`.
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION, message);
        alert.showAndWait();
    }
}
