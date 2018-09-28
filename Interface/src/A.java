Interface declaration: by first user  
interface Drawable{  
	void draw();  
}  
Implementation: by second user  
class Rectangle implements Drawable{  
	public void draw(){System.out.println("drawing rectangle");}  
}  
class Circle implements Drawable{  
	public void draw(){System.out.println("drawing circle");}  
}  
Using interface: by third user  
class TestInterface1{  
	public static void main(String args[]){  
		Drawable d=new Circle();In real scenario, object is provided by method e.g. getDrawable()  
		d.draw();  
	}}  

interface A{  
	void a();  
	void b();  
	void c();  
	void d();  
}  

abstract class B implements A{  
	public void c(){System.out.println("I am c");}  
}  

class M extends B{  
	public void a(){System.out.println("I am a");}  
	public void b(){System.out.println("I am b");}  
	public void d(){System.out.println("I am d");}  
}  

class Test5{  
	public static void main(String args[]){  
		A a=new M();  
		a.a();  
		a.b();  
		a.c();  
		a.d();  
	}}  