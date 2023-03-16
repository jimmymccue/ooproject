package org.weCanCodeIT;

import org.junit.jupiter.api.Test;

class ServiceTest {
    @Test
    public void testCreateService() {
        ServiceInterface service = new OilChange();
    }
}