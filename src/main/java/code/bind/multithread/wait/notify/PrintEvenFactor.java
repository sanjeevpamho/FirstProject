package code.bind.multithread.wait.notify;


public class PrintEvenFactor extends Thread{

	PrintTableUsing2Threads pTable;
	int num;
	public PrintEvenFactor(PrintTableUsing2Threads pTable,int num) {
		this.pTable=pTable;
		this.num=num;
	}

	public void run() {
		synchronized (pTable) {

			try {

				for(int i=1;i<=10;i++) {
                    
					while(pTable.status !=2) {
						pTable.wait();
					}
					if(i%2 ==0) {
						System.out.println("Print by "+Thread.currentThread().getName()+":"+num*i);
						pTable.status=1;
						pTable.notifyAll();
					}
				}
			}
			catch(Exception e) {}
		}

	}
}
