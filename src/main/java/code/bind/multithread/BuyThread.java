package code.bind.multithread;

import java.util.List;

public class BuyThread extends Thread{
	List<ItemStock> itemList;
	TradeDetails tradeDetails;
	StockProducerConsumer stockProducerConsumer;
	
	BuyThread(List<ItemStock> itemList,StockProducerConsumer stockProducerConsumer){
		this.itemList=itemList;
		this.tradeDetails=tradeDetails;
		this.stockProducerConsumer=stockProducerConsumer;
	}

	public void run() {

		synchronized (stockProducerConsumer) {

			for(ItemStock itemStock : itemList){
                    
				while(itemStock.stockTrade.equals("sell")){
					try {
						stockProducerConsumer.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				stockProducerConsumer.tradeDetails.setQuantity(stockProducerConsumer.tradeDetails.getQuantity()+itemStock.quantity);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				stockProducerConsumer.notify();
				
			}
		}

	}

}
