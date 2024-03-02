package com.nizing.mockitodemo.business;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SomeBusinessImplStubTest {
    @Test
    void findTheGreatestFromAllData() {
        var businessImpl = new SomeBusinessImpl(new DataServiceStub());
        assertEquals(25, businessImpl.retrieveTheGreatestFromAllData());
    }
}

class DataServiceStub implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{25, 15, 5};
    }
}
