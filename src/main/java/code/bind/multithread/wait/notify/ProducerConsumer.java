package code.bind.multithread.wait.notify;

import java.util.LinkedList;

public class ProducerConsumer
{
	public static void main(String[] args) throws InterruptedException {
		ProducerConsumer threadexample=new ProducerConsumer();
		final  PC pc=new PC();

		Thread t1=new Thread(){
			public void run(){
				try {
					pc.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t2=new Thread(){
			public void run(){
				try {
					pc.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};


		t1.start();
		t2.start();

		t1.join();
		t1.join();
	}

	public static class PC{

		LinkedList<Integer> ll=new LinkedList<Integer>();
		int capacity=2;

		public void produce() throws InterruptedException{
			int count=0;
			while(true){
				synchronized(this){

					while(ll.size()==capacity){
						wait();
					}
					System.out.println("Producer produced :"+count);
					ll.add(++count);
					notify();
					Thread.sleep(1000);
				}
			}
		}

		public void consume() throws InterruptedException{
			while(true){
				synchronized (this) {


					while(ll.size()==0){
						wait();
					}
					System.out.println("Consumer consumed :"+ll.removeFirst());
					notify();
					Thread.sleep(1000);
				}
			}
		}
	}
}
