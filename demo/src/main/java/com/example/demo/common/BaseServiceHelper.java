package com.example.demo.common;


import com.example.demo.fw.IService;
import com.example.demo.fw.ServiceException;
import com.example.demo.helper.AppConstants;
import com.example.demo.helper.FunctionalUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public abstract class BaseServiceHelper implements ResponseErrorCodes, AppConstants, IService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseServiceHelper.class);

    @Value("${project.volume.volumehome}")
    private String projectVolumeHome;

    @Value("${project.volume.imagesfolder}")
    private String imagesFolder;

    protected String getImagesFolder()  {
        return projectVolumeHome+imagesFolder;
    }

    public String getCurrentDateTime() {
        return FunctionalUtil.getCurrentDateTime();
    }


    public String getDocumentName(String documentName, String documentType, Integer userId) {

        return userId+"-"+documentType+"-"+documentName;
    }

    public abstract BaseResponse processRequest(BaseRequest request) throws ServiceException;


}
