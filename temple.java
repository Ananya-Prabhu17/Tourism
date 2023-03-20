package Tour2;


class temple extends tour                                                                                   //subclass
{
	public String seva;
	public int visittime;
	
	temple()
	{
		String seva="\0";
		int visittime=0;
	}
	
	temple(int visittime,String seva)
	{
		this.seva=seva;
		this.visittime=visittime;
	}
	
	temple(String seva)
	{
		this.seva=seva;
		System.out.println("The visters time is 6 AM to 6 PM");
	}
	
	temple(int visitid,int number,int a,int b)                                                       
	{
		super();                                                                                                       //using super to call superclass instance variables 
		seva="b";
		visittime=b;
	}
	
	temple retobj()                                                                                                //returning objects from method
	{
		temple ob1=new temple(8,"Rudrabhishek");
		return ob1;
	}
	
	public temple(temple obj)                                                                           //overriding methods
	{
		super(obj);                                                                                                 //passing object as parameters in constructors in super()
		this.seva=obj.seva;
	}
	
	void kumkumarchane()
	{
		System.out.println("The price of kumkumarchane is rs 50");
		System.out.println("The time required is 30 minutes");
	}
	
	void tulabar()
	{
		System.out.println("The price of tulabar is rs500");
		System.out.println("The time required is 2 hours");
	}
	
	void deepotsava()
	{
		System.out.println("The price of deepotsava is rs5000");
		System.out.println("The time required is 5 hours");
	}
	
	void display()                                                                           
	{
		System.out.println("The seva is "+this.seva+"The visit time is "+this.visittime);
	}
	
	
	
	
	
	
	
	
}
