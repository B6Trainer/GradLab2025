package com.example.demo.fw;


import com.example.demo.common.BaseRequest;
import com.example.demo.common.BaseResponse;
import com.example.demo.common.RequestActions;
import com.example.demo.common.ResponseErrorCodes;
import com.example.demo.module.core.service.CoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@Component
public class ServiceFacade implements IServiceFacade, RequestActions {
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceFacade.class);
    @Autowired
    private CoreService coreService;

    private IService findService(BaseRequest request) {

        String requestAction = request.getRequestAction();

        if(requestAction.startsWith(CORE_SERVICE)){
            return coreService;
        }


        return null;//Need to throw exception
    }
    @Override
    public BaseResponse processRequest(BaseRequest request) {

        IService service = findService(request);

        BaseResponse response;

        if(service != null){

            try {
                response = service.processRequest(request);

            } catch (ServiceException exc) {
                response = ResponseFactory.buildBasicErrorResponse(exc.getErrorCode(), exc.getErrorMessage());
            }
            catch (NoSuchElementException exc) {
                response = ResponseFactory.buildBasicErrorResponse(ResponseErrorCodes.USER_NOT_REGISTERED,
                        "User is not registered");
            }catch (Exception exc) {
                LOGGER.error("Exception!",exc);
                response = ResponseFactory.buildBasicErrorResponse(ResponseErrorCodes.USER_SERVICE_ERROR_CODE,
                        "Server error");

            }
        }else{
            response = ResponseFactory.buildBasicErrorResponse(ResponseErrorCodes.USER_SERVICE_MAPPING_ERROR_CODE,
                    "Service mapping not available for request");
        }

        return response;
    }


}
