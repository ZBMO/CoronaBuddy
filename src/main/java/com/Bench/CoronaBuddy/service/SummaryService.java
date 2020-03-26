package com.Bench.CoronaBuddy.service;

import com.Bench.CoronaBuddy.model.CovidStats;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class SummaryService {

    public SummaryService() {
    }

    final String uri = "https://api.covid19api.com/stats";

    public String getTotalUSCases() throws Exception {
        var total = getUSTotalCases();
        return "total cases: " + total;
    }

    private int getUSTotalCases() throws Exception {
        var covidStats = getUSConfirmedCases();
        return covidStats.getTotal().intValue();
    }

    private CovidStats getUSConfirmedCases() throws Exception {
        HttpRequest request = HttpRequest.newBuilder(URI.create(uri))
                .header("Accept", "application/json")
                .build();
        HttpResponse<String> response = HttpClient
                .newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());

        CovidStats covidStats = new Gson().fromJson(response.body(), CovidStats.class);
        return covidStats;
    }
}
