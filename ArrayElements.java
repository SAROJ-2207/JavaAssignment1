import java.util.*;

public class ArrayElements {

	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Size Of An Array :- ");
	int size = sc.nextInt();
	int list[]=new int[size];
	System.out.println("Enter The Elemens Of An Array :- ");
	for(int i = 0;i<=size-1;i++)
	   {
		list[i] = sc.nextInt();
       }
	for(int j = 0 ;j<size;j++)
	   {
		System.out.print(list[j]+" ");
	   }
	}
  }
