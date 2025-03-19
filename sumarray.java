package javaproject;

import java.util.Random;

public class sumarray {

	public static void main(String[] args) 
	{
      int sum=0;
      Random r=new Random();
      int a[][]=new int[3][3];
      for(int i=0;i<a.length;i++)
      {
    	  for(int j=0;j<a.length;j++)
    	  {
    		  a[i][j]=r.nextInt(10);
    	  }
      }
      for(int i=0;i<a.length;i++)
      {
    	  for(int j=0;j<a.length;j++)
    	  {
    		 System.out.print(a[i][j]+ " ");
    	  }
    	  System.out.println( );
      }
      for(int i=0;i<a.length;i++)
      {
    	  for(int j=0;j<a.length;j++)
    	  {
    		  if(i==j)
    		  {
    			  sum=sum+a[i][j];
    		  }
      }
	}
      System.out.println(sum);
}
}



/* output : 8 8 7 
            4 8 1 
            2 5 2 
            18  */

