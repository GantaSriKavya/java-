package javaproject;
import java.util.Scanner;
public class naturalnum 
{
	public static void main(String[] args) 
	{
		int sum=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number :");
       int n=sc.nextInt();
       for(int i=1;i<=n;i++)
       {
    	   sum=sum+i;
       }
       System.out.println("Sum of "+n +" natural number is " + sum);
	}
}



/*  output  : Enter the number :
              10
              Sum of 10 natural number is 55    */
