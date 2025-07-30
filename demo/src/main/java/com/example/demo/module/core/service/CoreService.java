package com.example.demo.module.core.service;


import com.example.demo.common.*;
import com.example.demo.fw.ResponseFactory;
import com.example.demo.fw.ServiceException;
import com.example.demo.module.core.dto.CoreRequest;
import com.example.demo.module.core.dto.CoreResponse;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CoreService extends BaseService implements UserActions {
    private static final Logger LOGGER = LoggerFactory.getLogger(CoreService.class);


    @Override
    public BaseResponse serviceRequest(BaseRequest request) throws ServiceException {

        String requestAction = request.getRequestAction();
        LOGGER.info("Service request received for action "+requestAction);
        BaseResponse baseResp = null;

        switch (requestAction) {

            case RA_GET_USER_DETAIL -> {
                CoreResponse serviceResponse = createGoldBox((CoreRequest) request);
                baseResp = ResponseFactory
                        .buildSuccessResponseWithContent("Core Request successful", serviceResponse);
            }


            default -> {
                baseResp = ResponseFactory.buildBasicErrorResponse(ResponseErrorCodes.SERVER_CONTROLLER_ERROR,
                        "Core  Controller-Service mapping error");
            }
        }

        return baseResp;
    }


    private CoreResponse createGoldBox(CoreRequest request) throws ServiceException {



        return CoreResponse.builder()
                .userName("Demo User")
                .build();

    }




}
