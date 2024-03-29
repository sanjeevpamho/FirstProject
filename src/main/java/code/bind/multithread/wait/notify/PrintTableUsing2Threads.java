package code.bind.multithread.wait.notify;


public class PrintTableUsing2Threads {
	int status=1;
	public static void main(String[] args) {
		int num =5;
		
		PrintTableUsing2Threads pTable=new PrintTableUsing2Threads();
		PrintOddFactor oddFactor=new PrintOddFactor(pTable, num);
        PrintEvenFactor evenFactor=new PrintEvenFactor(pTable, num);
        
        oddFactor.setName("Odd Thread");
        evenFactor.setName("Even Thread");
		oddFactor.start();
		evenFactor.start();
		System.out.println("EOT");
	}
}
