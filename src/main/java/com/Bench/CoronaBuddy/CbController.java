package com.Bench.CoronaBuddy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CbController {

    @Autowired
    SummaryService summaryService;

    @GetMapping("/US")
    public String getUSSummary() throws Exception {
        return summaryService.getTotalUSCases();
    }
}
