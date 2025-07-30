package com.example.demo.helper;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class FunctionalUtil implements AppConstants{

    private static final Logger LOGGER = LoggerFactory.getLogger(FunctionalUtil.class);



    public static String getEnvProperties(String key) {

        String envValue = System.getenv(key);

        if (envValue != null) {
            LOGGER.info("Environment value of key: "+key+" is " + envValue);
        } else {
            envValue="NA";
            LOGGER.warn("Environment variable is not set for key : "+key);
        }

        return envValue;
    }

    public static String getApplicationEnv() {

        String envValue = System.getenv(ENV_KEY);

        if (envValue != null) {
            LOGGER.info("Environment value of key: "+ENV_KEY+" is " + envValue);
        } else {
            envValue="NA";
            LOGGER.warn("Environment variable is not set for key : "+ENV_KEY);
        }

        return envValue;
    }

    public static String getCurrentDateTime() {
        return new DateAndTime().getFormattedDateTime();
    }




}
