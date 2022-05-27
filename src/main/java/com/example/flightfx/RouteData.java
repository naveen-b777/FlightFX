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
    private TableView<DataModel> rtTable; // fx:id of Table

    @FXML
    private TableColumn<DataModel, String> rtTime; // fx:id of column Time

    @FXML
    private TableColumn<DataModel, String> rtRoute; // fx:id of column Route

    @FXML
    private TableColumn<DataModel, String> rtAircraft; // fx:id of column Aircraft

//    @FXML
//    private TableColumn<DataModel, String> ap_Type; // fx:id of column Type
//
//    @FXML
//    private TableColumn<DataModel, String> ap_Airline; // fx:id of column Airline


    public void BLR_PNQ(ActionEvent event) { // method for IndiGo Airlines option

        ObservableList<DataModel> oblist = FXCollections.observableArrayList();
        try {

            Connection connectDB = DatabaseConnection.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM BLR_PNQ");
            System.out.println(Result);

            // Fetching Data from the columns of the table from database

            while (Result.next()) {
                oblist.add(new DataModel(Result.getString("Time"),
                        Result.getString("Route"),
                        Result.getString("Aircraft")));
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        // Assigning Data from database to the columns of the tableview


        rtTime.setCellValueFactory(new PropertyValueFactory<>("Time"));
        rtRoute.setCellValueFactory(new PropertyValueFactory<>("Route"));
        rtAircraft.setCellValueFactory(new PropertyValueFactory<>("Aircraft"));
        rtTable.setItems(oblist);
    }

    public void IXR_BLR(ActionEvent event) { // method for IndiGo Airlines option

        ObservableList<DataModel> oblist = FXCollections.observableArrayList();
        try {

            Connection connectDB = DatabaseConnection.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM IXR_BLR");
            System.out.println(Result);

            // Fetching Data from the columns of the table from database

            while (Result.next()) {
                oblist.add(new DataModel(Result.getString("Time"),
                        Result.getString("Route"),
                        Result.getString("Aircraft")));
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        // Assigning Data from database to the columns of the tableview


        rtTime.setCellValueFactory(new PropertyValueFactory<>("Time"));
        rtRoute.setCellValueFactory(new PropertyValueFactory<>("Route"));
        rtAircraft.setCellValueFactory(new PropertyValueFactory<>("Aircraft"));
        rtTable.setItems(oblist);
    }

    public void BLR_DXB(ActionEvent event) { // method for IndiGo Airlines option

        ObservableList<DataModel> oblist = FXCollections.observableArrayList();
        try {

            Connection connectDB = DatabaseConnection.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM BLR_DXB");
            System.out.println(Result);

            // Fetching Data from the columns of the table from database

            while (Result.next()) {
                oblist.add(new DataModel(Result.getString("Time"),
                        Result.getString("Route"),
                        Result.getString("Aircraft")));
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        // Assigning Data from database to the columns of the tableview


        rtTime.setCellValueFactory(new PropertyValueFactory<>("Time"));
        rtRoute.setCellValueFactory(new PropertyValueFactory<>("Route"));
        rtAircraft.setCellValueFactory(new PropertyValueFactory<>("Aircraft"));
        rtTable.setItems(oblist);
    }

    public void BOM_DEL(ActionEvent event) { // method for IndiGo Airlines option

        ObservableList<DataModel> oblist = FXCollections.observableArrayList();
        try {

            Connection connectDB = DatabaseConnection.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM BOM_DEL");
            System.out.println(Result);

            // Fetching Data from the columns of the table from database

            while (Result.next()) {
                oblist.add(new DataModel(Result.getString("Time"),
                        Result.getString("Route"),
                        Result.getString("Aircraft")));
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        // Assigning Data from database to the columns of the tableview


        rtTime.setCellValueFactory(new PropertyValueFactory<>("Time"));
        rtRoute.setCellValueFactory(new PropertyValueFactory<>("Route"));
        rtAircraft.setCellValueFactory(new PropertyValueFactory<>("Aircraft"));
        rtTable.setItems(oblist);
    }

}