import java.util.*;

class BigArrayElements {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size Of An Array : - ");
		int size = sc.nextInt();
		int list[] = new int[size];
		int big = list[0];
		
		System.out.println("Enter Elements Of An Array : - ");
		for(int i=0;i<size;i++)
			{
			 list[i] = sc.nextInt();
			}
			for(int j=1;j<size;j++)
			{
			 if(list[j]>big)
			   {
				 big = list[j];
			   }
			}
	        System.out.println("biggest number is::  "+big);
	}
}