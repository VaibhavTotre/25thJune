package AssignmentsJava;

public class Pallindrome {
	 public static void main(String args[])
	  {
	    int a=123,rev=0;
	    int temp=a;
	    int rem;
	    while(temp!=0)
	     {
	       rem=temp%10;
	       rev=rev*10+rem;
	       temp=temp/10;
	     }
	   if(rev==a)
	     {
	       System.out.println(a+" is Pallindrome number");
	     }
	  else
	     {
	       System.out.println(a+" is not a Pallindrome number");
	     }
	  }
	
}
