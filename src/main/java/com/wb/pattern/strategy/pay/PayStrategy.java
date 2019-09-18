package com.wb.pattern.strategy.pay;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: wb_cheng
 * @Date: 2019/9/18 19:00
 * @Description:
 */
public class PayStrategy {

    public static final String ALI_PAY = "alipay";
    public static final String WECHAT_PAY = "wechatpay";
    public static final String JD_PAY = "jdpay";
    public static final String UNION_PAY = "unionpay";
    public static final String DEFAULT_PAY = ALI_PAY;

    private static final Map<String, Payment> PAYMENT_MAP = new HashMap<>();

    static {
        PAYMENT_MAP.put(ALI_PAY, new AliPay());
        PAYMENT_MAP.put(WECHAT_PAY, new WechatPay());
        PAYMENT_MAP.put(JD_PAY, new JdPay());
        PAYMENT_MAP.put(UNION_PAY, new UnionPay());
    }

    public static Payment getPayment(String payKey) {
        if (!PAYMENT_MAP.containsKey(payKey)) {
            return PAYMENT_MAP.get(DEFAULT_PAY);
        }
        return PAYMENT_MAP.get(payKey);
    }

}
