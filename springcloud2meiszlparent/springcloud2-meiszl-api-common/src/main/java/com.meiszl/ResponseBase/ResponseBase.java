package com.meiszl.ResponseBase;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;


//服务有响应，统一规范响应
@Data
@Slf4j
public class ResponseBase {
    private Integer rtnCode;
    private String mag;
    private Object data;

    public ResponseBase(){

    }

    public ResponseBase(Integer rtnCode,String mag,Object data){
        super();
        this.rtnCode = rtnCode;
        this.mag = mag;
        this.data = data;
    }

//    public static void main(String[] args){
//        ResponseBase responseBase = new ResponseBase();
//        responseBase.setData("123456");
//        responseBase.setMag("success");
//        responseBase.setRtnCode(200);
//        System.out.println(responseBase.toString());
//        log.info("meiszl.......");
//    }
    @Override
    public String toString(){
        return "ResponseBase[rtnCode=" + rtnCode + ",msg=" + mag + ",data=" + data + "]";
    }

}
