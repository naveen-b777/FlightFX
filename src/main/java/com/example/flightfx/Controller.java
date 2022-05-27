package com.example.flightfx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
<<<<<<< HEAD
import javafx.scene.control.Button;
import javafx.scene.control.Label;
=======
>>>>>>> 907f3dc9d22e2a68d6a6f8e9112319352f7a91af
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

<<<<<<< HEAD
public class Controller {
    @FXML
    private Label welcomeText;

    @FXML
    public Button closeButton;
    @FXML
    public static Label BLRtime;
    @FXML
    public static Label BLRroute;
    @FXML
    public static Label BLRaircraft;
    @FXML
    public static Label BLRtype;
    @FXML
    public static Label BLRairline;
=======
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
>>>>>>> 907f3dc9d22e2a68d6a6f8e9112319352f7a91af


import java.io.IOException;

public class Controller  {

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

<<<<<<< HEAD

    @FXML
    private void closeButtonAction() throws IOException {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
//
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
//        Stage nstage = new Stage();
//        nstage.setTitle("HOME");
//        nstage.setScene(scene);
//        nstage.show();
    }


=======
>>>>>>> 907f3dc9d22e2a68d6a6f8e9112319352f7a91af
}