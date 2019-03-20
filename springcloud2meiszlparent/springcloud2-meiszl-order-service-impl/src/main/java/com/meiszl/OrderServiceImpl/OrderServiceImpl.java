package com.meiszl.OrderServiceImpl;


import com.meiszl.OrderService.OrderService;
import com.meiszl.ResponseBase.ResponseBase;
import com.meiszl.common.BaseApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderService orderService;
    @RequestMapping("/feignMember")
    public String testEurekaClient(){
        System.out.println("feign调用member");
        return orderService.testEurekaClient();
    }

    @Override
    @LoadBalanced
    @RequestMapping("/orderToMember")
    public ResponseBase getUserInfo() {
        return orderService.getUserInfo();
    }

}
