package code.bind.multithread;


public class ItemStock {
	
	int stockId;
	String stockName;
	int quantity;
	String stockTrade;
	
	public ItemStock(int stockId, String stockName, int quantity, String stockTrade) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.quantity = quantity;
		this.stockTrade = stockTrade;
	}

	@Override
	public String toString() {
		return "ItemStock [stockId=" + stockId + ", stockName=" + stockName + ", quantity=" + quantity + ", stockTrade=" + stockTrade + "]";
	}
	
	
}
