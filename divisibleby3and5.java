package javaproject;
import java.util.*;
public class divisibleby3and5 
{
	public static void main(String[] args) 
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int n=sc.nextInt();
      if(n%3==0 && n%5==0)
      {
    	  System.out.println("The number is divisible");
      }
      else
      {
    	  System.out.println("The number is not divisible");
      }
	}
}


/*  output : Enter the number : 
             15
             The number is divisible  */

/*  output : */