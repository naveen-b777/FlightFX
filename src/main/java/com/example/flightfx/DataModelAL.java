package com.example.flightfx;

public class DataModelAL {

    String Time,Route,Aircraft;

//    public DataModelR(String Time, String Aircraft,String Airline) {
//        this.Time = Time;
//        this.Aircraft = Aircraft;
//        this.Airline = Airline;
//    }

    public DataModelAL(String time, String route, String aircraft) {
        this.Time = time;
        this.Route = route;
        this.Aircraft = aircraft;

    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        Time = Time;
    }

    public String getAircraft() {
        return Aircraft;
    }

    public void setAircraft(String Aircraft) {
        Aircraft = Aircraft;
    }

    public String getRoute() {
        return Route;
    }

    public void setRoute(String route) {
        Route = Route;
    }
}