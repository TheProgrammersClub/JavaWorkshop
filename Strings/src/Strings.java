Java Program to demonstrate the use of StringBuffer class.  

public class Strings{  
    
	public static void main(String[] args){  
        StringBuffer buffer=new StringBuffer("hello");  
        buffer.append("java");  
        System.out.println(buffer);  
    }  
}  

Java Program to demonstrate the use of StringBuilder class.  

public class Strings{  
  public static void main(String[] args){  
      StringBuilder builder=new StringBuilder("hello");  
      builder.append("java");  
      System.out.println(builder);  
  }  
}  

Java program to demonstrate difference between String, 
StringBuilder and StringBuffer 

class Strings 
{ 
  Concatenates to String 
 public static void concat1(String s1) 
 { 
     s1 = s1 + "xyz"; 
 } 

  Concatenates to StringBuilder 
 public static void concat2(StringBuilder s2) 
 { 
     s2.append("Subtract"); 
 } 

  Concatenates to StringBuffer 
 public static void concat3(StringBuffer s3) 
 { 
     s3.append("And Setters"); 
 } 

 public static void main(String[] args) 
 { 
     String s1 = "abc"; 
     concat1(s1);   s1 is not changed 
     System.out.println("String: " + s1); 

     StringBuilder s2 = new StringBuilder("Add "); 
     concat2(s2);  s2 is changed 
     System.out.println("StringBuilder: " + s2); 

     StringBuffer s3 = new StringBuffer("Getters "); 
     concat3(s3);  s3 is changed 
     System.out.println("StringBuffer: " + s3); 
 } 
} 