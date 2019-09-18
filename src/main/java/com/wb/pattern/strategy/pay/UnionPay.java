package com.wb.pattern.strategy.pay;

/**
 * @Auther: wb_cheng
 * @Date: 2019/9/18 19:00
 * @Description:
 */
public class UnionPay extends Payment {
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    public double queryBalance(String uid) {
        return 400;
    }
}
