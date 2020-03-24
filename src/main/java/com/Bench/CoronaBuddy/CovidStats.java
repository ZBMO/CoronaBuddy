package com.Bench.CoronaBuddy;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CovidStats {

    @JsonProperty("Total")
    private Number total;

    public Number getTotal() {
        return total;
    }

    public void setTotal(Number total) {
        this.total = total;
    }
}
