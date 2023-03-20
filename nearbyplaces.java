package Tour2;


class nearbyplaces extends tour
{
	int distance;
	int cost;
	
	nearbyplaces()
	{
		distance=0;
		cost=0;
	}
	
	nearbyplaces(String place,int distance,int cost)
	{
		this.distance=distance;
		this.cost=cost;
	}
	
	void honnavar()
	{
		System.out.println("Welcome to Honnavar");
		System.out.println("The distance from Murdeshwar to Honnavar is 20 km");
		System.out.println("Places to visit in Honnavar are 1.Kandla 2.Eco beach 3.Ramteerth");
		System.out.println("");


	}
	
	void bhatkal()
	{
		System.out.println("Welcome to Bhatkal");
		System.out.println("The distance from Honnavar to Bhatkal is 10 kms");
		System.out.println("Places to visit in Bhatkal are 1.Royal Oak  2.Light House");
		System.out.println("");


	}
	
	void display()
	{
		System.out.println("The place distance is "+distance);
		System.out.println("The cost is "+cost);
		System.out.println("");

    }
}

