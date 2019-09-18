package com.wb.pattern.strategy.pay;

/**
 * @Auther: wb_cheng
 * @Date: 2019/9/18 19:10
 * @Description:
 */
public class PayTest {

    public static void main(String[] args) {
        Order order = new Order("123456789000", 550);
        PayState payState = order.pay(PayStrategy.JD_PAY);
        System.out.println(payState);
    }

}
