package comlogin.controller;


import comlogin.Main;
import comlogin.logic.login;
import comlogin.model.Login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.text.BreakIterator;

public class LogInController {
    @FXML
    private TextField usernamefield;

    @FXML
    private PasswordField passwordfield;

    @FXML
    private Label loginlabel;

    @FXML
    private Button loginbutton;


    @FXML
    public void onloginbuttonOnclick(ActionEvent actionEvent) throws SQLException, IOException {
        Login useraccounts = new Login(usernamefield.getText(), passwordfield.getText());
        login loginLogic = new login();
        if (loginLogic.loginQuery(useraccounts)){
            loginlabel.setText("password is correct");
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/UserInterface/Homepage.fxml"));
            Stage window = (Stage) loginbutton.getScene().getWindow();
            window.setScene(new Scene(fxmlLoader.load(), 800, 500));
            window.setTitle("Home Page");
            window.show();
            
        }else{
            loginlabel.setText("password is incorrect");
        }
    }

}