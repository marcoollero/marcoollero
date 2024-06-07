package comlogin.controller;

import comlogin.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HomepageController {

    @FXML
    private Button menubutton;

    @FXML
    private Button aboutusbutton;

    @FXML
    private Button profilebutton;


    public void onmenubuttonclick(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/UserInterface/Menu.fxml"));
        Stage window = (Stage) menubutton.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 1500, 700));
        window.setTitle("Menu");
        window.show();
    }

    public void onaboutusbuttonclick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/UserInterface/AboutUs.fxml"));
        Stage window1 = (Stage) aboutusbutton.getScene().getWindow();
        window1.setScene(new Scene(fxmlLoader.load(),
                600,
                400));
        window1.setTitle("About US");
        window1.show();




    }

    public void onprofilebuttonclick(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/UserInterface/Profile.fxml"));
        Stage window2 = (Stage) profilebutton.getScene().getWindow();
        window2.setScene(new Scene(fxmlLoader.load(), 600, 400));
        window2.setTitle("Profile");
        window2.show();
    }
}
