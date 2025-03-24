package javaproject;
import java.util.Scanner;
public class vowels 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a character : ");
	      char c=sc.next().charAt(0);
	      c= Character.toLowerCase(c);
	      if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
	      {
	    	  System.out.println("It is a Vowel");
	      }
	      else
	      {
	    	  System.out.println("It is a consonant");
	      }
	}
}



/* output1 : Enter a character : 
           G
          It is a consonant  
           
 output2 : Enter a character : 
           E
           It is a Vowel      */

	


