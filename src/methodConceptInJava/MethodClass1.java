package methodConceptInJava;

public class MethodClass1 {

	//Program for non return type static method without argument
	
	public static void additionMethod()
	{
		int a=21;
		int b=14;
		int c=a+b;
		System.out.println(c);
	}

	//Program for non return type static method with argument
	
	public static void Method1(char x)
	{
		int a=21;
		int b=14;
		int c=a+b;
		System.out.println(c);
	}
	
	//Program for return type static method without argument
	
	public static int method2()
	{
		System.out.println("return type static method");
		return 100;
	}
	
	//Program for return type static method with argument
	
		public static char method3(int i,int j )
		{
			int a=i,b=j;
			int c=a+b;
			System.out.println(c);
			return 'A';
		}
		
	public static void main(String[] args) {
		
		additionMethod();
		Method1('a');
		method2();
		int z=method2();
		System.out.println(z);
		method3(2,3);
		char initial=method3(2,3);
		System.out.println(initial);
		MethodClass1 Vaib=new MethodClass1();
		Vaib.method5(3);
	}
	
	//-----------------------------------------------------------
	//Non static method
	
	public void method4() 
	{
		System.out.println("Non static non return type without argument");
	}
	
	public void method5(int v)
	{
		System.out.println("Non static non return type with argument");
	}
	
	public int method6()
	{
		System.out.println("Non static return type without argument");
	    return 5;
	}
	
	public char method7(char x,int y)
	{
		System.out.println("Non static return type with argument");
	    return 'b';
	}
	
	
}
