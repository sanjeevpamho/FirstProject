package code.bind.stack;

import java.util.Arrays;
import java.util.Scanner;

public class StackImplementation {
	public static void main(String[] args) throws Exception {
		int ch=0;
		
		FixedSizeArrayStack stack=new FixedSizeArrayStack(10);
		
		do{
			//System.out.println("Stack Implementation");
			System.out.print("Enter 1 for push");
			System.out.print("Enter 2 for pop");
			System.out.print("Enter 3 for Display");
			System.out.print("Enter 4 for Exit");
			Scanner sc=new Scanner(System.in);
			ch=sc.nextInt();
			
			switch (ch){
			
			case 1:
				System.out.println("Enter data:");
				int data=sc.nextInt();
				stack.push(data);
				break;
			case 2:
				stack.pop();
				break;
			case 3:
				System.out.println(Arrays.toString(stack.stackRep));
			break;
			
			case 4:
				System.out.println("Exit");
				System.exit(0);
			default:
				System.out.println("Invalid Output");
				
				
			}
			
			
		}while(ch !=4);
	}
}
