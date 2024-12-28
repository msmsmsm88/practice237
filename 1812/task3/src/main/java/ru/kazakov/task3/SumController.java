package ru.kazakov.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aTextFIeld;

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
        float A=Float.parseFloat(aTextFIeld.getText().toString());
        float B=Float.parseFloat(bTextField.getText().toString());
        float C=Float.parseFloat(cTextField.getText().toString());
        if (A <= B && B <= C) {
            A *= 2;
            B *= 2;
            C *= 2;
        } else {
            A = -A;
            B = -B;
            C = -C;
        }

        resLabel.setText("Новые значения: A = " + A + ", B = " + B + ", C = " + C);

    }

}
