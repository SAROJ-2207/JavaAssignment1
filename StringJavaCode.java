import java.util.*;
class StringTest
 {
  public static void main(String args[])
    {
		Scanner str1=new Scanner(System.in);
		Scanner str2=new Scanner(System.in);
		System.out.print("Enter the first String:- ");
		String st1=str1.nextLine();
		//System.out.println(st);
		System.out.print("Enter the Second String:- ");
		String st2=str2.nextLine();
		//System.out.println(st2);
		if(st1.equalsIgnoreCase(st2))
		   {
			System.out.println("Two strings are equal");
		    }
		else
		{
			System.out.println("Two Strings are not equal");
		}
	}

}
