package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ResourceBundle;

public class MiracleController implements Initializable {
    @FXML
    public ComboBox<String> comboBox;
    @FXML
    public Button button;
    @FXML
    public TextArea textArea;
    @FXML
    public TextField textField;
    @FXML
    public Text text;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> value = FXCollections.observableArrayList();
        value.addAll("Java New bin", "Java Experience");
        comboBox.setItems(value);
        button.setOnAction(event -> saveToFile());
    }

    private void saveToFile() {
        StringBuilder builder = new StringBuilder();
        builder.append("Test one: ")
                .append(textField.getText())
                .append("\n")
                .append("Test two: ")
                .append(textArea.getText())
                .append("Text Course: ")
                .append(comboBox.getSelectionModel().getSelectedItem());
        try {
            Files.write(Paths.get("src/main/resources/file/file.txt"), builder.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

