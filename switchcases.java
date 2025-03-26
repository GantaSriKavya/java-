package javaproject;
import java.util.Scanner;
public class switchcases 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char d='y';
		do {
			System.out.println("Enter first number :");
			int a=sc.nextInt();
			System.out.println("Enter second number :");
			int b=sc.nextInt();
			System.out.println("Enter your operator :");
			char c=sc.next().charAt(0);
			
			switch(c)
			{
			case '+': System.out.println(a+b);
			break;
			case '-': System.out.println(a-b);
			break;
			case '*': System.out.println(a*b);
			break;
			case '/': System.out.println(a/b);
			break;
			}
			System.out.println("Press y to continue and n to terminate ");
			d=sc.next().charAt(0);
		}while(d=='y');
	}
}
