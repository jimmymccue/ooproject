package org.weCanCodeIT;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicInspectionTest {

    @Test
    public void testCreateInspection() {
        BasicInspection inspection = new BasicInspection();
    }

    @Test
    public void testBasicInspectionContainsTireInspection() {
        TireInspection tireInspection = new TireInspection();
        BasicInspection basicInspection = new BasicInspection();
        basicInspection.setTireInspection(tireInspection);
        assertEquals(tireInspection, basicInspection.getTireInspection());
    }

}