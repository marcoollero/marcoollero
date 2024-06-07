package comlogin.controller;

import comlogin.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ProfileController {
    @FXML
    private Button backbutton;
    @FXML
    private Label usernamelabel;
    @FXML
    private Label firstnamelabel;
    @FXML
    private Label lastnamelabel;

    public void onbackbuttonclick(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/UserInterface/Homepage.fxml"));
        Stage window;
        window = (Stage) backbutton.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 800, 500));
        window.setTitle("Home Page");
        window.show();
    }

}
