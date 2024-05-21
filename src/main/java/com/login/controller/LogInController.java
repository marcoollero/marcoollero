package com.login.controller;

import com.login.logic.login;
import com.login.model.Login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.sql.SQLException;

public class LogInController {
    @FXML
    private Text actionTarget;

    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;
   
    }
}

    @FXML
    public void onLoginButtonClick(ActionEvent actionEvent) throws SQLException {
        Login userData = new Login(usernameField.getText(),passwordField.getText());
        login loginLogic = new login();
        if (!loginLogic.loginQuery(userData)) {
            actionEvent.setText("Password is incorrect");
        } else {
            actionEvent.setText("Password is correct");
        }

    }
}