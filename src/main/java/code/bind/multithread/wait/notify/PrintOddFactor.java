package code.bind.multithread.wait.notify;


public class PrintOddFactor extends Thread{
	PrintTableUsing2Threads pTable;
	int num;
	public PrintOddFactor(PrintTableUsing2Threads pTable,int num) {
		this.pTable=pTable;
		this.num=num;
	}

	public void run() {
		try {
			synchronized (pTable) {

				for(int i=1;i<=10;i++) {
					while(pTable.status!=1) {
							pTable.wait();
					}
					if(i%2 !=0) {
						System.out.println("Print by "+Thread.currentThread().getName()+":"+num*i);
						Thread.sleep(1000);
						pTable.status=2;
						pTable.notifyAll();
					}
				}
			}
		}
		catch(Exception e) {}
	}
}
