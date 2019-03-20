package com.meiszl.MemberService;


import com.meiszl.ResponseBase.ResponseBase;
import org.springframework.web.bind.annotation.RequestMapping;

public interface Memberservice {
    @RequestMapping("/test")
    public String testEurekaClient();
    @RequestMapping("/find")
    public ResponseBase getUserInfo();

}
