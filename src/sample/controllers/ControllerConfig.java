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
    private TextField name1;

    @FXML
    private ComboBox robotCombo1;


    @FXML
    public void setNext(ActionEvent actionEvent) throws IOException {
        String value = (String) robotCombo.getValue();
        String text = name.getText();
        String value1 = (String) robotCombo1.getValue();
        String text1 = name1.getText();
        if (!(text.isBlank() || text.isEmpty())) {
            model = new Player(text, value, 0);
            if (!(text1.isBlank() || text1.isEmpty())) {
                model1 = new Player(text1, value1, 0);
            }
            Parent root = FXMLLoader.load(getClass().getResource("../views/task.fxml"));
            stage.setScene(new Scene(root, 600, 494));
            stage.show();
        } else {
            System.out.println("Please Enter Name");
        }

    }
}
