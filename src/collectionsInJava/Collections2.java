package collectionsInJava;

import java.util.ArrayList;

public class Collections2 
{
  public static void main(String[] args) 
  {
	ArrayList a = new ArrayList();
	
	//for only integers
	ArrayList <Integer> b = new ArrayList <Integer>();
	
	//For Strings data
	ArrayList<String> c = new ArrayList<String>();
	
	//1)add method
	c.add("Vaibhav");
	c.add("Totre");
	c.add("Kurvandi");
	
	//2)Print all data
	System.out.println(c);
	
	//3)Print specific
	System.out.println(c.get(0));
	System.out.println(c.get(0)+ c.get(1));
	
	//4)Replace any element
	    c.set(1, "Bansi");
	    c.set(2, "Totre");
	    System.out.println(c);
	    
	//5)Total size
	System.out.println("Total size of c is "+c.size());    
	
	
}
}
