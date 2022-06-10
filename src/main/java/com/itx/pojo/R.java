package com.itx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class R {
    private String msg;
    private Integer status;
    private Object data;

    public static R success(String msg){
        return new R(msg,200,null);
    }
    public static R success(String msg,Object data){
        return new R(msg,200,data);
    }

    public static R error(String msg){
        return new R(msg,500,null);
    }
    public static R error(String msg,Object data){
        return new R(msg,500,data);
    }


}
