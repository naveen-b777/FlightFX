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

public class AirlineData {

    @FXML
    private TableView<DataModelAL> airlineTable; // fx:id of Table

    @FXML
    private TableColumn<DataModelAL, String> alTime; // fx:id of column Time

    @FXML
    private TableColumn<DataModelAL, String> alRoute; // fx:id of column Route

    @FXML
    private TableColumn<DataModelAL, String> alAircraft; // fx:id of column Aircraft




    public void IndiGo(ActionEvent event){ // method for IndiGo Airlines option

        ObservableList<DataModelAL> oblist = FXCollections.observableArrayList();
        try {

            Connection connectDB = DatabaseConnection.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM INDIGO");
            System.out.println(Result);

            // Fetching Data from the columns of the table from database

            while (Result.next()) {
                oblist.add(new DataModelAL(Result.getString("Time"),
                        Result.getString("Route"),
                        Result.getString("Aircraft")));
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        // Assigning Data from database to the columns of the tableview


        alTime.setCellValueFactory(new PropertyValueFactory<>("Time"));
        alRoute.setCellValueFactory(new PropertyValueFactory<>("Route"));
        alAircraft.setCellValueFactory(new PropertyValueFactory<>("Aircraft"));
        airlineTable.setItems(oblist);
    }

    public void AirAsia(ActionEvent event){ // method for IndiGo Airlines option

        ObservableList<DataModelAL> oblist = FXCollections.observableArrayList();
        try {

            Connection connectDB = DatabaseConnection.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM AIRASIA");
            System.out.println(Result);

            // Fetching Data from the columns of the table from database

            while (Result.next()) {
                oblist.add(new DataModelAL(Result.getString("Time"),
                        Result.getString("Route"),
                        Result.getString("Aircraft")));
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        // Assigning Data from database to the columns of the tableview


        alTime.setCellValueFactory(new PropertyValueFactory<>("Time"));
        alRoute.setCellValueFactory(new PropertyValueFactory<>("Route"));
        alAircraft.setCellValueFactory(new PropertyValueFactory<>("Aircraft"));
        airlineTable.setItems(oblist);
    }

    public void GoFirst(ActionEvent event){ // method for IndiGo Airlines option

        ObservableList<DataModelAL> oblist = FXCollections.observableArrayList();
        try {

            Connection connectDB = DatabaseConnection.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM GOFIRST");
            System.out.println(Result);

            // Fetching Data from the columns of the table from database

            while (Result.next()) {
                oblist.add(new DataModelAL(Result.getString("Time"),
                        Result.getString("Route"),
                        Result.getString("Aircraft")));
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        // Assigning Data from database to the columns of the tableview


        alTime.setCellValueFactory(new PropertyValueFactory<>("Time"));
        alRoute.setCellValueFactory(new PropertyValueFactory<>("Route"));
        alAircraft.setCellValueFactory(new PropertyValueFactory<>("Aircraft"));
        airlineTable.setItems(oblist);
    }

    public void AirIndia(ActionEvent event){ // method for IndiGo Airlines option

        ObservableList<DataModelAL> oblist = FXCollections.observableArrayList();
        try {

            Connection connectDB = DatabaseConnection.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM AIRINDIA");
            System.out.println(Result);

            // Fetching Data from the columns of the table from database

            while (Result.next()) {
                oblist.add(new DataModelAL(Result.getString("Time"),
                        Result.getString("Route"),
                        Result.getString("Aircraft")));
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        // Assigning Data from database to the columns of the tableview


        alTime.setCellValueFactory(new PropertyValueFactory<>("Time"));
        alRoute.setCellValueFactory(new PropertyValueFactory<>("Route"));
        alAircraft.setCellValueFactory(new PropertyValueFactory<>("Aircraft"));
        airlineTable.setItems(oblist);
    }




}


