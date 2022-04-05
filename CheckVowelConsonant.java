import java.util.Scanner;

public class CheckVowelConsonant {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Character :- ");

		char c = ((sc.nextLine()).charAt(0));
		char ch = Character.toUpperCase(c);
		
		switch(ch) {
		
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(ch+" is a Vowel");
			break;
		default:
            System.out.println(ch + " is a Consonant");
		}
    }
}	