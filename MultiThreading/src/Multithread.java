 Java code for thread creation by extending 
 the Thread class 
class MultithreadingDemo extends Thread 
{ 
    public void run() 
    { 
        try
        { 
             Displaying the thread that is running 
            System.out.println ("Thread " + 
                  Thread.currentThread().getId() + 
                  " is running"); 
  
        } 
        catch (Exception e) 
        { 
             Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 
  
 Main Class 
public class Multithread 
{ 
    public static void main(String[] args) 
    { 
        int i = 8;  Number of threads 
        for (i=0; i<8; i++) 
        { 
            MultithreadingDemo object = new MultithreadingDemo(); 
            object.start(); 
        } 
    } 
} 


class MultithreadingDemo implements Runnable 
{ 
    public void run() 
    { 
        try
        { 
             Displaying the thread that is running 
            System.out.println ("Thread " + 
                                Thread.currentThread().getId() + 
                                " is running"); 
  
        } 
        catch (Exception e) 
        { 
             Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 
 Main Class 
class Multithread 
{ 
    public static void main(String[] args) 
    { 
        int n = 8;  Number of threads 
        for (int i=0; i<8; i++) 
        { 
            Thread object = new Thread(new MultithreadingDemo()); 
            object.start(); 
        } 
    } 
} 

/*
 * ANON WAY*/

class A{
	public static void main(String[] args) {
		Thread t1 = new Thread("A")
		{
			public void run()
			{
				System.out.println(Thread.currentThread().getName());
			}
		};
		
		Thread t2 = new Thread("B")
		{
			public void run()
			{
				System.out.println(Thread.currentThread().getName());
			}
		};
		t1.start();
		t2.start();
	}
}

class A{
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				
			}
		};
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		Thread t4 = new Thread(r);
		Thread t5 = new Thread(r);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}


class A{
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				 TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName());
			}
		}).start();
	}
}

