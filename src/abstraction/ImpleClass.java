package abstraction;

public class ImpleClass implements Interface1
{
 public void method1()
 {
	 System.out.println(a);
 }
 public void method2()
 {
	 System.out.println(a+2);
 }
 public static void method3(int b)
 {
	 
 }
 public static void main(String[] args) 
 {
	 ImpleClass x = new ImpleClass();
	 x.method1();
	 x.method2();
	 
}
}
