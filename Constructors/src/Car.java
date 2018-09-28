public class Car 
{
    String carColor;
    Car(String carColor)
    {
        this.carColor = carColor;
    }
    
    public void disp()
    {
        System.out.println("Color of the Car is : "+carColor);
    }
    public static void main(String args[])
    {
        Calling the parameterized constructor
        Car c = new Car("Blue");
        c.disp();
    }
}

public class Car 
{
    String carColor;
    Car()
    {
        System.out.println("No argument Constructor of Car class called");
    }
    
    Car(String carColor)
    {
        this.carColor = carColor;
    }
    
    public void disp()
    {
        System.out.println("Color of the Car is : "+carColor);
    }
    public static void main(String args[])
    {
        Calling the No argument constructor
        Car c1 = new Car();
        
        Calling the parameterized constructor
        Car c2 = new Car("Blue");
        c2.disp();
    }
}