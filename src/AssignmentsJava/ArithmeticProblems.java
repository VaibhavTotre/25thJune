package AssignmentsJava;

public class ArithmeticProblems {

public static void main(String[] args) {
	//eg 1) To find largest of two numbers
	int a=12;
	int b=15;		
//	if(a>b)
//	{System.out.println(a +" is greater than" +b );
//	}
//	else
//	{System.out.println(b +" is greater than "+ a);
//	}
//	System.out.println();
//	//---------------------------------------------------------
//	//eg 2) Largest of three numbers
//	int c=13;
//	if(a>b&&a>c)
//	{	System.out.println(a+" is greater");}
//	else if(b>c&&b>a)
//	{System.out.println(b+" is greater");
//	}
//	else
//	{System.out.println(c+ " is greater");
//	}
//	System.out.println();
//	//---------------------------------------------------------
////	eg 3)Smallest of three numbers
//	if(a<b&&a<c)
//		{System.out.println(a+ " is smaller");
//		if(b<c&&b<a)
//		{System.out.println(b+" is smaller");}
//		}
//	else
//	{System.out.println(c+" is smaller");
//		}
//	System.out.println();
//	//------------------------------------------------------------
//	//eg 4)To check whether number is positive or negative
//	int d= 0;
//	if(d>0)
//	{System.out.println(d+" is positive");}
//	else if(d<0)
//		{System.out.println(d+" is negative");}
//		else
//		{System.out.println(d+" is zero");		
//		}
//	System.out.println();
//	//----------------------------------------------------------
//	//eg 5)
//	int e=24;
//	if(e%2==0)
//	{System.out.println(e+" is even");
//	}
//	else
//	{System.out.println(e+" is odd");
//	}
//	System.out.println();
//	//-----------------------------------------------------------
//	//eg 6)Display even numbers between 1 and 30
//	System.out.println("Even numbers between 1 and 30 are ");
//	for(int i=1;i<=30;i++)
//		
//		{if(i%2==0)
//		{System.out.println(i);}
//	}
//	System.out.println();
//	//-----------------------------------------------------------
//	//eg 7)Odd numbers between 1 and 30
//	System.out.println("Odd numbers between 1 and 30 are ");
//	for(int i=1;i<=30;i++)
//	{
//	if(i%2!=0)
//		{System.out.println(i);}
//	}
//	System.out.println();
//	//-------------------------------------------------------------
//	//eg 8)Sum of first 10 natural numbers
//	int sum=0;   //Assume
//	for(int x=1;x<=10;x++)
//	{sum=sum+x;
//	
//	}
//	System.out.println("sum is "+sum);
//	System.out.println();
//	//------------------------------------------------------------
//	//eg 9)Multiplication of first 10 natural numbers
//	int multiplication=1;
//	for(int y=1;y<=10;y++)
//	{multiplication=multiplication*y;}
//	System.out.println("Multiplication is "+multiplication);
//	System.out.println();
//	//-------------------------------------------------------------
//	//eg 10)To swap two numbers(Without using third variable)
//	int n1=7;
//	int n2=18;
//	n1=n1+n2;
//	n2=n1-n2;
//	n1=n1-n2;
//	System.out.println("n1-"+n1);
//	System.out.println("n2-"+n2);
//	System.out.println();
//	//------------------------------------------------------------
//	//eg 11)To swap two numbers(using third veriable)
//	int z=47;
//	int q=34;
//	int n3=z;
//	z=q;
//	q=n3;
//	System.out.println("z-"+z);
//	System.out.println("q-"+q);
//	System.out.println();
//	//------------------------------------------------------------
//	//eg 12)Reversing the number
//	int i=2345;
//	int reverse=0;
//	while(i!=0)
//	{int remainder=i%10;
//	reverse=reverse*10+remainder;
//	i=i/10;
//	}
//	System.out.println("Reverse is - "+reverse);
//	System.out.println();
//	//-----------------------------------------------------------
//	//eg 13)To check palindrome number in Java
	int v=1771;
	int s=v;
	int rev=0;
	while(s!=0)
	{int rem=s%10;
	rev=rev*10+rem;
	s=s/10;
	}
	if(v==rev)
	{System.out.println(v+" is a palindrome");
	
	}
	else
		{System.out.println(v+" is not a palindrome");
		}
	System.out.println();
//	//------------------------------------------------------------
//	//eg 14)To check whether the number is prime or not
//	int p=29;
//	int p1=p; 
//	int no=0;
//	for(int g=2;g<=p-1;g++)
//	{if(p1%g==0)
//	{ no =no+1;
//	}}
//		if (no>0)
//		{System.out.println(p+" is not a prime number");
//		}
//		else
//		{System.out.println(p+" is a prime number");
//		}
//	System.out.println();
//	//--------------------------------------------------------------
//	//eg 15)list the prime numbers between 1 and 50
//	System.out.println("Prime numbers between 1 and 50 are - ");
//	int h=0;
//	for(int a1=1;a1<=50;a1++)
//	{for(int a2=2;a2<=a1-1;a2++)
//	{if(a1%a2==0)
//	{h=h+1;}}
//		if(h==0)
//		{System.out.println(a1);}
//		else
//		{h=0;}
//		}
//	System.out.println();
//	//-------------------------------------------------------------
//	//eg 16)Fibonacci series upto 10 numbers
//	int i1=0,i2=1;
//	System.out.print(i1+" "+i2);
//	for(int t=1;t<=10;t++)
//	{int i3=i1+i2;
//	System.out.print(" "+i3);
//	    i1=i2;
//	    i2=i3;
//	
//	}
//	System.out.println();
//	System.out.println();
//	//------------------------------------------------------------
//	//eg 17)Check whether the number is an Armstrong no. or not
//	int m=153;
//	int m1=m;
//	int length=0;
//	while(m1!=0)
//	{m1=m1/10;
//	length=length+1;}
//	
//	int m2=m;
//	int rem;
//		int arm=0;
//	while(m2!=0)
//	{rem=m2%10;
//	int mult=1;
//
//	{for(int n=1;n<=length;n++)
//			mult=mult*rem;
//	}
//	arm=arm+mult;
//	m2=m2/10;
//	}
//	if(arm==m)
//	{System.out.println(m+" is an Armstrong number");
//	}
//	else
//	{System.out.println(m+" is not an Armstrong number");
//		}
//	System.out.println();
//	//-----------------------------------------------------------
//	//eg 18)To check whether the year is a leap year or not
//	int year=2020;
//	if(year%400==0 || (year%4==0 && year%100!=0))
//	{System.out.println("The year "+year+" is a leap year");
//	}
//	else
//	{System.out.println("The year "+year+" is not a leap year");
//	}
//----------------------------------------------------------
	//eg 19)ASCII Value print
//	char a='a';
//	int b=a;
//	System.out.println("ASCII value of "+a+ " is "+b);
//	
	//------------------------------------------------------
	//eg 20)Factorial of the number
//	int i=10;
//	//10!=10*9*8*...*3*2*1
//	int fact=1;
//	for(int a=i;a>=1;a--)
//	{
//		fact=fact*a;
//	}
//	System.out.println("10! is "+fact);
	//-------------------------------------------------------
	//eg 20)GCD of two numbers
//	int a=12;
//	int b=18;
//	int c; 
//	int gcd=0;
//	if (a<b)
//	{
//		c=a;
//	}
//	else
//	{
//		c=b;
//	}
//	for(int i=2;i<=c;i++)
//	{
//		if(a%i==0 && b%i==0)
//		{
//			gcd=i;
//		}
//	}
//		System.out.println("GCD of a and b is "+ gcd);
//	------------------------------------------------------
	
	//eg 21)Squre root of number
//	double numb=625;
//	double sr=numb/2;
//	double temp;
//	do
//	{
//		temp=sr;
//		sr=(temp+(numb/temp))/2;
//	}
//	while((temp-sr)!=0);
//	System.out.println("Square root of "+numb+" is "+sr);
//	
//	
	
	
	
}
}
