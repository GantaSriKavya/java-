package javaproject;
public class saloon {
      customer c;
      String sname;
      String p;
      public saloon(customer c, String sname, String p)
      {
    	  this.c=c;
    	  this.sname=sname;
    	  this.p=p;
      }
      void show()
      {
    	  System.out.println("Id :"+ c.cid);
    	  System.out.println("Name :"+ c.cname);
    	  System.out.println("Visited for :"+c.v);
    	  System.out.println("Total Bill :"+ c.bill);
    	  System.out.println("Staff attended :"+ sname);
    	  System.out.println("Progress :"+ p);
    	  System.out.println();
      }
	public static void main(String[] args)
	{
      customer c=new customer(110,"Balu","Haircut",1000);
      saloon s=new saloon(c,"Ravi","Completed");
      
      customer c1=new customer(111,"Chinti","Massage",700);
      saloon s1=new saloon(c1,"Sai","Completed");
      
      customer c2=new customer(112,"Ram","Tan Removel",2000);
      saloon s2=new saloon(c2,"Sundar","Completed");
      
      customer c3=new customer(113,"Mani","Face pack",1500);
      saloon s3=new saloon(c3,"Ragu","Completed");
      
      customer c4=new customer(114,"Rao","Haircut",1000);
      saloon s4=new saloon(c4,"sai","Completed");
      
      customer c5=new customer(115,"Sam","Massage",700);
      saloon s5=new saloon(c5,"Ram","Completed");
      s.show();
      s1.show();
      s2.show();
      s3.show();
      s4.show();
      s5.show();
	}
}

/*  output :  

Id :110
Name :Balk
Visited for :Haircut
Total Bill :1000
Staff attended :Rave
Progress :Completed

Id :111
Name :Chintz
Visited for :Massage
Total Bill :700
Staff attended :Sail
Progress :Completed

Id :112
Name :Ram
Visited for :Tan Removal
Total Bill :2000
Staff attended :Syria
Progress :Completed

Id :113
Name :Main
Visited for :Face pack
Total Bill :1500
Staff attended :Rag
Progress :Completed

Id :114
Name :Ram
Visited for :Haircut
Total Bill :1000
Staff attended :sail
Progress :Completed

Id :115
Name :Sam
Visited for :Massage
Total Bill :700
Staff attended :Ram
Progress :Completed    */

