import java.util.*;

class SecondBigArrayElement {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size Of An Array : - ");
		int size = sc.nextInt();
		int list[] = new int[size];
		
		
		System.out.println("Enter Elements Of An Array : - ");
		for(int i=0;i<size;i++)
			{
			 list[i] = sc.nextInt();
			}
		 for(int i=0;i<size;i++)     
	        {
	            for(int j=i+1;j<size;j++)    
	            {
	                if(list[i]<list[j])     
	                {
	                    int temp=list[i];
	                    list[i]=list[j];
	                    list[j]=temp;
	                }
	            }
	        }
		 System.out.println("Second Largest element is "+list[1]);
	}
}