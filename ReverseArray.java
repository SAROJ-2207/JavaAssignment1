import java.util.*;

class ReverseArray {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size Of An Array : - ");
		int size = sc.nextInt();
		int list[] = new int[size];
		
		System.out.print("Enter The Elements Of An Array : - ");
		for(int i = 0;i < size;i ++)
			{
			 list[i] = sc.nextInt();
			}
			for(int j = size-1;j >=0 ;j--)
			{
				System.out.print(" "+list[j]);
			}		
	}
}