package ru.kazakov.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    private TextField sTextFIeld;

    @FXML
    private TextField tTextFIeld;

    @FXML
    private TextField v1TextFIeld;

    @FXML
    private TextField v2TextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
       float v1= Float.parseFloat(v1TextFIeld.getText());
       float v2= Float.parseFloat(v2TextField.getText());
       float s= Float.parseFloat(sTextFIeld.getText());
       float t=Float.parseFloat(tTextFIeld.getText());

       float s2=s+t*(v1+v2);
       resLabel.setText("s2=" +s2+ "км");
    }

}
