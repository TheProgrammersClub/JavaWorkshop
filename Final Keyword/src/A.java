class A 
{
    final void m1() 
    {
        System.out.println("This is a final method.");
    }
}

class B extends A 
{
    void m1()
    { 
         COMPILE-ERROR! Can't override.
        System.out.println("Illegal!");
    }
}




final class A
{
      methods and fields
}
 The following class is illegal.
class B extends A 
{ 
     COMPILE-ERROR! Can't subclass A
}
