package com.huxiang.bean;

import java.util.List;

/**
 * http回复实体
 * Created by Administrator on 2017/11/17.
 */
public class ClocleResult<T> {
    private String msg;//信息
    private int code;//信息码
    private List<T> data;//数据内容

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<T> getT() {
        return data;
    }

    public void setT(List<T> data) {
        this.data = data;
    }
}
