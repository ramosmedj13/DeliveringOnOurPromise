package com.amazon.ata.deliveringonourpromise.dao;

import com.amazon.ata.deliveringonourpromise.App;
import com.amazon.ata.deliveringonourpromise.types.Order;
import com.amazon.ata.deliveringonourpromise.types.Promise;
import com.amazon.ata.deliveringonourpromise.types.PromiseHistory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderDaoTest {

    private OrderDao dao;

    @BeforeEach
    private void createDao() {
        dao = App.getOrderDao();
    }

    @Test
    public void get_ForKnownOrderId_returnsOrder() {
        // GIVEN
        String orderId = "900-3746401-0000001";

        // WHEN
        Order result = dao.get(orderId);

        // THEN
        assertNotNull(result);
    }

    @Test
    public void get_ForUnKnownOrderId_returnsOrder() {
        // GIVEN
        String orderId = "invalid";

        // WHEN
        Order result = dao.get(orderId);

        // THEN
        assertNull(result);
    }
}
