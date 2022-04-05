import java.util.Scanner;

class EucDistance {

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of X :- ");
		double x = sc.nextDouble();
		System.out.println("Enter the Value of Y :- ");
		double y = sc.nextDouble();
		double distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		System.out.println("Distance From the Point :- "+distance);
		}
	}
	