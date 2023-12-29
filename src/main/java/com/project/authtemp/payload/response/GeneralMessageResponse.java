package com.project.authtemp.payload.response;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GeneralMessageResponse {
    @JsonProperty("isSuccess")
    private boolean isSuccess;

    @JsonProperty("message")
    private String message;

    @JsonProperty("ResponseObject")
    private Map<String, Object> responseObject;

    @JsonProperty("ErrorObject")
    private ErrorResponse errorObject;

}
