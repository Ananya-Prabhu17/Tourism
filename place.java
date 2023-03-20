package Tour2;

import java.util.Scanner;
import Tour3.*;
class Myexception extends Exception                                                                 //custom exception
{
	int people;
	
	Myexception(int people)
	{
		people=this.people;
	}
}



public class Murdeshwar  implements Runnable
{
	static void compute(int people)throws Myexception{
		if(people==0)
		{
			throw new Myexception(people);
		}
	}
	
	public  void run()
	{
		try {
		 Thread.sleep(1000);		
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void thread() throws Exception{
		Thread th=new Thread(this);
		th.start();
		th.join();
	}
	

	public static void main(String[] args) {
		
	
		
		int people;
		int ch;
		int a;
		int b;
		int c;
		int d;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("::::::::****     Welcome to Murdeshwar    **** :::::::::");
		System.out.println("");
		 System.out.println("Enter the number of people");
		 people=sc.nextInt();
		 
		 try
			{
			    Murdeshwar m=new Murdeshwar();
			    m.thread();
			    compute(people);
			}
			catch(Exception e)
			{
				System.out.println("Please do enter the correct Input number");
				people=sc.nextInt();
			}

		
		
		
        if(people==1)
        {
        	tour tourist=new tour(1);
        	tour tourist1=new tour(tourist);                                                              //passing object as parameters
        	tourist1.display();
        	tourist1.cab();
        
        }
        else
        {
        	tour tourist=new tour(people);
        	tourist.display();
        	tourist.cab();
        }
        
        do
        {

		System.out.println("Enter your choice");
		System.out.println("1.Temple    2.Beach      3.Near by Places");
		ch=sc.nextInt();

		switch(ch)
		{
		case 1:
			        temple visitor=new temple(9,"Full day seva");                                                                       //object declaration
			        visitor.display();
			        temple visitor1=visitor.retobj();
			        System.out.println("");
			        System.out.println("Choose the seva you wanna perform");
			        System.out.println("1 Kumkumarchane   2  Tulabar     3   Deepotsava");
			        System.out.println("");
			        System.out.println("Enter your choice");
			        a=sc.nextInt();
			        switch(a)
			        {
			        case 1: visitor1.kumkumarchane();        //returning object from method
			                     System.out.println("");
			                     break;
			                     
			        case 2: visitor.tulabar();
			        			System.out.println("");
			                     break;
			                     
			        case 3:visitor.deepotsava();
			        			System.out.println("");
			                    break;
			                    
			        case 4:  System.out.println("Invalid choice");
			        			System.out.println("");
			                     break;
			        }
			        break;
			       
		case 2:
			        beach traveller=new beach();
			        beach traveller1=new beach(traveller);
			        lodge ob=new lodge(2);
			        System.out.println("Enter your choice");
			        System.out.println("1 Water rides   2 Dry rides");
			        b=sc.nextInt();
			        switch(b)
			        {
			        case 1: traveller1.watergames();
			        			System.out.println("");
			        			ob.rooms();                                                                  
			        			System.out.println("");
			                    break;
			                    
			        case 2:traveller.drygames();
			        			System.out.println("");
			        			ob.rooms();
			        			System.out.println("");
			                    break;
			                    
			        case 3:System.out.println("Invalid choice");           
			        }
			        break;
			        
		case 3:
			       nearbyplaces explorer=new nearbyplaces();
			       System.out.println("Enter your choice");
			       System.out.println("1  Honnavar   2  Bhatkal");
			       c=sc.nextInt();
			       switch(c)
			       {
			       case 1 : explorer.honnavar();
			                     break;
			       case 2 : explorer.bhatkal();
			                     break;
			       case 3:System.out.println("Invalid choice");
			                   break;
			       }
			       
			       break;
		
		case 4: 
			       System.out.println("Enter correct choice");
			       break;
			        
		}
        
		
		System.out.println("You want to continue your jouney?");
		System.out.println("Yes = 1      No=2");
		d=sc.nextInt();
		
	}		
        while(d==1);
        
        if(d==2)
        {
        	System.out.println("");
        	System.out.println("::::::****      Thanks for visiting Murdeshwar      ****:::::: ");
        }
	}
}
	
		

