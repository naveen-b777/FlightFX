package com.example.flightfx;

public class DataModel {
    String Time,Route,Aircraft,Type,Airline;

    public DataModel(String Time, String Route, String Aircraft, String Type, String Airline) {
        this.Time = Time;
        this.Route= Route;
        this.Aircraft = Aircraft;
        this.Type = Type;
        this.Airline = Airline;
    }

    public DataModel(String time, String route, String aircraft) {

    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        Time = Time;
    }

    public String getRoute() {
        return Route;
    }

    public void setRoute(String Route) {
        Route = Route;
    }

    public String getAircraft() {
        return Aircraft;
    }

    public void setAircraft(String Aircraft) {
        Aircraft = Aircraft;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        Type = Type;
    }

    public String getAirline() {
        return Airline;
    }

    public void setAirline(String airline) {
        Airline = Airline;
    }
}