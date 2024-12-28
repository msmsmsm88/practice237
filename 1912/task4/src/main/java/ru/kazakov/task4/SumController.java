package ru.kazakov.task4;

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
        int N = Integer.parseInt(nTextField.getText());
        boolean isPowerOfThree = false;

        if (N > 0) {
            int temp = 1;
            while (temp < N) {
                temp *= 3;
            }
            isPowerOfThree = (temp == N);
        }

        resLabel.setText(Boolean.toString(isPowerOfThree));
    }

    }

