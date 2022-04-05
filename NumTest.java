import java.util.*;

class NumTest
	{
	public static void main(String args[])
		{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter The number :- ");
		int num=obj.nextInt();
		if(num==1)
		{
		 System.out.println("Unit");
		}
		else if(num==10)
		{
		 System.out.println("Ten");
		}
		else if(num==100)
		{
		 System.out.println("Hundred");
		}
		else if(num==1000)
		{
		 System.out.println("Thousand");
		}
		   else
			{
			 System.out.println("Invalid Enter Please Try again...");
			}
	 }
	}