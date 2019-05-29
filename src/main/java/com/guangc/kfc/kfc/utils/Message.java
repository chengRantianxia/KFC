package com.guangc.kfc.kfc.utils;
/*
    统一消息
 */

public class Message {
    private  Integer status;//200  500
    private  String message;//保存成功
    private  Object data;//[]/{}
    private  Long timestamp;//时间戳

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
