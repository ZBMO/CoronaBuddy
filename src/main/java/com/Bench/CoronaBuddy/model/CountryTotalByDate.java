package com.Bench.CoronaBuddy.model;

import java.util.List;

public class CountryTotalByDate {

    private List<CountryTotal> countryTotals;


    public CountryTotalByDate(List<CountryTotal> countryTotals) {
        this.countryTotals = countryTotals;
    }

    public List<CountryTotal> getCountryTotals() {
        return countryTotals;
    }

    public CountryTotal getMostRecentTotal() {
        return countryTotals.get(countryTotals.size() -1);
    }
}
