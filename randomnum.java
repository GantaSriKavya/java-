package javaproject;
import java.util.*;
public class randomnum {

	public static void main(String[] args) 
	{
       Random r=new Random();
       int x=r.nextInt();
       System.out.println(x);
       int y=r.nextInt(50);
       System.out.println(y);
	}

}


/*output : -273385163
            7 */