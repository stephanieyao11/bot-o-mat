

package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import sample.Main;
import sample.models.Player;


import java.io.IOException;

public class ControllerStart extends Main {
    protected static Player model;
    protected static Player model1;
    @FXML
    private Button start;

    @FXML
    public void setStart(ActionEvent event) throws IOException {
        Stage currStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/config.fxml"));
        Parent root = loader.load();
        currStage.setScene(new Scene(root, 600, 400));
    }
}
