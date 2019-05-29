package com.guangc.kfc.kfc.utils;

import java.util.Date;

/*
    消息工具类
 */
public class MessageUtil {
    public static Message success(String msg){
        Message message = new Message();
        message.setStatus(200);
        message.setMessage(msg);
        message.setData(null);
        message.setTimestamp(new Date().getTime());
        return message;
    }
    public static Message success(String msg,Object data){
        Message message = new Message();
        message.setStatus(200);
        message.setMessage(msg);
        message.setData(data);
        message.setTimestamp(new Date().getTime());
        return message;
    }
    public static Message success(Object data){
        Message message = new Message();
        message.setStatus(200);
        message.setMessage("success");
        message.setData(data);
        message.setTimestamp(new Date().getTime());
        return message;
    }
    public static Message error(String msg){
        Message message = new Message();
        message.setStatus(500);
        message.setMessage(msg);
        message.setData(null);
        message.setTimestamp(new Date().getTime());
        return message;
    }
}
