package com.example.demo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
public class LoginController {

        @FXML
        private Button register;

        @FXML
        private void Register(ActionEvent event) {
            try {
                FXMLLoader loader=new FXMLLoader(getClass().getResource("loginas.fxml"));
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
