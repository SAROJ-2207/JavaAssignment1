import java.util.*;

class SumOfNumberWhileLoop
{
public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter Any Number : - ");
   int num=sc.nextInt();
   int i=1;
   int sum=0;
	while(i<=num)
    {
	 sum=sum+i;
	 i++;
	 }
	 System.out.println("Sum Of The number is : - "+sum);
	 }   
  }


