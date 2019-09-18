package com.wb.pattern.strategy.pay;

/**
 * @Auther: wb_cheng
 * @Date: 2019/9/18 18:52
 * @Description:
 */
public class PayState {

    private int code;

    private Object data;

    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "支付状态: [" + code + "]," + msg + ", 交易详情:" + data;
    }

    public PayState(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }
}
