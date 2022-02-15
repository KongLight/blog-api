package com.springdev.blogapi.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Chen
 * @create 2022/2/14 22:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    private boolean success;

    private int code;

    private String msg;

    private Object data;

    public static Result success(Object data){
        return new Result(true, 200, "success", data);
    }

    public static Result fail(int code, String msg){
        return new Result(false, code, msg, null);
    }
}
