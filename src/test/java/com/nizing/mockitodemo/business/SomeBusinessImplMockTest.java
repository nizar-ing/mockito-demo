package com.nizing.mockitodemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessImplMockTest {
    @Test
    void findTheGreatestFromAllData() {
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{25, 15, 5});

        var businessImpl = new SomeBusinessImpl(dataServiceMock);
        assertEquals(25, businessImpl.retrieveTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestFromAllData_OneValue() {
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{35});

        var businessImpl = new SomeBusinessImpl(dataServiceMock);
        assertEquals(35, businessImpl.retrieveTheGreatestFromAllData());
    }
}

