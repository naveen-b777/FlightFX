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

public class RouteData {

    @FXML
    private TableView<DataModelR> rtTable; // fx:id of Table

    @FXML
    private TableColumn<DataModelR, String> rtTime; // fx:id of column Time

    @FXML
    private TableColumn<DataModelR, String> rtAirline; // fx:id of column Route

    @FXML
    private TableColumn<DataModelR, String> rtAircraft; // fx:id of column Aircraft


    public void BLR_PNQ(ActionEvent event) { // method for IndiGo Airlines option

        ObservableList<DataModelR> oblist = FXCollections.observableArrayList();
        try {

            Connection connectDB = DatabaseConnection.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM BLR_PNQ");
            System.out.println(Result);

            // Fetching Data from the columns of the table from database

            while (Result.next()) {
                oblist.add(new DataModelR(Result.getString("Time"),
                        Result.getString("Aircraft"),
                        Result.getString("Airline")));
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        // Assigning Data from database to the columns of the tableview


        rtTime.setCellValueFactory(new PropertyValueFactory<>("Time"));
        rtAircraft.setCellValueFactory(new PropertyValueFactory<>("Aircraft"));
        rtAirline.setCellValueFactory(new PropertyValueFactory<>("Airline"));
        System.out.println(oblist);
        rtTable.setItems(oblist);
    }

    public void IXR_BLR(ActionEvent event) { // method for IndiGo Airlines option

        ObservableList<DataModelR> oblist = FXCollections.observableArrayList();
        try {

            Connection connectDB = DatabaseConnection.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM IXR_BLR");
            System.out.println(Result);

            // Fetching Data from the columns of the table from database

            while (Result.next()) {
                oblist.add(new DataModelR(Result.getString("Time"),
                        Result.getString("Aircraft"),
                        Result.getString("Airline")));
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        // Assigning Data from database to the columns of the tableview


        rtTime.setCellValueFactory(new PropertyValueFactory<>("Time"));
        rtAircraft.setCellValueFactory(new PropertyValueFactory<>("Aicraft"));
        rtAirline.setCellValueFactory(new PropertyValueFactory<>("Airline"));
        rtTable.setItems(oblist);
    }

    public void BLR_DXB(ActionEvent event) { // method for IndiGo Airlines option

        ObservableList<DataModelR> oblist = FXCollections.observableArrayList();
        try {

            Connection connectDB = DatabaseConnection.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM BLR_DXB");
            System.out.println(Result);

            // Fetching Data from the columns of the table from database

            while (Result.next()) {
                oblist.add(new DataModelR(Result.getString("Time"),
                        Result.getString("Aircraft"),
                        Result.getString("Airline")));
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        // Assigning Data from database to the columns of the tableview


        rtTime.setCellValueFactory(new PropertyValueFactory<>("Time"));
        rtAircraft.setCellValueFactory(new PropertyValueFactory<>("Aircraft"));
        rtAirline.setCellValueFactory(new PropertyValueFactory<>("Airline"));
        rtTable.setItems(oblist);
    }

    public void BOM_DEL(ActionEvent event) { // method for IndiGo Airlines option

        ObservableList<DataModelR> oblist = FXCollections.observableArrayList();
        try {

            Connection connectDB = DatabaseConnection.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM BOM_DEL");
            System.out.println(Result);

            // Fetching Data from the columns of the table from database

            while (Result.next()) {
                oblist.add(new DataModelR(Result.getString("Time"),
                        Result.getString("Aircraft"),
                        Result.getString("Airline")));
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        // Assigning Data from database to the columns of the tableview


        rtTime.setCellValueFactory(new PropertyValueFactory<>("Time"));
        rtAircraft.setCellValueFactory(new PropertyValueFactory<>("Aircraft"));
        rtAirline.setCellValueFactory(new PropertyValueFactory<>("Airline"));
        rtTable.setItems(oblist);
    }

}