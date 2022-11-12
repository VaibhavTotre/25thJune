package abstraction;

public abstract class AbstractClass 
{
 public static void StaticMethod()
 {
	 System.out.println("Static method");
 }
 public void Method1()
 {
	 System.out.println("non static method");
 }
 public abstract void method2();
 public static void main(String[] args) 
 {
	StaticMethod();
//	AbstractClass x =new AbstractClass();
//	x.method1;
 }
 
}
