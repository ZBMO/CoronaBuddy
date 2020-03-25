package com.Bench.CoronaBuddy;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CovidStats {

    private Number Total;

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
