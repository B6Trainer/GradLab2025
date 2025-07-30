package com.example.demo.common;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class BaseResponse {

    private int responseCode=0;

    private String responseStatus="failed";

    private String responseMessage="Failed to process the request";

    private ResponseBody respObject=null;

}