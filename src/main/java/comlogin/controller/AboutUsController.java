package comlogin.controller;

import comlogin.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class AboutUsController {
    @FXML
    private Button returnbutton;

    public void onreturnbuttonclick(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/UserInterface/Homepage.fxml"));
        Stage window = (Stage) returnbutton.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 800, 500));
        window.setTitle("Home Page");
        window.show();
    }
}
