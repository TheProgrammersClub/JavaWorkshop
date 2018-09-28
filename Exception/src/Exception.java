
class JavaException {
	public static void main(String args[]) {
		int d = 0;
		int n = 20;
		int fraction = n / d;
		try {
			int fraction = n / d;
			System.out.println("This line will not be Executed");
		} catch (ArithmeticException e) {
			System.out.println("In the catch Block due to Exception = " + e);
		}
		finally {
			System.out.println("This will definately execute");
		}
		System.out.println("End Of Main");
	}
}


/*
 * Two ways to throw an exception
 * 1. Write code that throws an Exception
 * 2.Manual Throw
 */

class Exception extends Throwable{
	public static void main(String[] args) throws Exception {
		try {
			throw new Exception();
		} finally {
			 TODO: handle finally clause
			System.out.println("Manual Throw");
		}
	}
}

class Exception extends Throwable{
	public static void main(String[] args) throws Throwable {
		try {
			
			throw new NullPointerException();
		} finally {
			 TODO: handle finally clause
			System.out.println("Manual Throw");
		}
	}
}

/*
 * Explain here both Checked and Unchecked*/

class Exception{
	public static void main(String[] args){
		System.out.println("Welcome");
		try {
			throw new IOException();
		} catch (IOException e) {
			System.out.println("Here");
			e.printStackTrace();
		}
	}	
}

/*
 *Explain Assertion Here in Exception */

 import java.util.Scanner;  
    
class AssertionExample{  
 public static void main( String args[] ){  
  
  Scanner scanner = new Scanner( System.in );  
  System.out.print("Enter ur age ");  
    
  int value = scanner.nextInt();  
  assert value>=18:" Not Valid";  
  
  System.out.println("value is "+value);  
 }   
}  
