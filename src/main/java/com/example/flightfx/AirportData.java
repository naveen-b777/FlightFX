package com.example.flightfx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AirportData {

    @FXML
    private TableView<DataModel> airportTable;

    @FXML
    private TableColumn<DataModel, String> ap_Time;

    @FXML
    private TableColumn<DataModel, String> ap_Route;

    @FXML
    private TableColumn<DataModel, String> ap_Aircraft;

    @FXML
    private TableColumn<DataModel, String> ap_Type;

    @FXML
    private TableColumn<DataModel, String> ap_Airline;

    ObservableList<DataModel> oblist = FXCollections.observableArrayList();

    public void blrAirport(ActionEvent event){

        String connectQuery = "SELECT * FROM BLR";
        System.out.println(connectQuery);

        try {

            Connection connectDB = DatabaseConnection.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM BLR");
            System.out.println(Result);

            while (Result.next()) {
                oblist.add(new DataModel(Result.getString("Time"),
                        Result.getString("Route"),
                        Result.getString("Aircraft"),
                        Result.getString("Type"),
                        Result.getString("Airline")));
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        ap_Time.setCellValueFactory(new PropertyValueFactory<>("Time"));
        ap_Route.setCellValueFactory(new PropertyValueFactory<>("Route"));
        ap_Aircraft.setCellValueFactory(new PropertyValueFactory<>("Aircraft"));
        ap_Type.setCellValueFactory(new PropertyValueFactory<>("Type"));
        ap_Airline.setCellValueFactory(new PropertyValueFactory<>("Airline"));

        airportTable.setItems(oblist);


    }

    public void ixrAirport(ActionEvent event){

        String connectQuery = "SELECT * FROM IXR";
        System.out.println(connectQuery);

        try {

            Connection connectDB = DatabaseConnection.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM IXR");
            System.out.println(Result);

            while (Result.next()) {
                oblist.add(new DataModel(Result.getString("Time"),
                        Result.getString("Route"),
                        Result.getString("Aircraft"),
                        Result.getString("Type"),
                        Result.getString("Airline")));
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        ap_Time.setCellValueFactory(new PropertyValueFactory<>("Time"));
        ap_Route.setCellValueFactory(new PropertyValueFactory<>("Route"));
        ap_Aircraft.setCellValueFactory(new PropertyValueFactory<>("Aircraft"));
        ap_Type.setCellValueFactory(new PropertyValueFactory<>("Type"));
        ap_Airline.setCellValueFactory(new PropertyValueFactory<>("Airline"));

        airportTable.setItems(oblist);


    }

    public void bomAirport(ActionEvent event){

        String connectQuery = "SELECT * FROM BOM";
        System.out.println(connectQuery);

        try {

            Connection connectDB = DatabaseConnection.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM BOM");
            System.out.println(Result);

            while (Result.next()) {
                oblist.add(new DataModel(Result.getString("Time"),
                        Result.getString("Route"),
                        Result.getString("Aircraft"),
                        Result.getString("Type"),
                        Result.getString("Airline")));
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        ap_Time.setCellValueFactory(new PropertyValueFactory<>("Time"));
        ap_Route.setCellValueFactory(new PropertyValueFactory<>("Route"));
        ap_Aircraft.setCellValueFactory(new PropertyValueFactory<>("Aircraft"));
        ap_Type.setCellValueFactory(new PropertyValueFactory<>("Type"));
        ap_Airline.setCellValueFactory(new PropertyValueFactory<>("Airline"));

        airportTable.setItems(oblist);


    }

    public void ccuAirport(ActionEvent event){

        String connectQuery = "SELECT * FROM CCU";
        System.out.println(connectQuery);

        try {

            Connection connectDB = DatabaseConnection.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM CCU");
            System.out.println(Result);

            while (Result.next()) {
                oblist.add(new DataModel(Result.getString("Time_"),
                        Result.getString("Route"),
                        Result.getString("Aircraft"),
                        Result.getString("Type_"),
                        Result.getString("Airline")));
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        ap_Time.setCellValueFactory(new PropertyValueFactory<>("Time_"));
        ap_Route.setCellValueFactory(new PropertyValueFactory<>("Route"));
        ap_Aircraft.setCellValueFactory(new PropertyValueFactory<>("Aircraft"));
        ap_Type.setCellValueFactory(new PropertyValueFactory<>("Type_"));
        ap_Airline.setCellValueFactory(new PropertyValueFactory<>("Airline"));

        airportTable.setItems(oblist);


    }


}

