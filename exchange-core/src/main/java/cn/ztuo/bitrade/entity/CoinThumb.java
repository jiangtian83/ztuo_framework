package cn.ztuo.bitrade.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class CoinThumb {
    private String symbol;
    private BigDecimal open = BigDecimal.ZERO;
    private BigDecimal high= BigDecimal.ZERO;
    private BigDecimal low= BigDecimal.ZERO;
    private BigDecimal close=BigDecimal.ZERO;
    private BigDecimal chg = BigDecimal.ZERO.setScale(2);
    private BigDecimal change = BigDecimal.ZERO.setScale(2);
    private BigDecimal volume = BigDecimal.ZERO.setScale(2);
    private BigDecimal turnover= BigDecimal.ZERO;
    //昨日收盘价
    private BigDecimal lastDayClose = BigDecimal.ZERO;
    //对usd汇率
    private BigDecimal usdRate;
    //基币对usd的汇率
    private BigDecimal baseUsdRate;
    private String closeStr;
    //web端用的
    private List<BigDecimal> trend ;

    private BigDecimal proportion;
}
