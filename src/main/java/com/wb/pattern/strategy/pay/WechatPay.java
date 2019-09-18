package com.wb.pattern.strategy.pay;

/**
 * @Auther: wb_cheng
 * @Date: 2019/9/18 18:59
 * @Description:
 */
public class WechatPay extends Payment {
    @Override
    public String getName() {
        return "微信";
    }

    @Override
    public double queryBalance(String uid) {
        return 300;
    }
}
