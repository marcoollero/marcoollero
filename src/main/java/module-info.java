module com.login {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens comlogin to javafx.fxml;
    exports comlogin;
    exports comlogin.controller;
    opens comlogin.controller to javafx.fxml;

    opens comlogin.logic to javafx.fxml;
    exports comlogin.logic;

    opens comlogin.utilities to javafx.fxml;
    exports comlogin.utilities;

    opens comlogin.model to javafx.fxml;
    exports comlogin.model;
}