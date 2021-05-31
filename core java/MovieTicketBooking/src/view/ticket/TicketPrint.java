package view.ticket;

import java.util.TreeMap;

import controller.moviePrintImplementation.MoviePrintInplementation;

public class TicketPrint {
 
	//Ticket
	public void ticket() 
	{
		//Object Creation
		MoviePrintInplementation moviePrintInplementation = new MoviePrintInplementation();
		MovieSelection movieSelection = new MovieSelection();
		
					
		System.out.println("\n************Welcome to Sathyam Cinema*************");
		//Current Running Moive Name Print
		moviePrintInplementation.getMovie();
		//Show Time Decider
		movieSelection.selectShowtime();
		
	}
	
	//Seat Print with have trmap(Seat Data in Data Base) and Show Time  
	public  void seatPrint(TreeMap<Integer,Integer> trmap ,String showTime,boolean freeSeat)
	{ 			
		String filledSeat ="❎";
		String emptySeat ="✅";		
		
		System.out.println("\nTicket Bookink (Booked Seat = "+filledSeat+" Not Booked Seat = "+emptySeat+")\n");
		int seat = 0;
		int key = 0;
		int count = 1;
		
		//Loop for 5 Row 50 Seat Print
		for(int j=0; j<5; j++) 
		{
			int number = 1;
			System.out.print("\t");
			
			//Loop for 2 Column 10 seat Print
			for(int i=0; i<10; i++)
			{	
				seat=trmap.get(key);
				key++;
				
				//Empty Seat
				if(seat==1)
				{					
					System.out.print(emptySeat +"\t");
				}
				//Filled Seat
				else 
				{					
					System.out.print(filledSeat+"\t");
				}
				//Space for After Seat Print
				if(i==4) {
					System.out.print("\t");
				}
			}
			System.out.print("\n");
			System.out.print("\t");
			
			//Loop for 5 Row 50 Seat Name Print
			for(int i=0; i<10; i++)
			{	
				//A Class
				if(count<=10)
				{
					String seatNumber ="A"+number;
					number++;
					System.out.print(seatNumber+"\t");
				}
				//B Class
				else if(count>10&&count<=20)
				{
					String seatNumber ="B"+number;
					number++;
					System.out.print(seatNumber+"\t");
				}
				//C Class
				else if(count>20&&count<=30)
				{
					String seatNumber ="C"+number;
					number++;
					System.out.print(seatNumber+"\t");
				}
				// D Class
				else if(count>30&&count<=40)
				{
					String seatNumber ="D"+number;
					number++;
					System.out.print(seatNumber+"\t");
				}
				//E Class
				else if(count>40&&count<=50)
				{
					String seatNumber ="E"+number;
					number++;
					System.out.print(seatNumber+"\t");
				}
				//Space for After 5 Seat Name Print
				if(i==4) 
				{
					System.out.print("\t");
				}
				count++;
			}
			System.out.print("\n");
		}
		//Seat are Full
		if(!freeSeat)
		{
			System.out.println("\n!Seat are full,TryAgain Other Show");
			//Recall the Ticket
			ticket(); 
		}
	}
}
