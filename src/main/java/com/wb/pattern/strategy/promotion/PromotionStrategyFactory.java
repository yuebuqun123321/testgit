package com.wb.pattern.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: wb_cheng
 * @Date: 2019/9/18 17:41
 * @Description:
 */
public class PromotionStrategyFactory {

    private PromotionStrategyFactory() {}

    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    private static final PromotionStrategy DEFAULT_STRATEGY = new EmptyStrategy();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON, new CouponStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASHBACK, new CashbackStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.GROUPBUY, new GroupbuyStrategy());
    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey) {
        return PROMOTION_STRATEGY_MAP.get(promotionKey) == null ? DEFAULT_STRATEGY : PROMOTION_STRATEGY_MAP.get(promotionKey);
    }

    private interface PromotionKey {

        String COUPON = "COUPON";

        String CASHBACK = "CASHBACK";

        String GROUPBUY = "GROUPBUY";

    }


}
