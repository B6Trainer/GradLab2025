package com.example.demo.module.core.util;

public class URL {

    //Url Configurations
    private final static String THIN_CLIENT_PREFIX = "tc";
    private final static String TC_VERSION = "v1";
    public final static String BASE_URL = "/"+THIN_CLIENT_PREFIX+"/"+ TC_VERSION;

    private final static String API_CLIENT_PREFIX = "api";
    private final static String API_VERSION = "v1";
    public final static String BASE_API_URL = "/"+API_CLIENT_PREFIX+"/"+ API_VERSION;

    public final static String PUBLIC_URL = BASE_URL+"/public";
    public final static String APP_PUBLIC_USER_DETAIL = PUBLIC_URL+"/userdetail";

    public final static String APP_PUBLIC_URL = BASE_URL+"/apppublic";


    public final static String FRONTEND_DOMAIN_PATTERN = "**://localhost:**";


}
