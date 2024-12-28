package ru.kazakov.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class LIstController {

    @FXML
    private Button addButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<Integer> dataListView;

    @FXML
    private TextField numberTextField;

    @FXML
    private Button okButton;
    private int totalStudents = 0; //  количество учеников
    private int unsatisfactoryCount = 0; // количество неудовлетворительных оценок
    private boolean allSolved = false; // проверка решения

    @FXML
    void addButtonOnAction(ActionEvent event) {
        String input = numberTextField.getText();
        try {
            int solvedProblems = Integer.parseInt(input);
            if (solvedProblems < 0 || solvedProblems > 10) {
                answerLabel.setText("Введите корректное количество решённых примеров (0-10).");
                return;
            }

            totalStudents++;

            if (solvedProblems < 5) {
                unsatisfactoryCount++;
            }
            if (solvedProblems == 10) {
                allSolved = true;
            }

            dataListView.getItems().add(solvedProblems);
            numberTextField.clear();
        } catch (NumberFormatException e) {
            answerLabel.setText("Введите корректное число.");


        }
    }

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        totalStudents = 0;
        unsatisfactoryCount = 0;
        allSolved = false;
        dataListView.getItems().clear();
        answerLabel.setText("");
        numberTextField.clear();

    }

    @FXML
    void okButtonOnAction(ActionEvent event) {
        if (totalStudents > 0) {
            answerLabel.setText("Неудовлетворительных оценок: " + unsatisfactoryCount);
            answerLabel.setText(answerLabel.getText() + "\n" + (allSolved ? "YES" : "NO"));
        } else {
            answerLabel.setText("Не введены данные о учениках.");

        }

    }
}
