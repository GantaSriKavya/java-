package srikavya;
import java.util.*;
public class palindrome 
{
	public static void main(String[] args) 
	{ 
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number : ");
	   int num=sc.nextInt();
	   int total=num;
	   int rev=0;
	   int rem;
	   while(num!=0)
	   {
		   rem=num%10;
		   rev=rev*10+rem;
		   num=num/10;   
	   }
	   if(total==rev)
	   {
		   System.out.println("It is a palindrome");
	   }
	   else
	   {
		   System.out.println("it is not a palindrome");
	   }
	}
}

/*  output : Enter the number : 
             141
             It is a palindrome    */





