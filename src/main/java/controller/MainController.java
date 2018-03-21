package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    public Button btnClick;
    @FXML
    public TextField textField;
    @FXML
    public CheckBox checkBox;
    @FXML
    public Text txtHello;
    @FXML
    public TextArea textArea;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnClick.setOnAction(event -> sayHello());

    }

    private void sayHello() {
        if (checkBox.isSelected()) {
            txtHello.setText("Hello " + textField.getText());
        } else {
            System.out.println("Select check nax");
        }
    }
}

