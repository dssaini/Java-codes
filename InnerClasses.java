/*
 * It is a non-static class that is defined at the member level of a class. 
 * It has access to all the members of the outer class, including private members.
 * how to acccess that object of that innerClass  OuterClass.InnerClass  obj = new outerClass().new innerClass();
 * Encapsulation: Inner classes can be used to encapsulate implementation details of a class, making the code more modular and maintainable.
 * Access Control: Inner classes can access private members of the outer class, allowing for more precise control over the visibility of members.
 * Callbacks and Event Handlers: Inner classes can be used to implement callbacks and event handlers, making it easier to handle events in graphical user interfaces.
 * Code Organization: Inner classes can be used to organize code by grouping related classes together.
 */
class Outer {

	class Inner {

		// show() method of inner class
		public void show()
		{
			System.out.println("In a nested class method");
		}
	}
}

class Main {

	public static void main(String[] args)
	{
		Outer.Inner in = new Outer().new Inner();
		in.show();
	}
}
