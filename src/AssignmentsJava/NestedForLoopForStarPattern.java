package AssignmentsJava;

public class NestedForLoopForStarPattern {
	
	public static void main(String[] args) {
//	//1)
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{System.out.print("*");
//			
//			}
//			System.out.println( );
//		}
//		//-------------------------------------------------
//	//2)
//		for(int a=1;a<=4;a++)
//		{
//			for(int b=4;b>=a;b--)
//			{System.out.print("*");
//				
//			}
//	System.out.println( );
//		}
//		//-------------------------------------------------
//    //3)
//		for(int c=1;c<=5;c++)
//		{for(int d=4;d>=c;d--)
//			{System.out.print(" ");
//		}
//		for(int e=1;e<=c;e++) {
//			System.out.print("*");
//			}
//		System.out.println(" ");
//	}
//		//-------------------------------------------------
//		//4)
//		for(int f=1;f<=4;f++)
//		{for(int g=1;g<=f;g++)
//		{System.out.print(" ");
//		}
//		for(int h=4;h>=f;h--)
//		{System.out.print("*");
//		}System.out.println();
//		}
//		//-------------------------------------------------
//		System.out.println();
//		//5)
//		for(int k=1;k<=5;k++)
//		{for(int l=1;l<=5;l++)
//			{System.out.print("*");
//		}
//		System.out.println(" ");
//	}
////		//-------------------------------------------------------
//		System.out.println();
//		6)
//		for(int m=1;m<=5;m++)
//		{for(int n=4;n>=m;n--)
//			{System.out.print(" ");
//		}
//		for(int o=1;o<=m;o++)
//			{System.out.print("*");
//			}
//		for(int p=4;p>=m;p--)
//		{System.out.print(" ");}
//		for(int q=1;q<m;q++)
//		{System.out.print("*");
//		}
//		
//		System.out.println();}
		
		//--------------------------------------------------------
		//7)
		for(int i=1;i<=5;i++)
		{	for(int k=1;k<i;k++)
			{System.out.print(" ");
			}
		for(int j=5;j>=i;j--)
		{System.out.print("*");
		}
		for(int l=4;l>=i;l--)
		{System.out.print("*");
		
		}
		System.out.println();
	}
}}