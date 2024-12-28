module ru.kazakov.task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kazakov.task5 to javafx.fxml;
    exports ru.kazakov.task5;
}