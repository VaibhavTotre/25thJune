package constructorInJava;

public class ConstructorClass1 {

	int a;
	public ConstructorClass1()
	{
		a=7;
		System.out.println("This is ConstructorClass1");
	}
	public void method1()
	{
		System.out.println("This is non static method");
	}
	//Calling non static method
	public static void main(String[] args) 
	{
		ConstructorClass1 vaibhav =	new ConstructorClass1();
		vaibhav.method1();
	}
}
