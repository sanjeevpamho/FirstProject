package code.bind.multithread;

import java.util.ArrayList;

public class StockProducerConsumer {
	
	TradeDetails tradeDetails=new TradeDetails("IBM", 0);
	
	public static void main(String[] args) {
		
		ArrayList<ItemStock> itemList=new ArrayList<ItemStock>();
		ItemStock itemStock1=new ItemStock(234, "IBM", 300, "sell"); 
		ItemStock itemStock2=new ItemStock(247, "IBM", 300, "buy"); 
		ItemStock itemStock3=new ItemStock(387, "IBM", 300, "buy"); 
		ItemStock itemStock4=new ItemStock(500, "IBM", 300, "buy");
		
		itemList.add(itemStock1);itemList.add(itemStock2);itemList.add(itemStock3);itemList.add(itemStock4);
		
		
		StockProducerConsumer stockProducerConsumer=new StockProducerConsumer();
		BuyThread buyThread=new BuyThread(itemList,stockProducerConsumer);
		SellThread sellThread=new SellThread(itemList, stockProducerConsumer);
		
		buyThread.start();
		sellThread.start();
	}
}
