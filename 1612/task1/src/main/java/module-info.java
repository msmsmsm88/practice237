module ru.kazakov.task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kazakov.task1 to javafx.fxml;
    exports ru.kazakov.task1;
}