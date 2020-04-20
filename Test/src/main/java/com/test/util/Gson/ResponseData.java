package com.test.util.Gson;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class ResponseData implements Serializable {
    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;
    
}
