import java.util.*;
class LeapYear
{
  public static void main(String []args)
   {
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter a Year:- ");
	int year=obj.nextInt();
		if(year<=1582)
			{
			 System.out.println(year+" :- Please Enter Valid Year");
			}
		else if((year%4==0 && year%100!=0) || (year%400==0))
           {
	        System.out.println( year+" :- This is a Leap Year");
           }
		else
		    {
			 System.out.println(year+" :- This is not a leap Year");
		    }
    }
}
