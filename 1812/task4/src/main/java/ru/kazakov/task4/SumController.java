package ru.kazakov.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private TextField cTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        float A = Float.parseFloat(aTextField.getText().toString());
        float B = Float.parseFloat(bTextField.getText().toString());
        float C = Float.parseFloat(cTextField.getText().toString());
        double M = (A + B) / 2.0 * C;
        int k = (int) (M % 3);
        double y;
        if (k == 1) {
            y = Math.exp(M + C);
        } else if (k == 0) {
            y = Math.log(A / (double) B);
        } else {
            y = Math.sqrt(Math.abs((A + B) / 2.0 + C));
        }
        resLabel.setText("Значение функции y: " + y);

    }
}


