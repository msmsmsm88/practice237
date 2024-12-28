package ru.kazakov.task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField nTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        double N = Double.parseDouble(nTextField.getText());
        double d = 10.0;
        double totalD = 0.0;
        int days = 0;

        while (totalD <= 200) {
            totalD += d;
            d += d * (N / 100);
            days++;
        }

        resLabel.setText("Дней: " + days + ", Суммарный пробег: " + totalD);
    }

    }


