import java.util.*;

import java.util.*;

class AscendingTest {
	void ascendindOrder (int size)
	{
		int list[] = new int[size];
		int temp,i,j;
		Scanner user_input = new Scanner(System.in);
		System.out.print("Enter The Elements Of An Array : - ");
		for( i = 0;i < size;i ++)
			{
			 list[i] = user_input.nextInt();
		}
			for(i=0;i<=size-2;i++)
			{
				for(j=i+1;j<=size-1;j++)
				{
					if(list[i] > list[j])
					{
						temp = list[i];
						list[i] = list[j];
						list[j] = temp;
					}
				}
			}
			for(i=0;i<=size-1;i++)
			{
			System.out.print(list[i]+" ");
			}
		}
	}
class AscendingArray {
	public static void main ( String args[]) {
	
	AscendingTest obj = new AscendingTest();
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Size Of An Array : - ");
	int size = sc.nextInt();
	obj.ascendindOrder(size); 
  }
 }
