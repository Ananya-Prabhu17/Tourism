package Tour2;

interface inter1{                                                                                                       //Interface with default methods
	int a=1;                                                                                                                 //Interface with variables
	void cab();
	
	 default void guide()
	 {
		 System.out.println("Guide is being provided within 30 minutes");
         System.out.println("");
	 }
}

public class tour  implements inter1                                                                             //superclass            //class declaration
{
	public int visitid;
	public int number;
	
	public tour()                                                                                    //default constructor
	{
		visitid=0;
		number=0;
	}
	
	public tour(int visitid,int number)                                                 //constructor
	{
		this.visitid=visitid;
		this.number=number;
	}
	
    public	tour(int number)                                                                 //constructors overloading        passing basic data types as parameters to constructors          
	{
		visitid=1;
		this.number=number;
	}
	
	 public tour(tour ob1)                                                                     //passing object as parameters to constructors 
	{
		this.visitid=ob1.visitid;
		this.number=ob1.number;
	}
	
	void display()                                                                                    //member function
	{   
		System.out.println("The visit id is " + visitid);
		System.out.println("The number of people is "+number);
		System.out.println("");
	}
	
	
	public void cab()                                                                            //Interface method defination
	{
		System.out.println("The fare of ride per 10 km is 250rs");
		System.out.println("");
    }
	
	
	
}

