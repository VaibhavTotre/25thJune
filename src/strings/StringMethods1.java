package strings;

public class StringMethods1 
{
 public static void main(String[] args) 
 {
//1) length method	 
  String a="Vaibhav";
  int length=a.length();
  System.out.println("length is "+length);
  //----------------------------------------------------------
//2) charAt method
  int index=2;
  char Char=a.charAt(index);
  System.out.println("Char at b = "+Char);
  //------------------------------------------------------------
//3) Concat method
  String Name=a.concat(" Totre");
  System.out.println("Name is = "+Name);
  //----------------------------------------------------------
//4) toUpperCase Method
  String upper=a.toUpperCase();
  System.out.println("Upper case is = "+upper);
  //------------------------------------------------------------
//5) toLowerCase method
  String Lower=upper.toLowerCase();
  System.out.println("Lower case is = "+Lower);
  //------------------------------------------------------------
//6) startsWith method
  String b= "Vaibhav Totre";
  boolean Result=b.startsWith("Vai");
  System.out.println("Result is = "+Result);
  //---------------------------------------------------------
//7) endsWith Method
  String c="e";
  boolean ends=b.endsWith(c);
  if(ends==true)
  {
	  System.out.println(b+" string ends with "+c);
  }
  else
  {
	  System.out.println(b+" string doesn't end with "+c); 
  }
  //---------------------------------------------------------
//8) equalsMethod
  String d="Vaibhav";
  System.out.println(a.equals(b));
  //----------------------------------------------------------
//9) equalsIgnoreCase method
  String e="VAIbhAv";
  System.out.println(a.equals(e));
  System.out.println(a.equalsIgnoreCase(e));
  //-------------------------------------------------------
//10) Substring mehtod
  String x="Vaibhav Bansi Totre";
  System.out.println(x.substring(7));
  System.out.println(x.substring(8,13));
  //-------------------------------------------------------
//11) trim Method
  String y="   Vaibhav    ";
  System.out.println(y.trim());
  //-------------------------------------------------------
//12) == operator
  String m=new String("Totre");
  String n=new String("Totre");
  System.out.println(m==n);
  System.out.println(a==d);
}
}
