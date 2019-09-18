package com.wb.pattern.strategy.promotion;

/**
 * @Auther: wb_cheng
 * @Date: 2019/9/18 17:31
 * @Description:
 */
public class GroupbuyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("团购促销，满20人全团优惠");
    }
}
