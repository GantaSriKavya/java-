package javaproject;

public class string {

	public static void main(String[] args) 
	{
      String s1="kavya";
      String s2="kavya";
      String s3=new String("kavya");
      if(s1==s2)
      {
    	  System.out.println("True");
      }
      else
      {
    	  System.out.println("False");
      }
      System.out.println(s1.equals(s3));
      int i=s1.compareTo(s2);
      System.out.println(i);
	}

}


/*  outut : True
            true
            0    */