package com.example.demo.module.core.dto;


import com.example.demo.common.BaseRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;



@Data
@SuperBuilder
@NoArgsConstructor
@Getter
public class CoreRequest extends BaseRequest {

    @JsonProperty("email")
    private String email;



}
