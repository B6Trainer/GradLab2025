package com.example.demo.module.core.controller;




import com.example.demo.common.BaseController;
import com.example.demo.common.BaseRequest;
import com.example.demo.common.BaseResponse;
import com.example.demo.common.UserActions;
import com.example.demo.module.core.dto.CoreRequest;
import com.example.demo.module.core.util.URL;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(URL.APP_PUBLIC_USER_DETAIL)
public class FirstController extends BaseController implements UserActions {


    @PostMapping("/getuserdetail")
    public ResponseEntity<BaseResponse> getUserDetail(
            @RequestBody CoreRequest request
    ) {
        request.setRequestAction(RA_GET_USER_DETAIL);
        return ResponseEntity.ok(processNewRequest(request));
    }





}

