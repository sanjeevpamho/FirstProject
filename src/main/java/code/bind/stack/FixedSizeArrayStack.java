package code.bind.stack;

import java.util.Arrays;

public class FixedSizeArrayStack {
	
	public static final int CAPACITY=10;
	public int capacity;
	static int[] stackRep;
	public int top=-1;
	
	FixedSizeArrayStack(){
		this(CAPACITY);
	}
	
	
	public FixedSizeArrayStack(int capacity) {
		this.capacity=capacity;
		stackRep=new int[capacity];
		System.out.println(Arrays.toString(stackRep));
	}

	int size() {
		return top+1;
	}
	public boolean isEmpty() {
		return(top==-1);
			
	}
	
	public void push(int data) throws Exception {
		if(size()==capacity) {
			throw new Exception("Stack is full");
		}
		stackRep[++top]=data;
	}
	
	public int pop() throws Exception {
		int data;
		if(isEmpty()) {
			throw new Exception("tack is Empty");
		}
		data=stackRep[top];
		top=top-1;
		//stackRep[top--]=Integer.MIN_VALUE;
		return data;
	}
	
	public int top() throws Exception {
		if(isEmpty())
			throw new Exception("Stack is empty");
				return stackRep[top];
	}
	public static void main(String[] args) throws Exception {
		
		FixedSizeArrayStack fsas=new FixedSizeArrayStack(10);
		
		System.out.println("fsas.isEmpty():"+fsas.isEmpty());
		System.out.println("fsas.size():"+fsas.size());
		
		fsas.push(10);fsas.push(20);fsas.push(30);fsas.push(40);fsas.push(50);fsas.push(60);fsas.push(70);fsas.push(80); //fsas.push(90);
		
		System.out.println(Arrays.toString(stackRep));
		
	}
}
