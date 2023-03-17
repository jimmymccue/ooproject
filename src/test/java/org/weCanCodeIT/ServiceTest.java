package org.weCanCodeIT;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServiceTest {
    @Test
    public void testCreateService() {
        ServiceInterface service = new OilChange();
    }

    @Test
    public void testSetCustomerProblem() {
        Service service = new Service();
        service.stateProblem("I need an oil change");
        assertEquals("I need an oil change", service.getCustomerProblem());
    }

    @Test
    public void testGetEstimate() {
        ServiceInterface service = new Service();
        String estimate = "";
        assertEquals(estimate, service.getEstimate());
    }
}