package AssignmentsJava;

public class ForLoopStatement {
public static void main(String[] args) {
	//eg.1) wtp to print no. from 1 to 5
	for(int i=1;i<=5;i++)
		{System.out.println(i);}

//eg 2)wtp to print no. from 5 to 1
	
	for(int a=5;a>=1;a--)
		{System.out.println(a);}
	
	//eg.3)write a printing statement 4 times
	for(int x=1;x<=4;x++)
{
		System.out.println("repeated");
}

	//eg.4)wtp to print alternate no. from 1 to 7
	for(int c=1;c<=7;c=c+2)
		{
		System.out.println(c);
		}
	
//	eg. 5) A to Z print
	for(char d='A';d<='Z';d++)
		{
		System.out.println(d);
		}
	
	//eg. 6)double value print
	for(double e=1.0;e<=6.0;e=e+0.5)
		{
		System.out.println(e);
		}
	
	//eg.7) float value print
	for(float f=20.20f;f>=19.20f;f=f-0.2f)
		{
		System.out.println(f);
		}
	
	//eg. 8)wtp to print alternate no. from 2 to 24
	for(int v=2;v<=24;v=v+2)
		{
		System.out.println(v);
		}
}
}
