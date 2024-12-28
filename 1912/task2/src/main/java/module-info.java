module ru.kazakov.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kazakov.task2 to javafx.fxml;
    exports ru.kazakov.task2;
}