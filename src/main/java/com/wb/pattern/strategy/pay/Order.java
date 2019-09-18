package com.wb.pattern.strategy.pay;

/**
 * @Auther: wb_cheng
 * @Date: 2019/9/18 19:06
 * @Description:
 */
public class Order {

    private String uid;

    private double amount;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PayState pay() {
        return pay(PayStrategy.DEFAULT_PAY);
    }

    public PayState pay(String payKey) {
        Payment payment = PayStrategy.getPayment(payKey);
        System.out.println("本次使用" + payment.getName());
        System.out.println("开始扣款:" + amount);
        return payment.pay(uid, amount);
    }

    public Order(String uid, double amount) {
        this.uid = uid;
        this.amount = amount;
    }
}
