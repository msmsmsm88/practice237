package ru.kazakov.task2;

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
    private TextField cTextFIeld;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        float a = Float.parseFloat(aTextField.getText());
        float b = Float.parseFloat(bTextField.getText());
        float c = Float.parseFloat(cTextFIeld.getText());
            float ac = Math.abs(a - c);
            float bc = Math.abs(b - c);
            float result = ac * bc;
            resLabel.setText("Результат: " + result);
    }

}
