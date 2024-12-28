module ru.kazakov.task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kazakov.task6 to javafx.fxml;
    exports ru.kazakov.task6;
}