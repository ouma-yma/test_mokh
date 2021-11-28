package com.example.test;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view"+
                ".fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 350, 460);
        Image image = new Image(getClass().getResource("job.png").toExternalForm());
        stage.getIcons().add(image);
        stage.setTitle("JOBY!");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        stage.setOnCloseRequest(event ->{
            event.consume();
            logout(stage);
        });
    }
    public void logout(Stage stage) {

        Alert alert= new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("logout");
        alert.setHeaderText("You are about to logout");
        alert.setContentText("Do you want to save before exiting? :");
        if(alert.showAndWait().get() == ButtonType.OK){
            stage.close();
        }
    }
    public static void main(String[] args) {
        launch();
    }
}