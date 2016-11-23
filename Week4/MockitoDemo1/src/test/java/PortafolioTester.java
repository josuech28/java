import com.portafolio.Portafolio;
import com.stock.Stock;
import com.stock.StockService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
/**
 * Created by joschinc on 11/23/16.
 */
public class PortafolioTester {
    Portafolio portfolio;
    StockService stockService;

    public void setUp(){
        //Create a portfolio object which is to be tested
        portfolio = new Portafolio();

        //Create the mock object of stock service
        stockService = mock(StockService.class);

        //set the stockService to the portfolio
        portfolio.setStockService(stockService);
    }

    public boolean testMarketValue(){

        //Creates a list of stocks to be added to the portfolio
        List<Stock> stocks = new ArrayList<Stock>();
        Stock googleStock = new Stock("1","Google", 10);
        Stock microsoftStock = new Stock("2","Microsoft",100);

        stocks.add(googleStock);
        stocks.add(microsoftStock);

        //add stocks to the portfolio
        portfolio.setStocks(stocks);

        //mock the behavior of stock service to return the value of various stocks
        when(stockService.getPrice(googleStock)).thenReturn(new BigDecimal("50.00"));
        when(stockService.getPrice(microsoftStock)).thenReturn(new BigDecimal("1000.00"));

        BigDecimal marketValue = portfolio.getMarketValue();
        return marketValue == new BigDecimal("100500.0");
    }
}
