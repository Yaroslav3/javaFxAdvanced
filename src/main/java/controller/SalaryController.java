package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SalaryController implements Initializable {
    @FXML
    public Button buttonClear;
    @FXML
    public Button buttonOK;
    @FXML
    private TextField textField1;
    @FXML
    private TextField textField2;
    @FXML
    private TextField textField3;
    @FXML
    private TextField textField4;
    @FXML
    private TextField textField5;
    @FXML
    private TextField textField6;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private Label label4;
    @FXML
    private Label label5;
    @FXML
    private Label label6;
    private static double ress;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        showSalary();
    }

    private void showSalary() {

        buttonClear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getTextField1().clear();
                getTextField2().clear();
                getTextField3().clear();
                getTextField4().clear();
                getTextField5().clear();
                getTextField6().clear();

            }
        });
        buttonOK.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                int oclad = Integer.parseInt(getTextField1().getText());
                double prirabotoc = Double.parseDouble(getTextField2().getText());
                int workDay = Integer.parseInt(getTextField3().getText());
                double sever = Double.parseDouble(getTextField4().getText());
                int workDayPole = Integer.parseInt(getTextField5().getText());

                int f = oclad*2;// оклад за месяц
                int h = f/30; // вычисление день по окладу
                int pol = workDayPole*200; // вычисление полевых
                int v = h*workDay; // оклад за день * на количество раб.дней
                double n1 = v*0.25; // вычесление премии 25% от оклада
                double k = oclad * prirabotoc / 100;// вычисляем приработока
                double m = k + v + n1; // приработок + оклад + премия 25%
                double g = m * sever;  // умножение на северный коэффициент
                double t = g * 0.87+ pol;// вычитаем 13% подоходный налог + полевые
                System.out.println( " Ваша зарплата составляет: " + t  + " рублей" );
                ress = t;
                String text = String.valueOf(ress);
                textField6.setText(text);
            }
        });
    }

//оклад 8500 * 2 - это месячеый оклад ( норма 30 дней)
//17000/ на 30 дней и  получаем день по окладу = 566.66
// вот эти 566.66 умножаеш на количество дней отработаных в месяц.
// баллы * на оклад (8500 ) и / 100= получаем приработок
// вычисляем приемию это 25% от оклада ( не от 8500, а от дней отработаных в месяц)
// потом приработок + оклад ( не 8500 , а за отработаные дни в месяце) + премия
// эту сумму *2.2 и -13%
// ну и полевые это день 200 рублей
// с них 13% налога не снимают

    public Button getButtonClear() {
        return buttonClear;
    }

    public void setButtonClear(Button buttonClear) {
        this.buttonClear = buttonClear;
    }

    public Button getButtonOK() {
        return buttonOK;
    }

    public void setButtonOK(Button buttonOK) {
        this.buttonOK = buttonOK;
    }

    public TextField getTextField1() {
        return textField1;
    }

    public void setTextField1(TextField textField1) {
        this.textField1 = textField1;
    }

    public TextField getTextField2() {
        return textField2;
    }

    public void setTextField2(TextField textField2) {
        this.textField2 = textField2;
    }

    public TextField getTextField3() {
        return textField3;
    }

    public void setTextField3(TextField textField3) {
        this.textField3 = textField3;
    }

    public TextField getTextField4() {
        return textField4;
    }

    public void setTextField4(TextField textField4) {
        this.textField4 = textField4;
    }

    public TextField getTextField5() {
        return textField5;
    }

    public void setTextField5(TextField textField5) {
        this.textField5 = textField5;
    }

    public TextField getTextField6() {
        return textField6;
    }

    public void setTextField6(TextField textField6) {
        this.textField6 = textField6;
    }

    public Label getLabel1() {
        return label1;
    }

    public void setLabel1(Label label1) {
        this.label1 = label1;
    }

    public Label getLabel2() {
        return label2;
    }

    public void setLabel2(Label label2) {
        this.label2 = label2;
    }

    public Label getLabel3() {
        return label3;
    }

    public void setLabel3(Label label3) {
        this.label3 = label3;
    }

    public Label getLabel4() {
        return label4;
    }

    public void setLabel4(Label label4) {
        this.label4 = label4;
    }

    public Label getLabel5() {
        return label5;
    }

    public void setLabel5(Label label5) {
        this.label5 = label5;
    }

    public Label getLabel6() {
        return label6;
    }

    public void setLabel6(Label label6) {
        this.label6 = label6;
    }
}

