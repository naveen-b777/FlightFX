package com.example.flightfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;


import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Controller {
    @FXML
    private Label welcomeText;
    @FXML
    private Label BLRtime;
    @FXML
    private Label BLRroute;
    @FXML
    private Label BLRaircraft;
    @FXML
    private Label BLRtype;
    @FXML
    private Label BLRairline;

//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to Flight Data Studio");
//    }

    @FXML
    protected void onFirstButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("fx1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Search By Airport");
        stage.getIcons().add(new Image("logo.png"));
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onSecondButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("fx2.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Search by Route");
        stage.getIcons().add(new Image("logo.png"));
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onThirdButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("fx3.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Search by Route");
        stage.getIcons().add(new Image("logo.png"));
        stage.setScene(scene);
        stage.show();
    }

    public void blrAirport(ActionEvent event){
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String connectQuery = "SELECT * FROM BLR";
        System.out.println(connectQuery);

        try {

            Statement statement = connectDB.createStatement();
            ResultSet queryOutput = statement.executeQuery(connectQuery);

            while (queryOutput.next()) {
                BLRtime.setText(queryOutput.getString("Time_"));
                BLRroute.setText(queryOutput.getString("Route"));
                BLRaircraft.setText(queryOutput.getString("Aircraft"));
                BLRtype.setText(queryOutput.getString("Type_"));
                BLRairline.setText(queryOutput.getString("Airline"));

            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}