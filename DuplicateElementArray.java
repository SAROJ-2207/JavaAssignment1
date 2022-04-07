import java.util.*;

class DuplicateElementArray {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size Of An Array : - ");
		int size = sc.nextInt();
		int list[] = new int[size];
		int temp[] = new int[list.length];
		int count=0;
		System.out.print("Enter The Elements Of An Array : - ");
		for(int i = 0;i < size;i ++)
			{
			 list[i] = sc.nextInt();
			}
		for(int j = 0;j < size-2;j ++)
			{
			 
				for(int k = j+1;k <=size-2;k ++)
				{
					if(list[j]==list[k])
					{
					 temp[count]=list[j];
					 count++;
					}
				}
			}
				
				for(int x = 0;x<temp.length-1;x++)
				{
					System.out.print(temp[x]+" ");
				}
        }
  }
