package code.bind.queue;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DequeExample {

	public static void main(String[] args) throws IOException {
		Deque<String> deque=new ArrayDeque<String>();  
		deque.offer("arvind");  
		deque.offer("vimal");  
		deque.add("mukul");  
		deque.addFirst("Sanjeev");  
		deque.addLast("Sumit");
		System.out.println("After offerFirst Traversal...");  
		for(String s:deque){  
			System.out.println(s);  
		}  
		//deque.poll();  
		//deque.pollFirst();//it is same as poll()  
		deque.pollLast();  
		System.out.println("After pollLast() Traversal...");  
		for(String s:deque){  
			System.out.println(s);  
		}  
	}
}
