package AssignmentsJava;

public class NestedForLoop {

	public static void main(String[] args) 
	
	{
		{//eg. 1)WTP to print days of 3 weeks
			String day[]= {"Sunday","Monday","Tuesday","Wednesday",
					"Thursday","Friday","Saturday"};
		for(int i=1;i<=3;i++)
		{System.out.println("Week "+i);
		for (int j=0;j<day.length;j++)
			
		{System.out.println(day[j]);}
		}
	
		//eg. 2)WTP to print postman work
		for(int a=1;a<=3;a++)
		{System.out.println("Society No."+a);
		for(int b=1;b<=4;b++)
		System.out.println("Flat No. "+b);
		}
		}
	}
}
