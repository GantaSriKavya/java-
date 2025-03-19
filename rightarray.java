package javaproject;

public class rightarray {

	public static void main(String[] args) 
	{
		 int a[]= {1,2,3,4,5};
	      int first =a[a.length-1];
	      int i;
	      for(i=a.length-1;i>0;i--)
	      {
	    	  a[i]=a[i-1];
	      }
	      a[i]=first;
	      for(int j=0;j<a.length;j++)
	      {
	    	  System.out.print(a[j]+" ");
	      }
	}

}
