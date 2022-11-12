package collectionsInJava;

import java.util.ArrayList;

public class Collections1 
{
  public static void main(String[] args) 
  {
	ArrayList a = new ArrayList();
	a.add(10);
	a.add(12);
	a.add(25);
	a.add('A');
	a.add("Vaibahv");
	
	//all data print simply print a
	System.out.println(a);
	
	//for printing specific data
	System.out.println(a.get(1));
	//System.out.println(a.get(2) + a.get(1));
	
	//replace any element
	a.set(0, 20);
	System.out.println(a);
	
	//total size
	System.out.println("Total size = "+ a.size());
	
	//remove specific data
	a.remove(3);
	System.out.println("Size after removing = "+ a.size());
}
}
