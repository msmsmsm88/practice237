package ru.kazakov.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField n2TextField;

    @FXML
    private TextField n3TextField;

    @FXML
    private TextField nTextFIeld;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int N = Integer.parseInt(nTextFIeld.getText().toString());
        int N2 = Integer.parseInt(n2TextField.getText().toString());
        int N3 = Integer.parseInt(n3TextField.getText().toString());
        int countPositive = 0;

        if (N > 0) { countPositive++; }
        if (N2 > 0) { countPositive++; }
        if (N3 > 0) { countPositive++; }

        resLabel.setText("Количество положительных чисел: " + countPositive);

    }

    }


