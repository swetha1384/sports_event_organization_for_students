package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class stuteacontroller{

    @FXML
    private Button student;

    @FXML
    private Button teacher;

    @FXML
    void Student(ActionEvent event) {
        try {
            FXMLLoader loader=new FXMLLoader(getClass().getResource("sportregister.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));

            stage.show();

        }
        catch (IOException e) {

            e.printStackTrace();
        }
    }


    @FXML
    void Teacher(ActionEvent event) {
        try {
            FXMLLoader loader=new FXMLLoader(getClass().getResource("sportteacher.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));

            stage.show();

        }
        catch (IOException e) {

            e.printStackTrace();
        }
    }
    }


