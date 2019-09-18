package com.wb.pattern.strategy.pay;

/**
 * @Auther: wb_cheng
 * @Date: 2019/9/18 18:59
 * @Description:
 */
public class JdPay extends Payment {
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    public double queryBalance(String uid) {
        return 500;
    }
}
