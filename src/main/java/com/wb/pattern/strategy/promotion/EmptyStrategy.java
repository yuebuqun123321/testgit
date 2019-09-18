package com.wb.pattern.strategy.promotion;

/**
 * @Auther: wb_cheng
 * @Date: 2019/9/18 17:32
 * @Description:
 */
public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
