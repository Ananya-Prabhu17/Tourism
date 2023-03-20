package Tour2;



public class beach extends tour
{
	int ridenum;
	
    public	beach()
	{
		ridenum=0;
	}
	public beach(int ridenum,String rides)
	{
		this.ridenum=ridenum;
	}
	
	public beach(beach ob)
	{
		super(ob);
		ridenum=ob.ridenum;
	}
	
	void watergames()
	{
		System.out.println("The price of Water games is rs2000");
        System.out.println("It includes 1.Scuba diving 2.Snorkeling 3.Surfing");

	}
	
	void drygames()
	{
		System.out.println("The price of dry games is 1500");
		System.out.println("It includes 1.Kite flying 2.Parachute");
		System.out.println("");


	}
	
	
	
	void display()
	{
		System.out.println("The ride num  is "+ridenum);
		System.out.println("");
	}
	
	void stringfunction()                                                                                                        //string handling function
	{
		String s1="Ananya";
		String s2="Ananya";
		boolean x=s1.equals(s2);
		System.out.println("The length of string1 is " +s1.length());
		System.out.println("Comparing s1 and s2 -----> "+x);
		
	}
	
}

