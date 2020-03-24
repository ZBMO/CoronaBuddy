package com.Bench.CoronaBuddy;

import com.fasterxml.jackson.core.type.TypeReference;
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

    final String uri = "https://api.covid19api.com/total/country/us/status/confirmed";


    public String getGreeting() throws Exception {
        HttpResponse<String> response = JSONBodyAsMap(URI.create(uri));
        System.out.println(response);
        return response.body().toString();
    }

    private HttpResponse<String> JSONBodyAsMap(URI uri) throws Exception {
        HttpRequest request = HttpRequest.newBuilder(uri)
                .header("Accept", "application/json")
                .build();

        return HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());
    }
}
