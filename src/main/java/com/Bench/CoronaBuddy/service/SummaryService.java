package com.Bench.CoronaBuddy.service;

import com.Bench.CoronaBuddy.model.CountryTotal;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

@Service
public class SummaryService {

    public String getTotalCases(String countryName) throws Exception {
        var countryTotal = getConfirmedCases(countryName);
        return  countryTotal.getCases()+ " cases in " + countryTotal.getCountry() + " as of " + countryTotal.getDate();
    }

    private CountryTotal getConfirmedCases(String countryName) throws Exception {
        var objectMapper = new ObjectMapper();
        final String uri = "https://api.covid19api.com//total/country/" + countryName + "/status/confirmed";

        var request = HttpRequest.newBuilder(URI.create(uri))
                .header("Accept", "application/json")
                .build();
        HttpResponse<String> response = HttpClient
                .newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());

        var countryTotals = objectMapper.readValue(response.body(), new TypeReference<List<CountryTotal>>() {});

        return countryTotals.get(countryTotals.size()-1);
    }
}
