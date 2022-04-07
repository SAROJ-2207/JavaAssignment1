import java.util.*;

public class EvenPositionArray {
		public static void main (String args[]) {
		
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the Size Of An Array : - ");
			int size = sc.nextInt();
			int list[] = new int[size];
			int temp[] = new int[list.length];
			int pos=0,i;
			System.out.print("Enter "+size+" Elements Of An Array : - ");
			for( i = 0;i < size;i ++)
				{
				 list[i] = sc.nextInt();
			     }
			System.out.print("Even Position Value : - ");
				for( int j=1;j<=size;j+=2)
				{
					
						System.out.print(list[j]+" ");
					
				}
		}
}