/* 
Local Inner Class: It is a class that is defined inside a method or a block of code. 
It has access to the final variables of the method or block in which it is defined. (Jdk_7 )

how to access object of  that class.  inside that method  innerClass obj = new innerClass();
*/ 

class Outer {

    int y=90;
    int x=85;
	// Method inside outer class
	void outerMethod()
	{
         int x=98;
		// Print statement
		System.out.println("inside outerMethod");

		// Class 2
		// Inner class
		// It is local to outerMethod()
		class Inner {

			// Method defined inside inner class
			void innerMethod()
			{
				// Print statement whenever inner class is
				// called
				System.out.println("inside innerMethod");
				System.out.println("x="+x);
				System.out.println("x="+x);
				System.out.println("y="+y);
			}
		}

		// Creating object of inner class
		Inner y = new Inner();

		// Calling over method defined inside it
		y.innerMethod();
        
	}
}

// Class 3
// Main class
public class LocalInnerClasses {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating object of outer class inside main()
		// method
		 Outer x = new Outer();

		// Calling over the same method
		// as we did for inner class above
         x.outerMethod();
        
	}
}


/*
class Outer {
void outerMethod() {
	int x = 98;
    
	System.out.println("inside outerMethod");
	class Inner {
		void innerMethod() {
			System.out.println("x= "+x);
		}
	}
	Inner y = new Inner();
	y.innerMethod();
}
}
class MethodLocalVariableDemo {
public static void main(String[] args) {
	Outer x=new Outer();
	x.outerMethod();
}
}
*/
