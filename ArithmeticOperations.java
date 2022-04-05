import java.util.*;

public class ArithmeticOperations {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers : -");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int op1 = a + b * c;
		int op2 = c + a / b;
		int op3 = a % b + c;
		int op4 = a * b + c;
		
		 System.out.println("After the Operation :- "); 
		 System.out.println(a +" + "+ b +" * "+ c +" = "+ op1+" (Operation 1)");
		 System.out.println(a +" + "+ b +" / "+ c +" = "+ op2+" (Operation 2)");
		 System.out.println(a +" % "+ b +" + "+ c +" = "+ op3+" (Operation 3)");
		 System.out.println(a +" * "+ b +" + "+ c +" = "+ op4+" (Operation 4)") ;
		 
	}
}