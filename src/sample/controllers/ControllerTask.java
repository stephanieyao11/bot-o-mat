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
import sample.models.Player;

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
    @FXML
    private Text task6;
    @FXML
    private Text task7;
    @FXML
    private Text task8;
    @FXML
    private Text task9;
    @FXML
    private Text task10;
    @FXML
    private Label completedSlot1;
    @FXML
    private Label completedSlot2;
    @FXML
    private Label completedSlot3;
    @FXML
    private Label completedSlot4;
    @FXML
    private Label completedSlot5;
    @FXML
    private Label completedSlot6;
    @FXML
    private Label completedSlot7;
    @FXML
    private Label completedSlot8;
    @FXML
    private Label completedSlot9;
    @FXML
    private Label completedSlot10;
    @FXML
    private Label robotName;
    @FXML
    private Label robotName1;


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
            robotName.setText("Tasks for " + model.getName());
            task1.setText(taskArr[(int) (Math.random() * taskArr.length)]);
            task2.setText(taskArr[(int) (Math.random() * taskArr.length)]);
            task3.setText(taskArr[(int) (Math.random() * taskArr.length)]);
            task4.setText(taskArr[(int) (Math.random() * taskArr.length)]);
            task5.setText(taskArr[(int) (Math.random() * taskArr.length)]);

            if (!(model1.getName().isBlank() || model1.getName().isEmpty())) {
                robotName1.setText("Tasks for " + model1.getName());
                task6.setText(taskArr[(int) (Math.random() * taskArr.length)]);
                task7.setText(taskArr[(int) (Math.random() * taskArr.length)]);
                task8.setText(taskArr[(int) (Math.random() * taskArr.length)]);
                task9.setText(taskArr[(int) (Math.random() * taskArr.length)]);
                task10.setText(taskArr[(int) (Math.random() * taskArr.length)]);
            }

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
            model.incScore(10);
            completedSlot1.setText(task1.getText());
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
            model.incScore(10);
            completedSlot2.setText(task2.getText());
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
            model.incScore(10);
            completedSlot3.setText(task3.getText());
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
            model.incScore(10);
            completedSlot4.setText(task4.getText());
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
            model.incScore(10);
            completedSlot5.setText(task5.getText());
            task5.setText("Complete!");
            System.out.println("Task complete");
        }
    }

    @FXML
    public void handleMouseClick6(MouseEvent event) {
        if (!(task6.getText().isBlank() || task6.getText().isEmpty())) {
            System.out.println("Waiting to complete task...");
            try {
                Thread.sleep(taskMap.get(task6.getText()));
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            model1.incScore(10);
            completedSlot6.setText(task6.getText());
            task6.setText("Complete!");
            System.out.println("Task complete");
        }
    }

    @FXML
    public void handleMouseClick7(MouseEvent event) {
        if (!(task7.getText().isBlank() || task7.getText().isEmpty())) {
            System.out.println("Waiting to complete task...");
            try {
                Thread.sleep(taskMap.get(task6.getText()));
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            model1.incScore(10);
            completedSlot7.setText(task7.getText());
            task7.setText("Complete!");
            System.out.println("Task complete");
        }
    }

    @FXML
    public void handleMouseClick8(MouseEvent event) {
        if (!(task8.getText().isBlank() || task8.getText().isEmpty())) {
            System.out.println("Waiting to complete task...");
            try {
                Thread.sleep(taskMap.get(task6.getText()));
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            model1.incScore(10);
            completedSlot8.setText(task8.getText());
            task8.setText("Complete!");
            System.out.println("Task complete");
        }
    }

    @FXML
    public void handleMouseClick9(MouseEvent event) {
        if (!(task9.getText().isBlank() || task9.getText().isEmpty())) {
            System.out.println("Waiting to complete task...");
            try {
                Thread.sleep(taskMap.get(task9.getText()));
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            model1.incScore(10);
            completedSlot9.setText(task9.getText());
            task9.setText("Complete!");
            System.out.println("Task complete");
        }
    }

    @FXML
    public void handleMouseClick10(MouseEvent event) {
        if (!(task10.getText().isBlank() || task10.getText().isEmpty())) {
            System.out.println("Waiting to complete task...");
            try {
                Thread.sleep(taskMap.get(task10.getText()));
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            model1.incScore(10);
            completedSlot10.setText(task10.getText());
            task10.setText("Complete!");
            System.out.println("Task complete");
        }
    }

    @FXML
    public void setLeader(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../views/leader.fxml"));
        stage.setScene(new Scene(root, 600, 458));
        stage.show();
    }






}
