package ru.zelmex.gopagetopage.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

import static ru.zelmex.gopagetopage.util.Manager.showSecondScene;

public class MainController implements Initializable {

    @FXML
    private Button goButton;

    @FXML
    void goButtonOnAction(ActionEvent event) {
     showSecondScene("second-view.fxml", "Marathon Skills 2016 - Register as a runner");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
goButton.setStyle("-fx-background-color:#20B2AA; -fx-background-radius:5px; -fx-text-fill:#ffffff");
    }
}
