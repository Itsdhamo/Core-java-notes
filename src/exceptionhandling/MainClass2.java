package exceptionhandling;
import java.util.*;
public class MainClass2 
        {
public static void main(String[] args)
        {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	int [] arr = {1,2,3,4,5};
 	try 
 	    {
 		int c=arr[num];
	    System.out.println(c);
        }
 	catch(Exception e1) 
 	      {
          if(num>arr.length-1) 
        	  System.out.println("The code gets exception,thats why catch block is executed");
          for(int i=0;i<arr.length;i++) 
          {
               System.out.println(arr[i]);
          }
 	      }
          finally
          {
        	  System.out.println("i am in finally block");
          }
	      }
          }
