package com.wb.pattern.strategy.pay;

/**
 * @Auther: wb_cheng
 * @Date: 2019/9/18 18:50
 * @Description:
 */
public abstract class Payment {

    /**
     * 支付类型
     * @return
     */
    public abstract String getName();

    /**
     * 查询余额
     * @param uid
     * @return
     */
    public abstract double queryBalance(String uid);

    /**
     * 扣款
     * @param uid
     * @param amount
     * @return
     */
    public PayState pay(String uid, double amount) {
        if (queryBalance(uid) < amount) {
            return new PayState(500, "余额不足", "支付失败");
        }
        return new PayState(200, "支付金额" + amount, "支付成功");
    }

}
