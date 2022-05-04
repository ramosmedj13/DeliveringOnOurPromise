package orderfulfillmentservice;

import com.amazon.ata.deliverypromiseservice.service.DeliveryPromiseService;

public class OrderFulfillmentServiceClient {

    private DeliveryPromiseService ofService;


    public OrderFulfillmentServiceClient(DeliveryPromiseService ofService) {
        this.ofService = ofService;
    }
}
