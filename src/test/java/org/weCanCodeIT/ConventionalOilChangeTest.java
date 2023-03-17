package org.weCanCodeIT;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConventionalOilChangeTest {
    @Test
    public void createNewOilChange() {
        Service oilChange = new ConventionalOilChange();
    }

    @Test
    public void testGetPrice() {
        OilChange oilChange = new ConventionalOilChange();
        //This code represents abstraction.  oilChange doesn't care how setCost() gets implemented.  It is up to
        //ConventionalOilChange to take care of these details.
        oilChange.setCost();
        assertEquals(60, oilChange.getCost());
    }
}