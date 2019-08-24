import cn.ztuo.bitrade.MarketApplication;
import cn.ztuo.bitrade.service.ExchangeOrderService;
import cn.ztuo.bitrade.service.MarketService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MarketApplication.class)
public class MarketAppTest {
    @Autowired
    private MarketService marketService;
    @Autowired
    private ExchangeOrderService exchangeOrderService;

//    @Test
//    public void contextLoads() throws Exception {
//        String json = "{\"amount\":1,\"buyOrderId\":\"E152111410306554\",\"direction\":\"SELL\",\"price\":29.3,\"sellOrderId\":\"E152111428290792\",\"time\":1521114282916}";
//        ExchangeTrade trade = JSON.parseObject(json, ExchangeTrade.class);
//        System.out.println(trade.getBuyOrderId());
//        exchangeOrderService.processExchangeTrade(trade,false);
//    }

}
