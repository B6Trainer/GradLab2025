package com.example.demo.fw;


import com.example.demo.common.BaseResponse;
import com.example.demo.common.ResponseBody;
import com.example.demo.common.ResponseErrorCodes;

public class ResponseFactory implements ResponseErrorCodes {

    private static final String successStatus="success";
    private static final String errorStatus="error";

    public static BaseResponse buildBasicSuccessResponse(){

        return buildBasicSuccessResponseWithMessage("Request processed successfully");
    }

    public static BaseResponse buildBasicSuccessResponseWithMessage(String message){

        BaseResponse br = new BaseResponse(SUCCESS_CODE, successStatus, message, null);
        return br;
    }


    public static BaseResponse buildSuccessResponseWithContent(String responseMessage, ResponseBody respObject){

        BaseResponse br = new BaseResponse(SUCCESS_CODE,successStatus, responseMessage, respObject);
        return br;
    }

    public static BaseResponse buildSuccessResponseWithContent(ResponseBody respObject){

        BaseResponse br = new BaseResponse(SUCCESS_CODE,successStatus, "Request Successful", respObject);
        return br;
    }

    public static BaseResponse buildBasicErrorResponse(int errorCode,String errorMessage){

        BaseResponse br = new BaseResponse(errorCode,errorStatus, errorMessage, null);
        return br;
    }

}
