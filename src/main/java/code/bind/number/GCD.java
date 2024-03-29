package code.bind.number;


public class GCD {
	
	public static void main(String[] args) {
		
		System.out.println(GCDfun(28, 20));
		System.out.println(GCDfun(98, 56));
	}
	
	/* The idea is, GCD of two numbers doesn�t change if smaller number is subtracted from a bigger number. */
	public static int GCDfun(int a,int b){
		if(a == 0)
			return b;
		if(b==0)
			return a;
		
		if(a==b)
			return a;
		
		if(a>b)
			return GCDfun( a-b,b);
		
		return GCDfun(b-a, a);
		
	}
	// Recursive function to return gcd of a and b 
 /*  
   static int gcd(int a, int b) 
    { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    }
   */  
}
