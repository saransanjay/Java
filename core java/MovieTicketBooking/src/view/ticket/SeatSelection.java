package view.ticket;

import java.util.InputMismatchException;
import java.util.Scanner;

import controller.seatPrintImplementation.SeatPrintImplementation;
import controller.seatSelectionImplementation.SeatSelectionImplementation;
import main.SathyamCinema;

public class SeatSelection {

	//Objection Creation
	Scanner scanner = new Scanner(System.in);
	SeatSelectionImplementation seatSelectionImplementation = new SeatSelectionImplementation();
	SeatPrintImplementation seatPrintImplementation = new SeatPrintImplementation();
	
	boolean decider = false;
	private String row = null;
	private String capsRow = null;
	private int seatNumber = 0;
	
	//Seat Selection with have Show Time 
	public void seatSelection(String showTime)
	{
		//get Seat Row 
		System.out.println("Enter the Seat Row");
		row = scanner.next();
		//Convert Row  Answer into Caps
		capsRow = row.toUpperCase();
		decider =true;
		
		//After get Seat Row  
		if(decider!= false) 
		{
			//Not Equal to A,B,C,D,E
			if(!(capsRow.equals("A")||capsRow.equals("B"))&&!capsRow.equals("C")&&!capsRow.equals("D")&&!capsRow.equals("E")) 
			{
				//fail
				System.out.println("Invalid Row\n");
				decider = false;
			}
		}
		//After Seat Row Handle 
		if(decider!= false) 
		{
			try 
			{	
				//get Seat Number
				System.out.println("Enter the Seat Number");
				seatNumber = scanner.nextInt();
				decider =true;
				
				//Seat Number Not Equal to 1 to 10
				if( seatNumber<=0 ||seatNumber>10)
				{
					//fail
					System.out.println("Invalid Seat Number\n");
					decider = false;	
				}	
			}
			catch(InputMismatchException ex) 
			{
				//fail
				System.out.println( "Invalid Enter only numbers\n ");
				decider = false;	
			}
		}
		
		//After Seat Number Handle
		if(decider!= false)
		{
			//Pass the Row , SeatNumber and Show Time in Seat Selection implementation for Store Select Seat Data in Data Base 
			seatSelectionImplementation.seatSelection(capsRow,seatNumber,showTime);
		}
		else 
		{
			//Fail
			//Recall the Seat Selection
			seatSelection(showTime);
		}
	}
	
	//Seat Selection Handle with have Success and Show Time
	public void seatSelectionHandle(boolean success ,String showTime)
	{
		//Success
		if(success) 
		{
			System.out.println("Successfull seat is Booked");
			//Print Selected Seat 
			seatPrintImplementation.fullSeatDetail(showTime);
		}
		//Fail
		else
		{
			System.out.println("Failed!,you Selected is Already Booked TryAgin\n");
		}
		//Pass ShowTime in BackOption
		backOption(showTime);
	}
	
	//BackOption with have Show Time	
	public void backOption(String showTime) 
	{
		//Object Creation
		SathyamCinema sathyamCinema = new SathyamCinema(); 
				
		//Back or Exit Option
		System.out.println("\nChoose 1 For Select Other Seat ,2 For Main Menu or 3 For Exit");
		String afterSuccess = scanner.next();
					
		//options
		//Select Other Seat
		if(afterSuccess.equals("1")) 
		{
			//Recall Seat Selection
			seatSelection(showTime);
		}
		// Main Menu
		else if(afterSuccess.equals("2"))
		{
			sathyamCinema.startingPage();		
		}
		//Exit
		else if(afterSuccess.equals("3"))
		{
			return;
		}
		//Invalid Answer Handle
		else
		{			
			String tryAgain = null;
						
			System.out.println("Invalid Answer..... Try Again....");
			System.out.println("Do you want to try again....?.. Y /N ");
						
			boolean tryAgainHandle = true;
						
			//Try Again Option Loop
			while(tryAgainHandle) 
			{
				//get TryAgain Answer
				tryAgain = scanner.next();
							
				//Option for Yes
				if(tryAgain.toLowerCase().equals("y"))
				{
					tryAgainHandle = false;
					//BackOption
					backOption(showTime); 
				}
							
				//Option for No
				else if(tryAgain.toLowerCase().equals("n"))
				{
					tryAgainHandle = false;
				}
							
				//Try Again Option Handle
				else 
				{
					System.out.println("Inavlid Answer,Please Y or N");
					tryAgainHandle=true;
				}
			}
		}
	}
}
