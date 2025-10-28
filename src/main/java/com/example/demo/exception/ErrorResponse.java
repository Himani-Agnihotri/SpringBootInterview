package com.example.demo.exception;

import java.util.Date;

public class ErrorResponse {
    private Date timestamp;
    private String msg;
    private int status;

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMsg() {
        return msg;
    }

    public int getStatus() {
        return status;
    }

    public ErrorResponse(Date timestamp, String msg, int status) {
        this.timestamp = timestamp;
        this.msg = msg;
        this.status = status;
    }
}
