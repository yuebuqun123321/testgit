package com.wb.pattern.strategy.promotion;

/**
 * @Auther: wb_cheng
 * @Date: 2019/9/18 17:29
 * @Description:
 */
public class CouponStrategy implements PromotionStrategy  {
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券，直接抵扣券面金额");
    }
}
