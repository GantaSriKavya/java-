package javaproject;
import java.util.Random;
public class upperlower
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
	    		  if(i<j)
	    		  {
	    			  System.out.print("0" + " ");
	    		  }
	    		  else
	    		  {
	    			  System.out.print(a[i][j]+" ");
	    		  }
	    	  }
	    	  System.out.println();
	      }
	}
}

/* output : 6 3 3
            0 6 6
            0 0 6 */

/* if the condition is (i<j) = 8 0 0
                               7 6 0
                               6 7 4 */












