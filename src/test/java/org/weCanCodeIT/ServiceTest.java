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
        Service service = new Service("I need an oil change");
        assertEquals("I need an oil change", service.getCustomerProblem());
    }
}