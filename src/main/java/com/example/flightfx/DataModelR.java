package com.example.flightfx;

public class DataModelR {

    String Time,Aircraft,Airline;

    public DataModelR(String Time, String Route, String Aircraft, String Type, String Airline) {
        this.Time = Time;
        this.Aircraft = Aircraft;
        this.Airline = Airline;
    }

    public DataModelR(String time, String route, String aircraft) {

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


    public String getAirline() {
        return Airline;
    }

    public void setAirline(String airline) {
        Airline = Airline;
    }

}
