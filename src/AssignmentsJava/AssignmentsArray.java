package AssignmentsJava;

public class AssignmentsArray {
	
public static void main(String[]args) {

//	//eg 1)Method to print elements of an array
//	int a[]= {10,20,30,40,50};
//	//       i[0],i[1],i[2],i[3]'i[4]
//	for(int i=0;i<a.length;i++)
//	{
//		System.out.print(a[i]+" ");
//	}
//---------------------------------------------------------
//	//eg 2)Method to print elements of an array in reverse order
//		int a[]= {10,20,30,40,50};
//		//       i[0],i[1],i[2],i[3]'i[4]
//		for(int i=(a.length-1);i>=0;i--)
//		{
//			System.out.print(a[i]+" ");
//		}
	//---------------------------------------------------------
		
////	eg 3)Program to print maximum number from array
//	int i[]={10,20,30,40,50};
//	int max=i[0];
//	for(int a=0;a<i.length;a++)
//	{if(i[a]>max)
//	{max=i[a];
//	}
//	}
//	System.out.println("Maximum number of array i[] is " +max);
	//----------------------------------------------------------
	
////	eg 4)2)Program to print smallest number from array
//	int a[]={10,20,30,40,50};
//	int min=a[2];
//	for(int i=0;i<a.length;i++)
//	{
//		if(a[i]<min)
//		{min =a[i];
//		
//		}
//	}
//	System.out.println("Smallest number of array is "+min);
	//--------------------------------------------------------------
	
	//eg 5)prgram to copy elements of one array into other
//	int a[]= {10,20,30,40,50};
//	int b[]= new int[5];
//	for(int i=0;i<a.length;i++)
//	{
//	  b[i]=a[i];	
//	
//	System.out.print(" "+b[i]);
//	}
	//---------------------------------------------------
	
	
	//eg 6) even
	
//	int a[]= {10,20,11,17,19,30,40,50};
//
//	for(int i=0;i<a.length;i++)
//	{if(a[i]%2==0)
//	{System.out.println(a[i]+" is even");
//	}
	//--------------------------------------------------------
//eg 7) odd
//	
//	int a[]= {10,20,11,17,19,30,40,50};
//
//	for(int i=0;i<a.length;i++)
//	{if(a[i]%2!=0)
//	{System.out.println(a[i]+" is odd");
//	}
//	}
	//--------------------------------------------------------
	
	//eg 8)Ascending order of arrray
//	int a[]= {10,20,11,17,19,30,40,50};
//	for(int i=0;i<a.length;i++)
//	{ int temp=0;
//	   for(int j=i+1;j<a.length;j++)
//	   {if(a[j]<a[i])
//			   {
//	   temp=a[i];
//	   a[i]=a[j];
//	   a[j]=temp;}
//	   
//	   }}
//	for(int i=0;i<a.length;i++)
//	{System.out.print(a[i]+" ");
//	}
	//--------------------------------------------------------
	
	//eg 9)Descending order of array
//	int []a= {2,5,1,3,12,7,45,10};
//	int temp;
//	for(int i=0;i<a.length;i++)
//	{
//		for(int j=i+1;j<a.length;j++)
//	{
//			if(a[i]<a[j])
//			{temp=a[i];
//			 a[i]=a[j];
//			 a[j]=temp;
//			}}}
//	   for(int i=0;i<a.length;i++)
//	   {
//		   System.out.print(" "+a[i]);
//	}
	//-------------------------------------------------------
	
	//eg 10)To find second largest number in array
//	int []a= {12,23,11,99,25,37,5};
//	 int temp;
//	for(int i=0;i<a.length;i++)
//	{
//	 for(int j=i+1;j<a.length;j++)
//	 {
//		 if(a[j]>a[i])
//		 {
//			 temp=a[i];
//			 a[i]=a[j];
//			 a[j]=temp;
//		 }
//		 
//	 }
//	}
//
//	System.out.println("Second maximum number is "+a[1]);
//-------------------------------------------------------------
//	//eg 11)Print smallest number of array
//	int a[]= {58,43,32,23,56,98,12};
//	int min=a[2];
//	for(int i=0;i<a.length;i++)
//	{
//		if(a[i]<min)
//		{
//			min=a[i];
//		}
//	}
//	System.out.println("smallest number is "+min);
	//---------------------------------------------------------
	//eg 12)To print second smallest number
//	int a[]= {58,43,32,23,11,56,98,12};
//	for(int i=0;i<a.length;i++)
//	{
//		int temp;
//		for(int j=i+1;j<a.length;j++)
//		{
//			if(a[j]<a[i])
//			{
//				temp=a[i];
//				a[i]=a[j];
//				a[j]=temp;
//			}
//		}
//	}
//	System.out.println("second smallest number is "+a[1]);
//	
	//-----------------------------------------------------------
	//eg 13) Program to print duplicate elements of the array
//	int a[]= {2,4,5,8,8,4,2,9};
//	System.out.println("Duplicate elements are ");
//	for(int i=0;i<a.length;i++)
//	{
//		for(int j=i+1;j<a.length;j++)
//		{
//			if(a[i]==a[j])
//			{System.out.println(a[i]);
//				
//			}
//		}
//	}
}
}