package com.Bench.CoronaBuddy.controller;

import com.Bench.CoronaBuddy.service.SummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CbController {

    @Autowired
    SummaryService summaryService;

    @GetMapping("/countryTotal/{countryName}")
    public String getSummary(@PathVariable String countryName) throws Exception {
        return summaryService.getTotalCases(countryName);
    }
}
