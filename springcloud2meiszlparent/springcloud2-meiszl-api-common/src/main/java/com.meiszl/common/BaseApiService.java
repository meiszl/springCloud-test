package com.meiszl.common;

import com.meiszl.ResponseBase.ResponseBase;
import org.springframework.stereotype.Component;

@Component
public class BaseApiService {
    public ResponseBase setResultError(Integer code,String msg){
        return setResult(code,msg,null);
    }
    //返回错误，可以传msg
    public ResponseBase setResultError(String msg){
        return setResult(500,msg,null);
    }
    //返回成功，可以传data的值
    public ResponseBase setResultSuccess(Object data){
        return setResult(200,"处理成功",data);
    }
    //返回成功，没有data的值
    public ResponseBase setResultSuccess(){
        return setResult(200,"处理成功",null);
    }
    //返回成功，没有data值
    public ResponseBase setSuccess(String msg){
        return setResult(200,msg,null);
    }
    //通用拼装
    public ResponseBase setResult(Integer code,String msg,Object data){
        return new ResponseBase(code,msg,data);
    }
}
