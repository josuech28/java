package shoppingcart;

import com.market.Product;
import com.market.ProductImpl;
import com.market.Promotion;
import com.market.PromotionImpl;
import com.shoppingcart.ShoppingCartService;
import com.shoppingcart.ShoppingCartServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by joschinc on 12/5/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class ShoppingCartServiceTest {

    private ShoppingCartService shoppingCartService;
    private BigDecimal quantity;
    private Product product;
    private Promotion promotion;

    @Before
    public void setUp(){
        quantity = new BigDecimal("5");
        promotion = new PromotionImpl(3,new BigDecimal("3.00"));
        product = new ProductImpl("A-1",new BigDecimal("1.25"),promotion);
        shoppingCartService = new ShoppingCartServiceImpl();
    }
    @Test
    public void testCalculateAmount(){
        BigDecimal result = new BigDecimal("5.50");
        assertEquals("Fail in getShoppingCartDetailWithAmount",result,shoppingCartService.calculateAmount(quantity,product));
    }
    @Test
    public void testCalculateAmountWithOnlyPromotion(){
        quantity = new BigDecimal("6");
        BigDecimal result = new BigDecimal("6.00");

        //when(shoppingCartService.calculateAmount(quantity,product)).thenReturn(result);

        assertEquals("Fail in getShoppingCartDetailWithAmount",result,shoppingCartService.calculateAmount(quantity,product));

        //verify(shoppingCartService).calculateAmount(quantity,product);
    }
    @Test
    public void testCalculateAmountWitOutPromotion(){
        quantity = new BigDecimal("2");
        BigDecimal result = new BigDecimal("2.50");

        assertEquals("Fail in getShoppingCartDetailWithAmount",result,shoppingCartService.calculateAmount(quantity,product));

        //verify(shoppingCartService).calculateAmount(quantity,product);
    }

    @Test(expected = ArithmeticException.class)
    public void testCalculateAmountWitNegativeQuantity(){
        quantity = new BigDecimal("-3");

        //when(shoppingCartService.calculateAmount(quantity,product)).thenThrow(ArithmeticException.class);

        assertEquals("Fail in getShoppingCartDetailWithAmount",ArithmeticException.class,shoppingCartService.calculateAmount(quantity,product));

        //verify(shoppingCartService).calculateAmount(quantity,product);
    }
}
