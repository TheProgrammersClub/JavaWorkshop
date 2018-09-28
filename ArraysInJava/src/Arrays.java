
 
class Arrays  
{ 
    public static void main (String[] args)  
    {          
       declares an Array of integers. 
      int[] arr; 
          
       allocating memory for 5 integers. 
      arr = new int[5]; 
          
       initialize the first elements of the array 
      arr[0] = 10; 
          
       initialize the second elements of the array 
      arr[1] = 20; 
          
      arr[2] = 30; 
      arr[3] = 40; 
      arr[4] = 50; 
          
       accessing the elements of the specified array 
      for (int i = 0; i < arr.length; i++) 
         System.out.println("Element at index " + i +  
                                      " : "+ arr[i]);           
    } 
} 


Java program to demonstrate  
passing of array to method 

class Test 
{     
  Driver method 
 public static void main(String args[])  
 { 
     int arr[] = {3, 1, 2, 5, 4}; 
       
      passing array to method m1 
     sum(arr); 
   
 } 

 public static void sum(int[] arr)  
 { 
      getting sum of array values 
     int sum = 0; 
       
     for (int i = 0; i < arr.length; i++) 
         sum+=arr[i]; 
       
     System.out.println("sum of array values : " + sum); 
 } 
} 

/*
 *Multi Dimensional Array Demo 
 */

class multiDimensional 
{ 
    public static void main(String args[]) 
    { 
         declaring and initializing 2D array 
        int arr[][] = { {2,7,9},{3,6,1},{7,4,2} }; 
  
         printing 2D array 
        for (int i=0; i< 3 ; i++) 
        { 
            for (int j=0; j < 3 ; j++) 
                System.out.print(arr[i][j] + " "); 
  
            System.out.println(); 
        } 
    } 
} 