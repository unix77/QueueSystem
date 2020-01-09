package gui;

import javafx.application.Application;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Text;
import javafx.scene.text.TextBuilder;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Lab extends Application{


	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("X Labs");
		
		//variable responsible of the client number
		LongProperty score = new SimpleLongProperty(0);
		
		//setting the stage at the center of the screen
		primaryStage.centerOnScreen();
		
		//creating a layout, this is the "model" of how will be shown the app
		AnchorPane layout = new AnchorPane();
		
		
		//-------------------------setting up the Anchors----------------------
		//LEFT Anchor: Grid pane with the Box# --> client number
		//creating the grid Pane
		GridPane boxToClient = new GridPane();
		
		//setting the ammount of rows and columns it will have
		boxToClient.setPadding(new Insets(10 , 10 , 10 , 10));
		
		//setting the space between these rows and columns
		boxToClient.setVgap(8);
		boxToClient.setHgap(10);
		
		//"Box" & "Client" label
		Label box = new Label("Box");
		Label client = new Label("Client");
		
		//box numbers lables
		Label b1 = new Label("01");
		Label b2 = new Label("02");
		Label b3 = new Label("03");
		Label b4 = new Label("04");
		
		//adding the labels to the top of each column of the gridPane
		GridPane.setConstraints(box, 0, 0);
		GridPane.setConstraints(b1, 0, 1);
		GridPane.setConstraints(b2, 0, 2);
		GridPane.setConstraints(b3, 0, 3);
		GridPane.setConstraints(b4, 0, 4);
		
		//creating button components which will be filled with client numbers
		Button c1 = new Button("--");
		Button c2 = new Button("--");
		Button c3 = new Button("--");
		Button c4 = new Button("--");
		
		//adding the buttons to the gridPane
		GridPane.setConstraints(c1, 1, 1);
		GridPane.setConstraints(c2, 1, 2);
		GridPane.setConstraints(c3, 1, 3);
		GridPane.setConstraints(c4, 1, 4);
		
		
		
		
		GridPane.setConstraints(client, 1, 0);
		
		boxToClient.getChildren().addAll(box,b1,b2,b3,b4,client,c1,c2,c3,c4);
		
		AnchorPane.setLeftAnchor(boxToClient, 10.0);
		
		//layout.getChildren().addAll(boxToClient);
		
		//RIGHT Anchor: Grid pane with the Box# --> client number
		Media videoFile = new Media("file:///D://Downloads//video%20sample.mp4");
		MediaPlayer mediaPlayer = new MediaPlayer(videoFile);
		mediaPlayer.setVolume(10);
		
		//replay the video when it finishes
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
		
		
		MediaView mediaView = new MediaView(mediaPlayer);
		mediaView.setFitHeight(200.0);
		mediaView.setFitWidth(400.0);
		
		
		
		AnchorPane.setRightAnchor(mediaView, 10.0);
		
		layout.getChildren().addAll(boxToClient,mediaView);
		mediaPlayer.play();
		
		
		//creating the main scene, and adding to it the previously created AnchorPane layout
		//and setting the scene size in pixels
		Scene scene = new Scene(layout , 500 , 500);
				
		
		//setting and showing the scene at the primary stage
		primaryStage.setScene(scene);
		primaryStage.show();
				
		
	}
	
	public static void main(String[] args) {
		//dksakdjklsadlsa
		launch(args);
	}

	

}
