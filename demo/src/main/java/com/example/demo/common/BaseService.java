package com.example.demo.common;

import com.example.demo.fw.ServiceException;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public abstract class BaseService extends BaseServiceHelper {


    @Value("${project.volume.volumehome}")
    private String projectVolumeHome;

    @Value("${project.volume.depofolder}")
    private String depoFolder;

    @Value("${project.volume.imagesfolder}")
    private String imagesFolder;


    protected String getProjectVolumeHome()  {
        return projectVolumeHome;
    }


    protected String getImagesFolder()  {
        return projectVolumeHome+imagesFolder;
    }


    protected String getDepoFolder()  {
        return projectVolumeHome+depoFolder;
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseService.class);

    @Override
    public BaseResponse processRequest(BaseRequest request) throws ServiceException {
        return serviceRequest(request);
    }

    public abstract BaseResponse serviceRequest(BaseRequest request) throws ServiceException;




}
