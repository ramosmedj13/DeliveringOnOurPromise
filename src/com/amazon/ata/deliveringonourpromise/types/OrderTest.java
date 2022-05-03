package com.amazon.ata.deliveringonourpromise.types;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    @Test
    public void OrderTest_isOrderIdValid_returned() {
        // GIVEN
        Order order = Order.builder()
                .withOrderId("abc")
                .build();

        // THEN + WHEN
        assertNull(order);
    }
}
