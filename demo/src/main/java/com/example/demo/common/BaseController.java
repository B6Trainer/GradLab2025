package com.example.demo.common;

import com.example.demo.fw.ServiceFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class BaseController implements RequestActions , UserActions {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseController.class);
    @Autowired
    private ServiceFacade serviceFacade ;

    protected BaseResponse processNewRequest(BaseRequest request) {

        LOGGER.info(request.getRequestAction()
                +" request received. Request body: " + request.toString());

        BaseResponse response= serviceFacade.processRequest(request);

        LOGGER.info("Response sent : " + response.toString());
        return response;
    }

}

