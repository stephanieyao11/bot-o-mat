package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

import java.io.IOException;
import sample.models.Player;
public class ControllerLeader extends ControllerTask {
    @FXML
    private Label robot1Leader;

    @FXML
    private Label robot2Leader;
    public void initialize() {
        robot1Leader.setText(model.getName() + " has a score of " + model.getScore());
        robot2Leader.setText(model1.getName() + " has a score of " + model1.getScore());
    }
}
