package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class BeerController implements Initializable {
    @FXML
    private PieChart pieChart;
    @FXML
    private Button button;
    @FXML
    private TextField textFieldThree;
    @FXML
    private TextField textField;
    @FXML
    public TextField textFieldTwo;
    @FXML
    private Label label;
    @FXML
    private Label labelTwo;
    @FXML
    private Label labelThree;
    @FXML
    public Button buttonClear;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        showBeerStatistic();
    }

    private void showBeerStatistic() {

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ObservableList<PieChart.Data> values = FXCollections.observableArrayList();
                PieChart.Data staropramen = new PieChart.Data("Staropramen", Integer.parseInt(getTextField().getText()));
                PieChart.Data hoegaarden = new PieChart.Data("Hoegaarden", Integer.parseInt(getTextFieldTwo().getText()));
                PieChart.Data stella = new PieChart.Data("Stella Artois", Integer.parseInt(getTextFieldThree().getText()));
                pieChart.setTitle("Beer Statistic");
                values.addAll(staropramen, hoegaarden, stella);
                pieChart.setData(values);
            }
        });
        buttonClear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getTextField().clear();
                getTextFieldTwo().clear();
                getTextFieldThree().clear();
            }
        });

    }

    public TextField getTextFieldThree() {
        return textFieldThree;
    }

    public void setTextFieldThree(TextField textFieldThree) {
        this.textFieldThree = textFieldThree;
    }

    public TextField getTextField() {
        return textField;
    }

    public void setTextField(TextField textField) {
        this.textField = textField;
    }

    public TextField getTextFieldTwo() {
        return textFieldTwo;
    }

    public void setTextFieldTwo(TextField textFieldTwo) {
        this.textFieldTwo = textFieldTwo;
    }

    public PieChart getPieChart() {
        return pieChart;
    }

    public void setPieChart(PieChart pieChart) {
        this.pieChart = pieChart;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public Label getLabelTwo() {
        return labelTwo;
    }

    public void setLabelTwo(Label labelTwo) {
        this.labelTwo = labelTwo;
    }

    public Label getLabelThree() {
        return labelThree;
    }

    public void setLabelThree(Label labelThree) {
        this.labelThree = labelThree;
    }

    public Button getButtonClear() {
        return buttonClear;
    }

    public void setButtonClear(Button buttonClear) {
        this.buttonClear = buttonClear;
    }
}
