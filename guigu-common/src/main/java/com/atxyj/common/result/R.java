package com.atxyj.common.result;

import lombok.Data;

import javax.jws.Oneway;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: xyj
 * @date: 2021/4/28
 */
@Data
public class R {
    private Integer code;

    private String message;

    private Map<String , Object> data = new HashMap<>();

    /**
     * 构造函数私有化
     */
    private R () {}

    /**
     * 返回成功结果
     * @return
     */
    public static  R ok () {
        R r = new R();
        r.setCode(ResponseEnum.SUCCESS.getCode());
        r.setMessage(ResponseEnum.SUCCESS.getMessage());
        return r;
    }

    /**
     * 返回失败结果
     * @return
     */
    public static  R error () {
        R r = new R();
        r.setCode(ResponseEnum.ERROR.getCode());
        r.setMessage(ResponseEnum.ERROR.getMessage());
        return r;
    }

    /**
     * 设置特定的结果集
     * @param result
     * @return
     */
    public static R setResult(ResponseEnum result) {
        R r = new R();
        r.setCode(result.getCode());
        r.setMessage(result.getMessage());
        return r;
    }

    public R data(String key , Object value) {
        this.data.put(key,value);
        return this;
    }

    public R data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }

    /**
     * 返回特定的消息
     * @param message
     * @return
     */
    public R message (String message) {
        this.setMessage(message);
        return this;
    }

    /**
     * 返回特定的响应码
     * @param code
     * @return
     */
    public  R code (Integer code) {
        this.setCode(code);
        return this;
    }


}
