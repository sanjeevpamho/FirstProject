package code.bind.string.easy;


public class StringLengthUsingRecursion {  

	static int i=0, j=0,curr_sum=0,count =0;
	public static void main(String args[]) 
	{
		
		System.out.println(stringLen("Sanjeev"));
	}
	static int stringLen(String str) {
		if(str.equals("")){return 0;}
		
		return stringLen(str.substring(1))+1;
	}
}



