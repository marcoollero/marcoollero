module com.login {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.login to javafx.fxml;
    exports com.login;
    exports com.login.controller;
    opens com.login.controller to javafx.fxml;

    opens com.login.logic to javafx.fxml;
    exports com.login.logic;

    opens com.login.utilities to javafx.fxml;
    exports com.login.utilities;

    opens com.login.model to javafx.fxml;
    exports com.login.model;
}