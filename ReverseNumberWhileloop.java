import java.util.Scanner;

public class ReverseNumberWhileloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number that you want to reverse:- ");
		int num=sc.nextInt();
		int reminder=0,rev=0;
	
			while(num>0)
			{
				reminder=num%10;
				rev=(rev*10)+reminder;
				num=num/10;
			}
			System.out.println("  The reverse of the given number is:- "+rev);
	}

}