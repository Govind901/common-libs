package com.dropx.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ResponseDto {
    private String infoMessage;
    private String timeStamp;
    private Data data;

    @AllArgsConstructor
    @lombok.Data
    public static class Data{
        private Object message;
    }

    public ResponseDto(Object data) {
        this.infoMessage = "Success";
        this.timeStamp = LocalDateTime.now().toString();
        this.data = new Data(data);
    }
    public ResponseDto(String status, Object data){
        this.infoMessage = status;
        this.timeStamp = LocalDateTime.now().toString();
        this.data = new Data(data);
    }
}
