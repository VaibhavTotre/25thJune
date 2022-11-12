package staticAndNonStaticConcept;

public class BasicsClass1 {
	
public static void main(String[] args) {
	
	  
	   int a=24,b=32,c;
	   
	   if(a<b)
	   {
	    c=a;
	   }
	   else
	   {
	    c=b;
	   }
	   int gcd=0;
	  for(int i=2;i<c;i++)
	   {
	    
	    if(a%i==0 && b%i==0)
	     {
	      gcd=i;
	     }
	   }
	      System.out.println("GCD of "+a+" and "+b+" is "+gcd);
	  
		
}
}
