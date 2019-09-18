package com.wb.pattern.strategy.promotion;

/**
 * @Auther: wb_cheng
 * @Date: 2019/9/18 17:32
 * @Description:
 */
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void execute() {
        this.promotionStrategy.doPromotion();
    }

}
