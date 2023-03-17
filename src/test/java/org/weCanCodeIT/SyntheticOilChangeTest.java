package org.weCanCodeIT;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SyntheticOilChangeTest {

    @Test
    public void testCreateService() {
        ServiceInterface service = new SyntheticOilChange();
    }

    @Test
    public void testGetPrice() {
        OilChange oilChange = new SyntheticOilChange();
        //This code represents abstraction.  oilChange doesn't care how setCost() gets implemented.  It is up to
        //SyntheticOilChange to take care of these details.
        oilChange.setCost();
        assertEquals(100, oilChange.getCost());
    }
}