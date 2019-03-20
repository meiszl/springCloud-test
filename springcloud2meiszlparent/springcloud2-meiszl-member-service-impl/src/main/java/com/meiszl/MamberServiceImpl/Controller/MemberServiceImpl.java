package com.meiszl.MamberServiceImpl.Controller;

import com.meiszl.MemberService.Memberservice;
import com.meiszl.ResponseBase.ResponseBase;
import com.meiszl.common.BaseApiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MemberServiceImpl extends BaseApiService implements Memberservice {
    @Override
    @RequestMapping("/test")
    public String testEurekaClient() {
        return "这是会员服务";
    }

    @Override
    @RequestMapping("/find")
    public ResponseBase getUserInfo() {
        try {
            //会员服务产生1.5秒延迟
            Thread.sleep(1500);
        }catch (Exception e){

        }
        return setResultSuccess("订单服务接口调用会员服务接口成功....");
    }
}
