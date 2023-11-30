package com.mycompany;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Cursor;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create VBox
        VBox root = new VBox();

        // Create MenuBar
        MenuBar menuBar = new MenuBar();
        Menu homeMenu = new Menu("Home");

        Menu loginMenu = new Menu("Login");

        Menu registerMenu = new Menu("Register");
      

        menuBar.getMenus().addAll(homeMenu, loginMenu, registerMenu);

        // Create AnchorPane
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setStyle("-fx-background-color: #ffffff; -fx-background-position: center;");

        // Create UI elements
        Button loginButton = new Button("Login");
        loginButton.setStyle("-fx-background-color: #FFFF00; -fx-border-width: 1; -fx-border-color: #000000; -fx-border-radius: 4;");
        loginButton.setLayoutX(262.0);
        loginButton.setLayoutY(230.0);
        loginButton.setPrefSize(97.0, 25.0);
        loginButton.setCursor(Cursor.CLOSED_HAND);

        PasswordField passwordField = new PasswordField();
        passwordField.setLayoutX(213.0);
        passwordField.setLayoutY(163.0);
        passwordField.setPrefSize(194.0, 25.0);
        passwordField.setPromptText("Digite a senha");
        passwordField.setText("grhrty");

        TextField usernameField = new TextField();
        usernameField.setLayoutX(213.0);
        usernameField.setLayoutY(128.0);
        usernameField.setPrefSize(194.0, 25.0);
        usernameField.setPromptText("Digite o nome de usuário");
        usernameField.setText("Lucasqc04");

        RadioButton agreeRadioButton = new RadioButton("Li e concordo com os termos de serviço");
        agreeRadioButton.setLayoutX(194.0);
        agreeRadioButton.setLayoutY(201.0);
        agreeRadioButton.setCursor(Cursor.CLOSED_HAND);

        ImageView imageView = new ImageView(new Image(getClass().getResource("/Pictures/hastydev.png").toExternalForm()));
        imageView.setFitHeight(115.0);
        imageView.setFitWidth(179.0);
        imageView.setLayoutX(221.0);
        imageView.setLayoutY(40.0);
        imageView.setPreserveRatio(true);
        imageView.setPickOnBounds(true);

        // Add elements to AnchorPane
        anchorPane.getChildren().addAll(loginButton, passwordField, usernameField, agreeRadioButton, imageView);

        // Add elements to VBox
        root.getChildren().addAll(menuBar, anchorPane);

        // Create Scene
        Scene scene = new Scene(root, 640, 400, Color.WHITE);

        // Set the stage properties
        primaryStage.setTitle("HastyDev");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
