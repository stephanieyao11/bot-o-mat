package sample.controllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;

import java.io.IOException;
public class ControllerTask extends ControllerConfig{
    @FXML
    private Text task1;
    @FXML
    private Text task2;
    @FXML
    private Text task3;
    @FXML
    private Text task4;
    @FXML
    private Text task5;

    protected static Map<String, Integer> taskMap= new HashMap<>() {{
        put("Do the dishes", 1000);
        put("Sweep the house", 3000);
        put("Do the laundry", 10000);
        put("Take out the recycling", 4000);
        put("Make a sammich", 7000);
        put("Mow the lawn", 20000);
        put("Rake the leaves", 18000);
        put("Give the dog a bath", 14500);
        put("Bake some cookies", 8000);
        put("Wash the car", 20000);
    }};
    protected static String[] taskArr = {"Do the dishes", "Sweep the house", "Do the laundry", "Take out the recycling", "Make a sammich",
        "Mow the lawn", "Rake the leaves", "Give the dog a bath", "Bake some cookies", "Wash the car"};

    protected static boolean start1 = true;



    public void initialize() {

        if (start1) {
            task1.setText(taskArr[(int) (Math.random() * taskArr.length)]);
            task2.setText(taskArr[(int) (Math.random() * taskArr.length)]);
            task3.setText(taskArr[(int) (Math.random() * taskArr.length)]);
            task4.setText(taskArr[(int) (Math.random() * taskArr.length)]);
            task5.setText(taskArr[(int) (Math.random() * taskArr.length)]);

        }

    }

    @FXML
    public void handleMouseClick1(MouseEvent event) {
        if (!(task1.getText().isBlank() || task1.getText().isEmpty())) {
            System.out.println("Waiting to complete task...");
            try {
                Thread.sleep(taskMap.get(task1.getText()));
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            task1.setText("Complete!");
            System.out.println("Task complete");
        }
    }

    @FXML
    public void handleMouseClick2(MouseEvent event) {
        if (!(task2.getText().isBlank() || task2.getText().isEmpty())) {
            System.out.println("Waiting to complete task...");
            try {
                Thread.sleep(taskMap.get(task2.getText()));
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            task2.setText("Complete!");
            System.out.println("Task complete");
        }
    }

    @FXML
    public void handleMouseClick3(MouseEvent event) {
        if (!(task3.getText().isBlank() || task3.getText().isEmpty())) {
            System.out.println("Waiting to complete task...");
            try {
                Thread.sleep(taskMap.get(task3.getText()));
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            task3.setText("Complete!");
            System.out.println("Task complete");
        }
    }

    @FXML
    public void handleMouseClick4(MouseEvent event) {
        if (!(task4.getText().isBlank() || task4.getText().isEmpty())) {
            System.out.println("Waiting to complete task...");
            try {
                Thread.sleep(taskMap.get(task4.getText()));
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            task4.setText("Complete!");
            System.out.println("Task complete");
        }
    }

    @FXML
    public void handleMouseClick5(MouseEvent event) {
        if (!(task5.getText().isBlank() || task5.getText().isEmpty())) {
            System.out.println("Waiting to complete task...");
            try {
                Thread.sleep(taskMap.get(task5.getText()));
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            task5.setText("Complete!");
            System.out.println("Task complete");
        }
    }




}
