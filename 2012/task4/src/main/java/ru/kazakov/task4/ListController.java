package ru.kazakov.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ListController {

    @FXML
    private Button addButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<?> dataListView;

    @FXML
    private TextField numberTextField;

    @FXML
    private Button okButton;

    @FXML
    void addButtonOnAction(ActionEvent event) {
        String xText = numberTextField.getText();
        String nText = numberTextField.getText();

        try {
            double x = Double.parseDouble(xText);
            int n = Integer.parseInt(nText);
            if (n <= 0) {
                answerLabel.setText("Ошибка ввода, N должно быть больше 0");
                return;
            }

            double result = calculateCosApproximation(x, n);
            answerLabel.setText(String.format("%.10f", result));


        } catch (NumberFormatException e) {
            answerLabel.setText("Ошибка ввода, Введите корректные числа");
        }
    }


    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        answerLabel.setText("");
        numberTextField.clear();
        numberTextField.clear();

    }

    @FXML
    void okButtonOnAction(ActionEvent event) {

    }


private double calculateCosApproximation(double x, int n) {
    double result = 1.0;
    for (int i = 1; i <= n; i++) {
        double numerator = Math.pow(x, 2 * i);
        double denominator = factorial(2 * i);
        double term = numerator / denominator;
        if (i % 2 == 0) {
            result += term;
        } else {
            result -= term;
        }
    }
    return result;
}

private long factorial(int n) {
    long result = 1;
    for (int i = 2; i <= n; i++) {
        result *= i;
    }
    return result;
}
private void showAlert(String title, String content) {
    Alert alert = new Alert(Alert.AlertType.ERROR);
    alert.setTitle(title);
    alert.setHeaderText(null);
    alert.setContentText(content);
    alert.showAndWait();
}

}