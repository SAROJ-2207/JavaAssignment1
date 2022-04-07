import java.util.*;

class SmallArrayElements {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size Of An Array : - ");
		int size = sc.nextInt();
		int list[] = new int[size];
		//int small = list[0];
		int temp;
		
		System.out.println("Enter Elements Of An Array : - ");
		for(int i=0;i<size;i++)
			{
			 list[i] = sc.nextInt();
			}
			for(int j=i+1;j<size;j++)
			{
			 if(list[i]>list[j])
			   {
				 temp = list[i];
				 list[i] = list[j];
				 list[j] = temp;
			   }
			}
	        System.out.println("Smallest Elements is::  "+list[j]);
	}
}