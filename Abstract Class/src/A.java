
Example of an abstract class that has abstract and non-abstract methods  
abstract class Bike{  
	Bike(){System.out.println("bike is created");}  
	abstract void run();  
	void changeGear(){System.out.println("gear changed");}  
}  

Creating a Child class which inherits Abstract class  
class Honda extends Bike{  
	void run(){System.out.println("running safely..");}  
}  

Creating a Test class which calls abstract and non-abstract methods  
class TestAbstraction2{  
	public static void main(String args[]){  
		Bike obj = new Honda();  
		obj.run();  
		obj.changeGear();  
	}  			
}

abstract class Shape{  
	abstract void draw();  
}  

In real scenario, implementation is provided by others i.e. unknown by end user  
class Rectangle extends Shape{  
	void draw(){System.out.println("drawing rectangle");}  
}  

class Circle1 extends Shape{  
	void draw(){System.out.println("drawing circle");}  
}  

In real scenario, method is called by programmer or user  
class TestAbstraction1{  
	public static void main(String args[]){  
		Shape s=new Circle1();In a real scenario, object is provided through method, e.g., getShape() method  
		s.draw();  
	}  
}

