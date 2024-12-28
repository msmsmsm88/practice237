package ru.kazakov.task2;

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
        int days;

        switch (N) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31; break;
            case 4: case 6: case 9: case 11:
                days = 30; break;
            case 2:
                days = 28; break;
            default:
                days = 0; // Неверный месяц
        }

        if (days == 0) {
            resLabel.setText("Некорректный номер месяца");
        } else {
            resLabel.setText("Количество дней: " + days);
        }
    }

    }

