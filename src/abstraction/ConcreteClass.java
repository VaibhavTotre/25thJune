package abstraction;

public class ConcreteClass extends AbstractClass
{
 public void method1()
 {
	 System.out.println("non static method-Child");
 }
 public void method2()
 {
	 System.out.println("Abstract non static method-Child");
 }
 public static void main(String[] args) 
 {
  StaticMethod();
  ConcreteClass x =new ConcreteClass();
  x.method1();
  x.Method1();
  x.method2();
 }
}
