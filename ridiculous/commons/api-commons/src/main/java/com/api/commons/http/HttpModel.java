package com.api.commons.http;

import java.io.Serializable;

public class HttpModel implements Serializable {


    private static volatile  HttpModel instance = null;

    private HttpModel (){

    }

    public static HttpModel build() {
        if (instance == null) {
            synchronized (HttpModel.class) {
                if (instance == null) {
                    instance = new HttpModel();
                }
            }
        }
        return instance;
    }


    private String messages;

    private Integer status;

    private Object response;



    public String getMessages() {
        return messages;
    }

    public HttpModel setMessages(String messages) {
        this.messages = messages;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public HttpModel setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Object getResponse() {
        return response;
    }

    public HttpModel setResponse(Object... response) {
        this.response = response;
        return this;
    }

}
