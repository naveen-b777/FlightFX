package com.example.flightfx;

public class DataModel {
    String Time_,Route,Aircraft,Type_,Airline;

    public DataModel(String Time_, String Route, String Aircraft, String Type_, String Airline) {
        this.Time_ = Time_;
        this.Route= Route;
        this.Aircraft = Aircraft;
        this.Type_ = Type_;
        this.Airline = Airline;
    }

    public String getTime_() {
        return Time_;
    }

    public void setTime_(String Time_) {
        Time_ = Time_;
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

    public String getType_() {
        return Type_;
    }

    public void setType_(String Type_) {
        Type_ = Type_;
    }

    public String getAirline() {
        return Airline;
    }

    public void setAirline(String airline) {
        Airline = Airline;
    }
}