module com.fxlearning.sm.fristjavafxapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fxlearning.sm.fristjavafxapp to javafx.fxml;
    exports com.fxlearning.sm.fristjavafxapp;
}