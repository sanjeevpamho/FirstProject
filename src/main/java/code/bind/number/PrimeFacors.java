package code.bind.number;
import java.util.Arrays;

public class PrimeFacors {
	public static void primeFactors(int num) 
	{
		int[] arr=new int[10];
		int j=0;
		while(num % 2==0){
			arr[j++]=2;
			num=num /2;
		}
		//Every composite number has at least one prime factor less than or equal to square root of itself.
		for(int i=3;i<=Math.sqrt(num);i=i+2){
			while(num % i==0){
				arr[j++]=i;
				num=num /i;
			}
		}
		if(num > 2){
			arr[j]=num;
		}
		System.out.println(Arrays.toString(arr));
	} 

	public static void main (String[] args) 
	{ 
	  //	int n = 315;
		int n = 1260;
		primeFactors(n); 
	} 
}
