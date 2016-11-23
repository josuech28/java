package com.portafolio;

import com.operation.PortafolioOperation;
import com.stock.Stock;
import com.stock.StockService;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by joschinc on 11/23/16.
 */
public class Portafolio {
    private StockService stockService;
    private List<Stock> stocks;

    public StockService getStockService() {
        return stockService;
    }

    public void setStockService(StockService stockService) {
        this.stockService = stockService;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }

    public BigDecimal getMarketValue(){
        PortafolioOperation operation = new PortafolioOperation();
        BigDecimal marketValue = BigDecimal.ZERO;

        for(Stock stock:stocks){
            marketValue = marketValue.add(operation.getMarketValue(stockService.getPrice(stock), stock.getQuantity()));
        }
        return marketValue;
    }
}
