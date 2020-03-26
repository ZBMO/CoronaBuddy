package com.Bench.CoronaBuddy;

import com.Bench.CoronaBuddy.service.SummaryService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class SummaryServiceTest {

    @InjectMocks
    SummaryService summaryService;

    @Test
    public void getTotalUSCasesTest() throws Exception {
        //given
        String uri = "testString";

        //when
        String response = summaryService.getTotalUSCases();

        //then
        assertEquals(response.getClass(), String.class);
    }
}
