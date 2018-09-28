
public class A {
	static int x =5;
	
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		a1.x = 7;
		x = 9;
		System.out.println(x);
	}
}

/*
*Static Block
*-Used to initialize variables
*-Executed when class loaded in Memory
*/

class A{
	static int z = 5;
	static {
		z = 10;
		System.out.println(z);
	}
	public static void main(String[] args) {
		
	}
}



/*
 * ANONYMOUS Block
 * 1.Anon block are called when class Instantiated
 * 2.These block can Initialize non-static as well as static blocks
 * */

class A{
	static int x;
	int y;
	
	static {
		x=4;
		System.out.println(x);
	}
	
	{
		y = 7;
		System.out.println(y);
	}
	public static void main(String[] args) {
		new A();
	}
}

/*
 * Static Methods
 * 
 * 1.Method marked as static when we do not want method to be overridden
 * 2.However if subclass wants to use same methods it can do so marking itself static
 * 3.Both class have theit own copies as marked static*/

class A{
	int x = 5;
	static void display()
	{
		System.out.println("A");
	}		
}
class B extends A{
	int x = 6;
	static void display()
	{
		System.out.println("B");
	}
	public static void main(String[] args) {
		A a = new B();
		a.display();
		
	}
}











