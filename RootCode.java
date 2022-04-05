import java.util.Scanner;

public class RootCode {
	public static void main(String args[]) {
	
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value for a b and c :- ");
		double a = obj.nextDouble();
		double b = obj.nextDouble();
		double c = obj.nextDouble();
		
		double delta = b*b-4*a*c;
		double root1  = (-b + Math.sqrt(delta))/(2*a);
		double root2  = (-b - Math.sqrt(delta))/(2*a);
		
		System.out.println("The Roots are : - "+root1+"\n "+root2);
		
	}
}