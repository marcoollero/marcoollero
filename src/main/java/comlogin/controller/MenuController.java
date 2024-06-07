package comlogin.controller;

import comlogin.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class MenuController {

    @FXML
    private Button mhomepagebutton;

    @FXML
    private Button maboutusbutton;

    @FXML
    private Button mprofilebutton;

    @FXML
    private Button icebabybutton;

    @FXML
    private Button selectobutton;

    @FXML
    private Button paypaybutton;

    @FXML
    private Button cornettobutton;

    @FXML
    private Button tuhogbutton;

    @FXML
    private Button chocolatebutton;

    @FXML
    private Button strawberrybutton;

    @FXML
    private Button mangobutton;

    @FXML
    private Button pandanbutton;

    @FXML
    private Button ubebutton;

    @FXML
    private Button oreobutton;

    @FXML
    private Button stikobutton;

    @FXML
    private Button sprinklesbutton;

    @FXML
    private Button marshmallowbutton;

    public void onmhomepagebuttonclick(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/UserInterface/Homepage.fxml"));
        Stage window = (Stage) mhomepagebutton.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 800, 500));
        window.setTitle("Home Page");
        window.show();
    }

    public void onmaboutusbuttonclick(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/UserInterface/AboutUs.fxml"));
        Stage window = (Stage) maboutusbutton.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 600, 400));
        window.setTitle("About Us");
        window.show();
    }

    public void onmprofilebuttonclick(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/UserInterface/Profile.fxml"));
        Stage window = (Stage) mprofilebutton.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 600, 400));
        window.setTitle("Profile");
        window.show();
    }

    public void onicebabybuttonclick(ActionEvent actionEvent) throws SQLException, IOException {




    }
}
