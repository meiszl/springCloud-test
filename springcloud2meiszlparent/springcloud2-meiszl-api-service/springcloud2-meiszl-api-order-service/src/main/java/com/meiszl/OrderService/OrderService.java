package com.meiszl.OrderService;


import com.meiszl.ResponseBase.ResponseBase;

public interface OrderService {
    public String getMember();
    //订单服务接口调用会员服务接口
    public ResponseBase orderToMemberUserInfo();
}
