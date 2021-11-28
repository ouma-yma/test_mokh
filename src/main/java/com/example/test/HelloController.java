package com.example.test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloController {
    @FXML
    private TextField firstname;

    @FXML
    private TextField lastname;

    @FXML
    private TextField email;

    @FXML
    private TextField password;

    @FXML
    private TextField passwordConf;

    @FXML
    private Button ButtonRegister;

    @FXML
    void Register(ActionEvent event) {

    }

    @FXML
    private Hyperlink back;

    public void switchScene2(ActionEvent e) throws IOException {
        Parent pane = FXMLLoader.load(
                getClass().getResource("offre.fxml"));
        Scene scene = new Scene(pane);
        Stage stage= (Stage) ((Node)e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void back(ActionEvent event) throws IOException {
        Parent panel = FXMLLoader.load(
                getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(panel);
        Stage stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private Hyperlink register;

    @FXML
    void registerLink(ActionEvent event) throws IOException {
        Parent register = FXMLLoader.load(getClass().getResource("inscription.fxml"));
        Scene scene = new Scene(register);
        Stage stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private TextField nom;

    @FXML
    private TextField mdp;

    @FXML
    private Label welcomeText;

    @FXML
    private Button BtnWelcome;

    @FXML
    void onClickWelcomPage(ActionEvent event) {
        welcomeText.setText("bienvenu!");
    }
}