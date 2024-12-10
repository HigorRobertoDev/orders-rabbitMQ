package com.orders.api.orders.ampq;

import com.orders.api.orders.dto.request.InputOdersRequest;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OrdersListenerAMQP {

    @RabbitListener(queues = "product.orders")
    public void receivesMessage(InputOdersRequest request) {

        System.out.println("Mensagem: " + request.toString());
    }

}
