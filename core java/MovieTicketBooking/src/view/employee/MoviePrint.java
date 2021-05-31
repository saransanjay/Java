package view.employee;

public class MoviePrint {
	
	//Current Movie Print with have All Movie Name in Data Base
	public void currentMovie(String movie1 ,String movie2 ,String movie3 ,String movie4)
	{
		System.out.println("\nCurrent movies is Running");

		
		//Morning Show
		System.out.println("\nMorning Show(9:30am-1:3pm)");
		if(movie1!=null)
		{
			//Success
			System.out.println(movie1);
		}
		else
		{
			//Fail
			System.out.println("There is No Movie is Running in Morning");
		}
		
		//Afternoon Show
		System.out.println("\nAfternoon Show(2:30pm-5:30pm)");
		if(movie2!=null) 
		{
			//Success
			System.out.println(movie2);
		}
		else 
		{
			//Fail
			System.out.println("There is No Movie is Running in Afternoon");
		}
		
		//Evening Show
		System.out.println("\nEvening Show(6:30pm-9:30pm)");
		if(movie3!=null)
		{
			//Success
			System.out.println(movie3);
		}
		else 
		{
			//Fail
			System.out.println("There is No Movie is Running in Evening");
		}
		
		//Night Show
		System.out.println("\nNight Show(10:30pm-1:30am)");
		if(movie4!=null)
		{
			//Success
			System.out.println(movie4);
		}
		else
		{
			//Fail
			System.out.println("There is No Movie is Running in Night");
		}
	}
}
