package code.bind.multithread;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierMain {

	public static void main(String[] args) {
		Runnable barrier1Action=new Runnable() {
			public void run() {
				System.out.println("barrier1Action executed");
			}
		};

		Runnable barrier2Action=new Runnable() {
			public void run() {
				System.out.println("barrier2Action executed");
			}
		};


		CyclicBarrier barrier1=new CyclicBarrier(2);
		CyclicBarrier barrier2=new CyclicBarrier(2);
		//	CyclicBarrier barrier1=new CyclicBarrier(2, barrier1Action);
		//	CyclicBarrier barrier2=new CyclicBarrier(2, barrier2Action);


		CyclicBarrierRunnable barrierRunnable1=new  CyclicBarrierRunnable(barrier1,barrier2);
		CyclicBarrierRunnable barrierRunnable2=new  CyclicBarrierRunnable(barrier1,barrier2);


		new Thread(barrierRunnable1).start();
		new Thread(barrierRunnable2).start();


		int i=2;
		double j=5;

		System.out.println("i:"+ i++  + "j:"+  j++);

		System.out.println("i:"+ i++  + "j:"+  j++);




	}
}
