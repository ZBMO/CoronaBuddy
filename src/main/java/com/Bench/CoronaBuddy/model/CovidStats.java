package com.Bench.CoronaBuddy.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown =  true)
public class CovidStats {

    @JsonProperty("Total")
    private Number Total;

    @JsonProperty("All")
    private Number All;

    public Number getAll() {
        return All;
    }

    public void setAll(Number all) {
        All = all;
    }

    public CovidStats() {
    }

    public Number getTotal() {
        return Total;
    }

    public CovidStats(Number Total) {
        this.Total = Total;
    }

    public void setTotal(Number total) {
        this.Total = total;
    }
}
