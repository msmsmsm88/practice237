package ru.kazakov.task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField nTextFIeld;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int N = Integer.parseInt(nTextFIeld.getText());
        boolean hasTwo = false;

        while (N > 0) {
            if (N % 10 == 2) {
                hasTwo = true;
                break;
            }
            N /= 10;
        }

        resLabel.setText("Содержит цифру '2': " + hasTwo);
    }

    }


