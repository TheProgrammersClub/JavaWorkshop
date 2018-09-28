class Outer { 
    Simple nested inner class 
   class Inner { 
      public void show() { 
           System.out.println("In a nested class method"); 
      } 
   } 
} 
class Main { 
   public static void main(String[] args) { 
	   Outer o = new Outer();
       Outer.Inner in = o.new Inner();    
       in.show(); 
       
       Outer.Inner in = new Outer().new Inner(); 
       in.show();
   } 
} 

class TestOuter{  
	
	static int data=30;  
	
	static class Inner{  
		void msg()
		{System.out.println("Data is "+data);}  
	}  
	
	public static void main(String args[]){  
		TestOuter.Inner obj=new TestOuter.Inner();  
		obj.msg();  
	}  
}  

public class Outerclass {
    instance method of the outer class 
   void my_Method() {
      int num = 23;

       method-local inner class
      class MethodInner_Demo {
         public void print() {
            System.out.println("This is method inner class "+num);	   
         }   
      }  end of inner class
	   
       Accessing the inner class
      MethodInner_Demo inner = new MethodInner_Demo();
      inner.print();
   }
   
   public static void main(String args[]) {
      Outerclass outer = new Outerclass();
      outer.my_Method();	
      
   }
}