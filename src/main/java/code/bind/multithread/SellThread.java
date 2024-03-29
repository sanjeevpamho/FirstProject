package code.bind.multithread;

import java.util.ArrayList;
import java.util.List;


public class SellThread extends Thread{
	
	List<ItemStock> itemList;
	TradeDetails tradeDetails;
	StockProducerConsumer stockProducerConsumer;
	
	SellThread(List<ItemStock> itemList,StockProducerConsumer stockProducerConsumer){
		this.itemList=itemList;
		this.tradeDetails=tradeDetails;
		this.stockProducerConsumer=stockProducerConsumer;
	}
	
	public void run() {
		
		
		synchronized (stockProducerConsumer) {
			
			for(ItemStock itemStock : itemList){
				while(itemStock.stockTrade.equals("buy")){
					try {
						stockProducerConsumer.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				//if()
				stockProducerConsumer.tradeDetails.setQuantity(stockProducerConsumer.tradeDetails.getQuantity()+itemStock.quantity);
			}
		}
	}
}
