import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number that you want to reverse:- ");
		int num=sc.nextInt();
		int reminder=0,rev=0;
	
			for(int i=num;i!=0;i=i/10)
			{
				reminder=i%10;
				rev=(rev*10)+reminder;
			}
			System.out.println(num+"  The reverse of the given number is:- "+rev);
	}

}