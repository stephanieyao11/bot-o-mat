package sample.controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import sample.models.Player;

import java.io.IOException;


public class ControllerConfig extends ControllerStart {
    @FXML
    private TextField name;

    @FXML
    private ComboBox robotCombo;

    @FXML
    public void setNext(ActionEvent actionEvent) throws IOException {
        String value = (String) robotCombo.getValue();
        String text = name.getText();
        if (!(text.isBlank() || text.isEmpty())) {
            model = new Player(text, value);
            Parent root = FXMLLoader.load(getClass().getResource("../views/task.fxml"));
            stage.setScene(new Scene(root, 600, 494));
            stage.show();
        } else {
            System.out.println("Please Enter Name");
        }

    }
}
