package AssignmentsJava;

public class PracticeClass1 {

	public static void main(String[] args) {
//		 
//	//------------------------------------------------	
//		double a=624;
//		double sr=a/2;    //assume
//		double temp;
//		
//		do
//		{
//			temp=sr;
//			sr=(temp+(a/temp))/2;
//			
//		}
//		while((temp-sr)!=0);
//		
//		System.out.println("Square root of "+a+" is "+sr);
//			
//-------------------------------------------------------
//	int a=34;
//	int b=17;
//	int c;
//	int gcd=0;
//	if(a<b)
//	{
//		c=a;
//	}
//	else
//	{
//		c=b;
//	}
//		for(int i=2;i<=c;i++)
//		{
//			if(c%i==0)	
//			{
//				gcd=i;
//			}
//		}
//		System.out.println("GCD of "+a+" & "+b+" is "+gcd);
//------------------------------------------------------------
//	int a=153;
//	int b=a;
//	int len=0;
//	while(b!=0)
//	{
//		len=len+1;
//		b=b/10;
//	}
//	int c=a;
//	int rem;
//	int arm=0;
//	while(c!=0)
//	{
//		rem=c%10;
//		int mul=1;
//		for(int i=1;i<=len;i++)
//		{
//			mul=rem*mul;
//		}
//		
//		arm=arm+mul;
//		c=c/10;
//	}
//	System.out.println(arm);
//		if(arm==a)
//		{
//			System.out.println(a+" is an armstrong number");
//		}
//-----------------------------------------------------------
//		int a=0,b=1;
//		int c;
//		System.out.print(a+" "+b);
//		for(int i=1;i<=8;i++)
//		{
//			c=a+b;
//			System.out.print(" "+c);
//			a=b;
//			b=c;
//		}
//--------------------------------------------------------------
//		int k=0;
//		for(int i=1;i<=30;i++) 
//		{
//		 for(int j=2;j<=i-1;j++)
//		 {
//			 if(i%j==0)
//			 {
//				 k=k+1;
//			 }
//		 }
//		 if(k==0)
//		 {
//			 System.out.println(i);
//		 }
//		 else
//		 {
//			 k=0;		 
//		 }
//		}
//------------------------------------------------------------
		// Largest of two numbers
//		int a=17;
//		int b=14;
//		if(a>b)
//		{
//			System.out.println(a+" is greater");
//		}
//		else
//		{
//			System.out.println(b+" is greater");
//		}
//--------------------------------------------------------------		
//    Largest of three numbers
//		int a=19;
//		int b=14;
//		int c=18;
//		if(a>b && a>c)
//		{
//			System.out.println(a+" is greater");
//		}
//		else if(b>a && b>c)
//		{
//			System.out.println(b+ " is greater");
//		}
//		else
//		{
//			System.out.println(c+" is greater");
//		}
//-----------------------------------------------------------			
	// Smaller of three numbers
//		int a=19;
//		int b=14;
//		int c=18;
//		if(a<b && a<c)
//		{
//			System.out.println(a+" is smaller");
//		}
//		else if(b<a && b<c)
//		{
//			System.out.println(b+ " is smaller");
//		}
//		else
//		{
//			System.out.println(c+" is smaller");
//		}
		
//-----------------------------------------------------------		
	
 // GCD of two numbers
//		int a=24, b=52;
//		int c;
//		int gcd=0;
//		if(a<b)
//		{
//			c=a;
//		}
//		else
//		{
//			c=b;
//		}
//		for(int i=2;i<=c;i++)
//		{
//			if(a%i==0 && b%i==0)
//			{
//				gcd=i;
//			}
//		}
//		System.out.println("GCD is "+ gcd);

//------------------------------------------------------------
//Positive or negative
//		int a=7;
//		if(a>0)
//		{
//			System.out.println(a+" is positive");
//		}
//		else if(a<0)
//		{
//			System.out.println(a+" is negative");
//		}
//		else
//		{
//			System.out.println(a+" is zero");
//		}
//-----------------------------------------------------------
//Odd or even		
//       int a=7;
//       if(a%2==0)
//       {
//    	   System.out.println(a+" is even");
//       }
//       else
//       {
//    	   System.out.println(a+" is odd");
//       }
// //----------------------------------------------------------
// //List even and odd no from 1 to 100
//       for(int i=1;i<=100;i++)
//       {
//    	   if(i%2==0)
//    	   {
//    		   System.out.println(i+" is even");
//    	   }
//    	   else
//    	   {
//    		   System.out.println(i+" is odd");
//    	   }
//       }
//------------------------------------------------------------
//Sum of first 10 natural numbers
//		int sum=0;
//		for(int i=1;i<=10;i++)
//		{
//			sum=sum+i;
//		}
//		System.out.println("sum is "+sum);
//-----------------------------------------------------
//Multiplication of first 10 natural nos.
//		int mult=1;
//		for(int i=1;i<=10;i++)
//		{
//			mult=mult*i;
//		}
//		System.out.println("Multiplication is "+mult);
//----------------------------------------------------------
//Fibonacci series upto 10 level
//		int a=0,b=1;
//		int c;
//		System.out.print(a+" "+b);
//		for(int i=1;i<9;i++)
//		{
//			c=a+b;
//			System.out.print(" "+c);
//			a=b;
//			b=c;
//		}
//-------------------------------------------------------------
//Palindrome number
//		int a=151;
//		int b=a;
//		int rem=0;
//		int reverse=0;
//		while(b!=0)
//		{
//			rem=b%10;
//			reverse=reverse*10+rem;
//			b=b/10;
//			
//		}
//		if(reverse==a)
//		{
//			System.out.println(a+" is a palindrome number");
//		}
//		else
//		{
//			System.out.println(a+" is not a palindrome number");
//		}
//---------------------------------------------------------
//Reverse the number
//		int a=153;
//		int b=a;
//		int rem=0;
//		int reverse=0;
//		while(b!=0)
//		{
//			rem=b%10;
//			reverse=reverse*10+rem;
//			b=b/10;
//			
//		}
//		System.out.println(reverse);
//-----------------------------------------------------------
//Factorial of number
//		int a=5;
//		int fact=1;
//		for(int i=a;i>=1;i--)
//		{
//			fact=fact*i;
//		}
//		System.out.println("Factorial of "+a+" is "+fact);
//-----------------------------------------------------------
//Armstrong number
//		int a=153;
//		int b=a;
//		int length=0;
//		while(b!=0)
//		{
//			b=b/10;
//			length=length+1;
//		}
//		int c=a;
//		int rem;
//		
//		int arm=0;
//		
//		while(c!=0)
//		{
//			int mult=1;
//			rem=c%10;
//			for(int i=1;i<=length;i++)
//			{
//				mult=mult*rem;
//			}
//			arm=arm+mult;
//			c=c/10;
//		}
//		if(arm==a)
//		{
//			System.out.println(a+" is an armstrong number");
//		}
//		else
//		{
//			System.out.println(a+" is not an armstrong number");
//		}
//--------------------------------------------------------------
//Swap two numbers without using third veriable
//		int a=4,b=6;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("a="+a);
//		System.out.println("b="+b);
//-------------------------------------------------------------
//Swap two numbers using third veriable	
//		int a=4,b=6;
//		int c=a;
//		a=b;
//		b=c;
//		System.out.println("a="+a);
//		System.out.println("b="+b);
//-----------------------------------------------------------		
//Prime number
//		int a=18;
//		int b=0;
//		for(int i=2;i<a;i++)
//		{
//			if(a%i==0)
//			{
//				b=b+1;
//			}
//		}
//		if(b==0)
//		{
//			System.out.println(a+" is a prime number");
//		}
//		else
//		{
//			System.out.println(a+" is not a prime number");
//		}
//-------------------------------------------------------------
//Prime numbers between a and b
		int a=1,b=50;
		int c=0;
		System.out.println("Prime numbers between "+a+" and "+b+" are-");
		for(int i=a;i<=b;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
				c=c+1;	
				}
			}
			
			if(c==0)
			{
				System.out.println(i);
			}
			else
			{
				c=0;
			}
				}
			
		

		
	}			
}
