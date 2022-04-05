import java.util.*;

class SumOfNumber
{
public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter Any Number : - ");
   int num=sc.nextInt();
   int sum=0;
  if (num<=9 || num>0) {
   for(int i=0;i<=num;i++)
	 {
	  sum=sum+i;
	 }
	System.out.println("Sum Of The Number is :- "+sum);
  }
   else if (num>=10)
   {
	for(int i=num;i>=0;i++)
    {
	 sum=sum+num%10;
	 num=num/10;
	 }
	 System.out.println("Sum Of The number is : - "+sum);
	 }   
  }
}

