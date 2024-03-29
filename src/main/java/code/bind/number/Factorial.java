package code.bind.number;


public class Factorial {
	
	public static void main(String[] args) {
		reverse(5143);
	}
	public static void reverse(int num){
		int reverse=0;
		while(num!=0){
			reverse=(reverse*10)+num%10;
			num=num/10;
		}
		System.out.println(reverse);
	}
	
}
