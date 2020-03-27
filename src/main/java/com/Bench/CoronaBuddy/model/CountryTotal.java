package com.Bench.CoronaBuddy.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CountryTotal {

    @JsonProperty("Country")
    private String country;
    @JsonProperty("Province")
    private String province;
    @JsonProperty("Lat")
    private int lat;
    @JsonProperty("Lon")
    private int lon;
    @JsonProperty("Date")
    private String date;
    @JsonProperty("Cases")
    private int cases;
    @JsonProperty("Status")
    private String status;

    public CountryTotal() {
    }

    public CountryTotal(String country, String province, int lat, int lon, String date, int cases, String status) {
        this.country = country;
        this.province = province;
        this.lat = lat;
        this.lon = lon;
        this.date = date;
        this.cases = cases;
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public String getProvince() {
        return province;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getLat() {
        return lat;
    }

    public int getLon() {
        return lon;
    }

    public String getDate() {
        return date;
    }

    public int getCases() {
        return cases;
    }

    public String getStatus() {
        return status;
    }
}
