package strings;

public class StringPrograms 
{
 public static void main(String[] args) 
 {
	String a=" Vaibhav Totre ";
	System.out.println(a.toUpperCase());
	System.out.println(a.toLowerCase());
	System.out.println(a.length());
	System.out.println(a.trim());
	System.out.println(a.replace(' ','_'));
	
	for(int i=a.length()-1;i>=0;i--)
	{
		char b=a.charAt(i);
		System.out.print(b);
	}
	//vowels
	
//	for(int j=0;j<a.length();j++)
//	{
//		char d=a.charAt(j);
//		
//		if(d==char 'a'|| d==char 'e')
//		{
//			System.out.println(d+" is a vowel");
//		}
//		else
//		{
//			System.out.println(d+" is a consonant");
//		}
//	}
//	
 }
}
