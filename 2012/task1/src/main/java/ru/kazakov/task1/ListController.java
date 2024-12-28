package ru.kazakov.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ListController {

    @FXML
    private Button addButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<Integer> dataListView;

    @FXML
    private TextField numberTextFIeld;

    @FXML
    private Button okButton;
    private int sum = 0;
    private int count = 0;

    @FXML
    void addButtonOnAction(ActionEvent event) {
        String input = numberTextFIeld.getText();
        try {
            int number = Integer.parseInt(input);
            if (number == 0) {
                calculateAverage();
                return;
            }
            if (number >= 10 && number <= 99) {
                sum += number;
                count++;
            }
            dataListView.getItems().add(number);
            numberTextFIeld.clear();
        } catch (NumberFormatException e) {
            answerLabel.setText("Введите натуральное число.");


        }
    }

    private void calculateAverage() {
    }

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        numberTextFIeld.clear();
        dataListView.getItems().clear();
        answerLabel.setText("");
        sum = 0;
        count = 0;
    }

    @FXML
    void okButtonOnAction(ActionEvent event) {
         calculateAverage(); {
            if (count > 0) {
                double average = (double) sum / count;
                answerLabel.setText(String.format("Среднее арифметическое: %.2f", average));
            } else {
                answerLabel.setText("NO");
            }

        }
    }
}
