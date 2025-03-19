package javaproject;

import java.util.Random;

public class array2d
{
	public static void main(String[] args) 
	{
	  Random r=new Random();
      int a[][]=new int[3][3];
      for(int i=0;i<3;i++)
      {
    	  for(int j=0;j<3;j++)
    	  {
    		  a[i][j]=r.nextInt(10);
    	  }
    	  System.out.println( );
      }
      for(int i=0;i<3;i++)
      {
    	  for(int j=0;j<3;j++)
    	  {
    		System.out.print(a[i][j]+ " ");
    	  }
    	  System.out.println( );
      }
	}
}

/*output : 5 3 3
           3 5 3
           2 8 1*/