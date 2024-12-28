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
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    private TextField xTextField;

    @FXML
    private TextField yTextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        float b = Float.parseFloat(bTextField.getText().toString());
        float y = Float.parseFloat(yTextField.getText().toString());
        float a = Float.parseFloat(aTextField.getText().toString());
        float x = Float.parseFloat(xTextField.getText().toString());
        if (Math.cos(x) == 0) {
            return;
        }
        if (Math.tan(x / 2) == 0) {
            return;
        }
        if (a * Math.pow(x, 3) + 2 < 0) {
            return;
        }
        double P = Math.pow(a+b,2)+a*Math.cos(a+b)+a*Math.sqrt(b)/a+b;
        double alpha =(x+y+Math.pow(x,2)+Math.pow(y,2))+x+y*Math.cos(x+y+Math.pow(x,2)+Math.pow(y,2))+x+y*Math.sqrt(Math.pow(x,2)+Math.sqrt(Math.pow(x,2)+Math.pow(y,2))/x+y+Math.pow(x,2)+Math.pow(y,2));
        resLabel.setText("При P = " + String.format("%.3f", P) + "  a = " + String.format("%.3f", alpha));
    }

}
