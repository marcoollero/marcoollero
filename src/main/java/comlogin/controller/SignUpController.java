package comlogin.controller;

import comlogin.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SignUpController {

    @FXML
    private Button loginswitchbutton;

    @FXML
    private Button signupbutton;

    @FXML
    private TextField firstnamefield;

    @FXML
    private TextField lastnamefield;

    @FXML
    private TextField signusernamefield;

    @FXML
    private PasswordField signpasswordfield;


    public void onloginswitchbuttonclick(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/UserInterface/LogInForm.fxml"));
        Stage window = (Stage) loginswitchbutton.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 600, 400));
        window.setTitle("Log In Form");
        window.show();
    }


        }







