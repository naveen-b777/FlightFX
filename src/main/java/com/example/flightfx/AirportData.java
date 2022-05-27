package com.example.flightfx;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class AirportData {

    @FXML
    private TableView<DataModel> airportTable; // fx:id of Table

    @FXML
    private TableColumn<DataModel, String> ap_Time; // fx:id of column Time

    @FXML
    private TableColumn<DataModel, String> ap_Route; // fx:id of column Route

    @FXML
    private TableColumn<DataModel, String> ap_Aircraft; // fx:id of column Aircraft

    @FXML
    private TableColumn<DataModel, String> ap_Type; // fx:id of column Type

    @FXML
    private TableColumn<DataModel, String> ap_Airline; // fx:id of column Airline



    public void blrAirport(ActionEvent event){ // method for Bangalore Airport option

        ObservableList<DataModel> oblist = FXCollections.observableArrayList();
        try {

            Connection connectDB = DatabaseConnection.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM BLR");
            System.out.println(Result);

            // Fetching Data from the columns of the table from database

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

        // Assigning Data from database to the columns of the tableview


        ap_Time.setCellValueFactory(new PropertyValueFactory<>("Time"));
        ap_Route.setCellValueFactory(new PropertyValueFactory<>("Route"));
        ap_Aircraft.setCellValueFactory(new PropertyValueFactory<>("Aircraft"));
        ap_Type.setCellValueFactory(new PropertyValueFactory<>("Type"));
        ap_Airline.setCellValueFactory(new PropertyValueFactory<>("Airline"));

        airportTable.setItems(oblist);


    }

    public void ixrAirport(ActionEvent event){ // method for Ranchi Airport option
        ObservableList<DataModel> oblist = FXCollections.observableArrayList();
        try {

            Connection connectDB = DatabaseConnection.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM IXR");
            System.out.println(Result);

            // Fetching Data from the columns of the table from database

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


        // Assigning Data from database to the columns of the tableview

        ap_Time.setCellValueFactory(new PropertyValueFactory<>("Time"));
        ap_Route.setCellValueFactory(new PropertyValueFactory<>("Route"));
        ap_Aircraft.setCellValueFactory(new PropertyValueFactory<>("Aircraft"));
        ap_Type.setCellValueFactory(new PropertyValueFactory<>("Type"));
        ap_Airline.setCellValueFactory(new PropertyValueFactory<>("Airline"));

        airportTable.setItems(oblist);


    }

    public void bomAirport(ActionEvent event){ // method for Mumbai Airport option
        ObservableList<DataModel> oblist = FXCollections.observableArrayList();
        try {

            Connection connectDB = DatabaseConnection.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM BOM");
            System.out.println(Result);

            // Fetching Data from the columns of the table from database

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

        // Assigning Data from database to the columns of the tableview

        ap_Time.setCellValueFactory(new PropertyValueFactory<>("Time"));
        ap_Route.setCellValueFactory(new PropertyValueFactory<>("Route"));
        ap_Aircraft.setCellValueFactory(new PropertyValueFactory<>("Aircraft"));
        ap_Type.setCellValueFactory(new PropertyValueFactory<>("Type"));
        ap_Airline.setCellValueFactory(new PropertyValueFactory<>("Airline"));

        airportTable.setItems(oblist);


    }

    public void ccuAirport(ActionEvent event){ // method for Kolkata Airport option
        ObservableList<DataModel> oblist = FXCollections.observableArrayList();
        try {

            Connection connectDB = DatabaseConnection.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM CCU");
            System.out.println(Result);

            // Fetching Data from the columns of the table from database

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

        // Assigning Data from database to the columns of the tableview

        ap_Time.setCellValueFactory(new PropertyValueFactory<>("Time"));
        ap_Route.setCellValueFactory(new PropertyValueFactory<>("Route"));
        ap_Aircraft.setCellValueFactory(new PropertyValueFactory<>("Aircraft"));
        ap_Type.setCellValueFactory(new PropertyValueFactory<>("Type"));
        ap_Airline.setCellValueFactory(new PropertyValueFactory<>("Airline"));

        airportTable.setItems(oblist);


    }

}

