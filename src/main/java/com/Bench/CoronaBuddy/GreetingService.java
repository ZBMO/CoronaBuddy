package com.Bench.CoronaBuddy;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService {

//    final String uri = "https://api.covid19api.com/total/country/us/status/confirmed";
    final String uri = "https://api.covid19api.com/stats";

    public String getGreeting() throws Exception {
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
