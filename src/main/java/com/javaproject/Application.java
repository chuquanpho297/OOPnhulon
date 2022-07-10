package com.javaproject;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage){
        try{
//            System.out.println(Application.class.getResource("Query.fxml"));
            FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("Query.fxml"));
            Parent root = fxmlLoader.load();
            stage.setTitle("App");
            stage.setScene(new Scene(root));
            stage.show();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        launch();
    }
}