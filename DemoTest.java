class DemoTest
  {
   static int x=20;
   static int y;
   static int z;
   static void method(int z)
	   {
		System.out.println("x := "+x);
		System.out.println("y := "+y);
		System.out.println("z := "+z);
	   }
  static 
		{
		System.out.println("Static Block :="+(y=x+5));
		}
  public static void main(String args[])
	{
	  DemoTest obj=new DemoTest();
	  obj.method(10);
	}
}
  