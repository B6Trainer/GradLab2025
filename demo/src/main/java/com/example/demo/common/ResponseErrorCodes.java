package com.example.demo.common;


public interface ResponseErrorCodes {

    public int SERVER_ERROR_CODE = 99;
    public int SUCCESS_CODE = 100;
    public int FUNCTIONAL_ERROR = 101;
    public int API_RESPONSE_ERROR = 1200;

    public int INVALID_CREDENTIALS = 2000;
    public int USER_NOT_REGISTERED = 2001;
    public int USER_NOT_LOGGEDIN = 2002;
    public int USER_ALREADY_REGISTERED = 2003;
    public int USER_REGISTERATION_ERROR = 2004;
    public int USER_TOKEN_GEN_ERROR = 2005;
    public int USER_LOGIN_EXPIRED = 2006;
    public int USER_INVALID_ROLE = 2007;
    public int USER_TOKEN_EMPTY = 2008;
    public int USER_LOCKED = 2009;
    public int USER_DISABLED = 2010;
    public int USER_PWD_UNMATCH = 2011;
    public int KYC_FILE_EMPTY = 2012;
    public int KYC_FILE_UPLOAD_ERROR = 2013;
    public int KYC_LIST_FETCH_ERROR = 2014;
    public int KYC_DOC_UPDATE_ERROR = 2015;
    public int BANK_ACC_UPDATE_ERROR = 2016;
    public int ACC_FETCH_ERROR = 2017;
    public int OTP_ERROR = 2018;
    public int CRYP_ACC_UPDATE_ERROR = 2019;

    //Signal Module
    public int CHANNEL_NOT_REGISTERED = 3001;
    public int USER_SERVICE_ERROR_CODE = 2999;
    public int USER_SERVICE_MAPPING_ERROR_CODE = 2998;
    public int SERVER_CONTROLLER_ERROR = 700;
    public int BAD_REQUEST = 701;
    public int TOKEN_EXPIRED = 702;



    //Matrix Module
    public int ADMIN_EXC = 11000;
    //Matrix Module
    public int MATRIX_EXC = 5000;

    //IM PL Module
    public int IM_PL_EXC = 6000;

    //Wallet Module
    public int Wallet_EXC = 7000;

    //Telegram Module errors
    public int TGM_GEN_EXC = 8000;

    //Application Public Module
    public int APP_PUB_EXC = 9000;

    //Event Module
    public int ETM_EXC = 10000;

    //Gold Module
    public int GOLD_EXC = 11000;
}

