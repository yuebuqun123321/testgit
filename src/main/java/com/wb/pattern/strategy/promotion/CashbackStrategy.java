package com.wb.pattern.strategy.promotion;

/**
 * @Auther: wb_cheng
 * @Date: 2019/9/18 17:30
 * @Description:
 */
public class CashbackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销，直接返现支付宝");
    }
}
