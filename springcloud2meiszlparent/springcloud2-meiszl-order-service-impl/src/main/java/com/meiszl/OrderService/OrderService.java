package com.meiszl.OrderService;

import com.meiszl.MemberService.Memberservice;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(name = "APP-MEISZL-MEMBER")
public interface OrderService extends Memberservice {

}
