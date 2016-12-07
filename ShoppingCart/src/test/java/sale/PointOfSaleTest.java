package sale;

import com.market.Product;
import com.market.ProductImpl;
import com.market.Promotion;
import com.market.PromotionImpl;
import com.sale.PointOfSale;
import com.sale.PointOfSaleImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by joschinc on 12/5/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class PointOfSaleTest {
    private Map<String , Product> groceryMarket;
    PointOfSale terminal;
    @Before
    public void setUp(){
        terminal = new PointOfSaleImpl();
        groceryMarket = new HashMap<String, Product>();

        Promotion promotionP0 = new PromotionImpl(0, new BigDecimal("0"));
        Promotion promotionP1 = new PromotionImpl(3, new BigDecimal("3"));
        Promotion promotionP2 = new PromotionImpl(6, new BigDecimal("5"));


        Product p1 = new ProductImpl("A-1", new BigDecimal("1.25"),promotionP1);
        Product p2 = new ProductImpl("3-Q", new BigDecimal("4.25"),promotionP0);
        Product p3 = new ProductImpl("45k11", new BigDecimal("1"),promotionP2);
        Product p4 = new ProductImpl("X1", new BigDecimal("0.75"),promotionP0);

        groceryMarket.put(p1.getCode(),p1);
        groceryMarket.put(p2.getCode(),p2);
        groceryMarket.put(p3.getCode(),p3);
        groceryMarket.put(p4.getCode(),p4);
        terminal.setPricing(groceryMarket);
    }


    @Test
    public void testCalculateTotalPromotionItems(){
        terminal.scan("A-1");
        terminal.scan("3-Q");
        terminal.scan("45k11");
        terminal.scan("X1");
        terminal.scan("A-1");
        terminal.scan("3-Q");
        terminal.scan("A-1");
        BigDecimal result = new BigDecimal("13.25");

        assertEquals("Fail in Calculate Total",result,terminal.calculateTotal());

    }
    @Test
    public void testCalculateTotalOnlyOneProductWithPromotion(){

        terminal.scan("45k11");
        terminal.scan("45k11");
        terminal.scan("45k11");
        terminal.scan("45k11");
        terminal.scan("45k11");
        terminal.scan("45k11");
        terminal.scan("45k11");
        BigDecimal result = new BigDecimal("6");

        assertEquals("Fail in Calculate Total",result,terminal.calculateTotal());
    }
    @Test
    public void testCalculateTotalSingleProduct(){
        terminal.scan("A-1");
        terminal.scan("3-Q");
        terminal.scan("45k11");
        terminal.scan("X1");

        BigDecimal result = new BigDecimal("7.25");
        assertEquals("Fail in Calculate Total",result,terminal.calculateTotal());
    }

}
