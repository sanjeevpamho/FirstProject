package code.bind.array.medium;

import java.util.ArrayList;

class Interval {
	int buy = 0;
	int sell = 0;
}

public class StockBuySell {

	public static void main(String[] args) {

		// int[] price = { 100, 180, 260, 310, 40, 535, 695 };
		int[] price = { 100, 90, 80, 70, 85, 95, 105,115,60,50 };
		//int[] price = { 100, 90 };
		int n = price.length;
		StockBuySell stock = new StockBuySell();
		stock.stockBuySell(price, n);
	}

	private void stockBuySell(int[] price, int n) {
		if (n == 1) {
			System.out.println("Price must be for 2 days");
			return;
		}

		ArrayList<Interval> arraylist = new ArrayList<Interval>();
		int i = 0;
		while (i < n - 1) {
			while ((i < n - 1) && price[i] > price[i + 1]) {
				i++;
			}
			if (i == n - 1) {
				break;
			}
			Interval interval = new Interval();
			interval.buy = price[i++];
			while (i < n && price[i - 1] < price[i]) {
				i++;
			}
			interval.sell = price[i - 1];
			arraylist.add(interval);
		}
		if (arraylist.isEmpty()) {
			System.out.println("There is no day when buying the stock will make profit");
		} else {
			for (Interval interval : arraylist) {
				System.out.println("Stock Buy at price:" + interval.buy);
				System.out.println("Stock sell at price:" + interval.sell);
			}
		}

	}
}
