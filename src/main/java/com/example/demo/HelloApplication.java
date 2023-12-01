package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    a d = new a();
    @Override
    public void start(Stage stage) throws IOException {
        GridPane f =new GridPane();
        Scene scene = new Scene(f, 320, 240);
        Text tj = new Text(d.toString());
        stage.setTitle("Hello!");
        f.add(tj,0,0);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}