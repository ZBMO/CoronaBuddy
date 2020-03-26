package com.Bench.CoronaBuddy;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CbControllerTest {

    @InjectMocks
    CbController cbController;

    @Mock
    SummaryService summaryService;

    @Test
    public void getUSSummary() throws Exception {
        //given
        String totalCasesResponse = "total cases: 100";
        when(summaryService.getTotalUSCases()).thenReturn(totalCasesResponse);

        //when
        String controllerResponse = cbController.getUSSummary();

        //then
        assertThat(controllerResponse.equalsIgnoreCase("total cases: 100"));
    }

}