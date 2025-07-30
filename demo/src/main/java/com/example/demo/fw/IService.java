package com.example.demo.fw;


import com.example.demo.common.BaseRequest;
import com.example.demo.common.BaseResponse;

public interface IService extends ServiceConstants{

    public BaseResponse processRequest(BaseRequest request) throws ServiceException;

}
