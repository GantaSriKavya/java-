package javaproject;

public class leftarray 
{
	public static void main(String[] args) 
	{
      int a[]= {1,2,3,4,5};
      int first =a[0];
      int i;
      for(i=0;i<a.length-1;i++)
      {
    	  a[i]=a[i+1];
      }
      a[i]=first;
      for(int j=0;j<a.length;j++)
      {
    	  System.out.print(a[j]+" ");
      }
	}
}

/* output : 2 3 4 5 1 */