 Java code illustrating add() method 
import java.util.*; 
class Vecnew     
{ 
    public static void main(String[] arg) 
    { 
         
         create default vector 
        Vector v = new Vector(); 
         
          
        v.add(1); 
        v.add(2); 
        v.add("abc"); 
        v.add("xyz"); 
        v.add(3); 
         
        System.out.println("Vector is " + v); 
                
    } 
}