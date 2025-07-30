package com.example.demo.module.core.dto;


import com.example.demo.common.ResponseBody;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder

public class CoreResponse implements ResponseBody {


  @JsonProperty("user_name")
  private String userName;



}
