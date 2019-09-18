package com.wb.pattern.strategy.promotion;

/**
 * @Auther: wb_cheng
 * @Date: 2019/9/18 17:33
 * @Description:
 */
public class StrategyTest {

    public static void main(String[] args) {

        String promotionKey = "CASHBACK";
        new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey)).execute();

//        String promotionKey = "COUPON";
//        PromotionActivity promotionActivity = null;
//        if ("COUPON".equals(promotionKey)) {
//            promotionActivity = new PromotionActivity(new CouponStrategy());
//        } else if ("CASHBACK".equals(promotionKey)) {
//            promotionActivity = new PromotionActivity(new CashbackStrategy());
//        } else {
//            //....
//        }
//        promotionActivity.execute();
    }

}
