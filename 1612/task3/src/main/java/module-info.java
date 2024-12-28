module ru.kazakov.task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kazakov.task3 to javafx.fxml;
    exports ru.kazakov.task3;
}