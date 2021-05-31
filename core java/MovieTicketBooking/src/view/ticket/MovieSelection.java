package view.ticket;

import java.util.Scanner;

import controller.movieTableImplementatoin.MovieTableImplementatoin;
import controller.seatPrintImplementation.SeatPrintImplementation;


public class MovieSelection {
	
	//Object Creation
	Scanner scanner =new Scanner(System.in);				
	MovieTableImplementatoin movieTableImplementatoin = new MovieTableImplementatoin();
	SeatPrintImplementation seatPrintImplementation = new SeatPrintImplementation();
	SeatSelection seatSelection = new  SeatSelection();
	
	//Select ShowTime
	public void selectShowtime()
	{
		System.out.println("\nChoose the Show Time \n\n1 For Morning Show \n2 For Afternoon Show \n3 For Evening Show \n4 For Night Show");
		
		//get show Time Option
		String shTime = null;
		String showOption = scanner.next();
		
		//Morning
		if(showOption.equals("1"))
		{
			shTime="Morning";
			//Pass ShowTime in Movie Table Implementation
			movieTableImplementatoin.movieTable(shTime,"null",null);
		}
		//Afternoon
		else if(showOption.equals("2"))
		{
			shTime="Afternoon";
			//Pass ShowTime in Movie Table Implementation
			movieTableImplementatoin.movieTable(shTime,"null",null);;
		}
		//Evening
		else if(showOption.equals("3"))
		{
			shTime="Evening";
			//Pass ShowTime in Movie Table Implementation
			movieTableImplementatoin.movieTable(shTime,"null",null);
		}
		//Night
		else if(showOption.equals("4"))
		{
			shTime="Night";
			//Pass ShowTime in Movie Table Implementation
			movieTableImplementatoin.movieTable(shTime,"null",null);
		}
		//Invalid Option
		else
		{
			System.out.println("Invalid Answer..... Try Again....");
			System.out.println("Do you want to try again....?.. Y /N ");
					
			boolean tryAgainHandle = true;
					
			//Try Again Option Loop
			while(tryAgainHandle) 
			{
				String tryAgain = null;
				tryAgain = scanner.next();
						
				//Option for Yes
				if(tryAgain.toLowerCase().equals("y"))
				{					
					tryAgainHandle=false;
					selectShowtime();
				}
						
				//Option for No
				else if(tryAgain.toLowerCase().equals("n"))
				{					
					tryAgainHandle = false;
				}
						
				//Try Again Option Handle
				else 
				{
					System.out.println("Invalid Answer,Please Y or N");
					tryAgainHandle=true;
					
				}
			}
		}
		//Pass the Show Time in Seat Selection 
		seatSelection.seatSelection(shTime);
	}
	public void movieHandel(boolean ticketSuccess,String showTime,String movieName)
	{
		if(ticketSuccess) 
		{
			System.out.println("Select your Seat in "+showTime+" Show "+movieName+" Movie");
			seatPrintImplementation.fullSeatDetail(showTime);
		}
		else 
		{
			System.out.println("there is no movie in "+showTime);
			System.out.println("TryAgain");
			selectShowtime();
		}
	}
}

