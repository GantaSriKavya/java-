package javaproject;
import java.util.Scanner;
public class age_weight 
{
	public static void main(String[] args) 
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the age : ");
      int age=sc.nextInt();
      Scanner sc1=new Scanner(System.in);
      System.out.println("Enter the weight : ");
      int weight=sc1.nextInt();
      if(age<45 && weight<65)
      {
    	  System.out.println("is eligible");
      }
      else
      {
    	  System.out.println("is not eligible");
      }
	}
}
   

/*  output  :  Enter the age : 
               25
               Enter the weight : 
               72
               is not eligible     */
