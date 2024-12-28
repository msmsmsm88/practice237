module ru.zelmex.gopagetopage {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.zelmex.gopagetopage to javafx.fxml;
    exports ru.zelmex.gopagetopage;
    exports ru.zelmex.gopagetopage.controller;
    opens ru.zelmex.gopagetopage.controller to javafx.fxml;
}