//package sample;
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;
//import javafx.stage.Stage;
//import javafx.scene.media.MediaView;
//
//import java.io.File;
//
//public class Main extends Application {
//
//    protected static Stage stage;
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        String path = "src/sample/media/farm.mp3";
//
//        //Instantiating Media class
//        //Media media = new Media(new File(path).toURI().toString());
//
//        //Instantiating MediaPlayer class
//        //MediaPlayer mediaPlayer = new MediaPlayer(media);
//
//        //by setting this property to true, the audio will be played
//        //mediaPlayer.setAutoPlay(true);
//        stage = primaryStage;
//        Parent root = FXMLLoader.load(getClass().getResource("views/welcome.fxml"));
//        primaryStage.setTitle("Bot-O-Mat");
//        primaryStage.setScene(new Scene(root, 600, 400));
//        primaryStage.show();
//    }
//
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.scene.media.MediaView;

import java.io.File;

public class Main extends Application {

    protected static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        String path = "src/sample/media/farm.mp3";

        //Instantiating Media class
        Media media = new Media(new File(path).toURI().toString());

        //Instantiating MediaPlayer class
        MediaPlayer mediaPlayer = new MediaPlayer(media);

        //by setting this property to true, the audio will be played
        mediaPlayer.setAutoPlay(true);
        stage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("views/welcome.fxml"));
        primaryStage.setTitle("Bot-O-Mat");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
