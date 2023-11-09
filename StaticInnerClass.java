/*
 * It is a static class that is defined inside another class. 
 * It does not have access to the non-static members of the outer class.
 */

class StaticInnerClass {
	public static void main(String args[])
	{
		OuterClass.InnerClass.display();
        OuterClass.obj.println("I am Deepak Saini");
	}
}

 class A{
    void println(String s)
    {
        System.out.println(s);
    }
}

class OuterClass {
    static A obj= new A();
	private static void outerMethod()
	{
		System.out.println("inside outerMethod");
	}

	static class InnerClass {

		public static void display()
		{
			System.out.println("inside inner class Method");
			outerMethod();
		}
	}
}


