package com.nizing.mockitodemo.business;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SomeBusinessImplTest {
    @Test
    void findTheGreatestFromAllData() {
        var businessImpl = new SomeBusinessImpl(new DataServiceStub());
        assertEquals(businessImpl.retrieveTheGreatestFromAllData(), 25);
    }
}

class DataServiceStub implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{25, 15, 5};
    }
}
