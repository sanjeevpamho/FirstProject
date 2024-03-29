package code.bind.multithread;


public class TradeDetails {
	
	String stockName;
	int quantity;
	
	public TradeDetails(String stockName, int quantity) {
		super();
		this.stockName = stockName;
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
}
