
public class A {
	int x;
	
	void someX(int x) {
		
		x = this.x;
		
		this.x = this.x;
		
		this.x = x;
	}
}

class B{
	public static void main(String[] args) {
		A a = new A();
		a.someX(5);
		System.out.println(a.x);
	}
}