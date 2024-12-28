module ru.kazakov.task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kazakov.task4 to javafx.fxml;
    exports ru.kazakov.task4;
}