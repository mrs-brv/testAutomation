package com.jsystems.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorResponse {
    @JsonProperty("Error")
    public ErrorBody error;

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "error=" + error +
                '}';
    }
    public class ErrorBody{
        @JsonProperty("error.code")
        public Integer error_code;
        public String validation_erro;
        public String message;

        @Override
        public String toString() {
            return "ErrorBody{" +
                    "error_code=" + error_code +
                    ", validation_error='" + validation_erro + '\'' +
                    ", message='" + message + '\'' +
                    '}';
        }
    }
}
