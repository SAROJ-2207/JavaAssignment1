import java.util.*;

class PalindromeNumber
 {
	public static void main(String args[])
		{
		 Scanner obj = new Scanner(System.in);
		 System.out.print("Enter Any Number :- ");
		 int num = obj.nextInt();
		 int i,rem=0,rev=0;
		 for(i=num;i!=0;i=i/10)
		   {
		   rem=i%10;
		   rev=rev*10+rem;
		   }
		if (num==rev)
		 System.out.println(num+" This is Palindrome Number");
		else
		 System.out.println(num+" This is Not A Palindrom Number");
		}
}	
		 