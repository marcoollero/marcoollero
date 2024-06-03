package comlogin.controller;


import comlogin.logic.login;
import comlogin.model.Login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.SQLException;
import java.text.BreakIterator;

public class LogInController {
    @FXML
    private TextField usernamefield;

    @FXML
    private PasswordField passwordfield;

    private Button loginbutton;
    private BreakIterator actionTarget;

    @FXML
    public void onloginbuttonOnclick(ActionEvent actionEvent) throws SQLException{
        Login user_accounts = new Login(usernamefield.getText(), passwordfield.getText());
        login loginLogic = new login();
        if (loginLogic.loginQuery(user_accounts)){
            actionTarget.setText("password is correct");
            
        }else{
            actionTarget.setText("password is incorrect");
        }
    }

}