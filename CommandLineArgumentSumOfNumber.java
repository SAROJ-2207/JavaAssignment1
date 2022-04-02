public class CommandLineArgumentSumOfNumber
 {
	public static void main (String args[])
		{
		  int num, count=0, sum=0;
			for(int i=0;i<args.length;i++)
				{
				try
					{
					num=Integer.parseInt(args[i]);
					sum= sum+num;
					}
			    catch (NumberFormatException e)
				   {
				   count++;
				   }
			    }
				 System.out.println("Sum of only valid integers is= "+sum) ;

				 System.out.println("Invalid integers are: "+count) ;
		}
  }