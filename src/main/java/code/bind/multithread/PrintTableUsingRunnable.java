package code.bind.multithread;

class PrintTable implements Runnable {
	int remainder;
	int number;
	static Object lock = new Object();
	public int PRINT_NUMBERS_UPTO = 10;
	static int index = 1;

	PrintTable(int remainder, int number) {
		this.remainder = remainder;
		this.number = number;
	}

	@Override
	public void run() {
		while (index < PRINT_NUMBERS_UPTO) {
			synchronized (lock) {
				while (index % 2 != remainder) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (index % 2 == remainder) {
					System.out.println(Thread.currentThread().getName() + " : " + number + " * " + index + "  : "
							+ number * index);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					index++;
					lock.notify();
				}
			}
		}

	}
}

public class PrintTableUsingRunnable {
	public static void main(String[] args) {
		int num = 4;
		PrintTable oddRunnable = new PrintTable(1, num);
		PrintTable evenRunnable = new PrintTable(0, num);

		Thread oddThread = new Thread(oddRunnable, "Odd Thread");
		Thread evenThread = new Thread(evenRunnable, "Even Thread");
		oddThread.start();
		evenThread.start();
	}
}
