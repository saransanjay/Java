package view.employee;

import java.util.Scanner;

import controller.movieTableImplementatoin.MovieTableImplementatoin;
import main.SathyamCinema;

public class MovieTable 
{
	
	//Object Creation
	Scanner scanner =new Scanner(System.in);
	MovieTableImplementatoin movieTableImplementatoin = new MovieTableImplementatoin();

	//Movie Name with have Show Time and Operation Option
	public void movieName(String showTime ,String operation)
	{	
		//Add Option
		if(operation.equals("1"))
		{	
			System.out.println("Enter the Movie Name Going to Add");			
		}
		//Remove Option
		else if(operation.equals("2"))
		{
			//Insert the Operation and Show time Option in Movie Table Implementation
			movieTableImplementatoin.movieTable(showTime, operation, null);
		}
		//Update Option
		else if(operation.equals("3"))
		{
			System.out.println("Enter the Movie Name Going to Update");
		}
		//Clear Seat
		else if(operation.equals("4")) 
		{
			//Insert the Operation and Show time Option in Movie Table Implementation
			movieTableImplementatoin.movieTable(showTime, operation, null);
		}
		//get Movie Name
		String movieName =scanner.next(); 
		//Insert the Movie Name , Operation and Show time Option in Data Base
		movieTableImplementatoin.movieTable(showTime, operation, movieName);
	}
	
	//Movie Table Handle with have Success and Operation
	public void movieTableHandle(boolean success ,String operation)
	{
		
		//Add Option
		if(operation.equals("1"))
		{
			if(success)
			{
				//Success
				System.out.println("Successfully Movie is Added");
			}
			else 
			{
				//Fail
				System.out.println("Failed ,Already the Movie is Added");
			}
		}
		
		//Remove Option
		else if(operation.equals("2"))
		{
			if(success)
			{
				//Success
				System.out.println("Successfully Movie is Removed");
			}
			else 
			{
				//Fail
				System.out.println("Failed ,Already the Movie is Removed");
			}			
		}
		
		//Update Option
		else if(operation.equals("3"))
		{
			if(success)
			{
				//Success
				System.out.println("Successfully Movie is Updated");
			}
			else 
			{
				//Fail
				System.out.println("Failed ,the Movie Slot is Empty ");
			}	
		}
		else if(operation.equals("4"))
		{
			if(success)
			{
				//Success
				System.out.println("Successfully Seat is Clear");
			}
		}
		//BackOption
		backOption();
	}
	
	//BackOption	
	public void backOption() 
	{
		//Object Creation
		SathyamCinema sathyamCinema = new SathyamCinema(); 
		EmployeeLogin employeeLogin = new EmployeeLogin();
				
		//Back or Exit Option
		System.out.println("\nChoose 1 For TryAgain Operation Option ,2 For Main Menu or 3 For Exit");
		String afterSuccess = scanner.next();
					
		//options
		// Try Again Operation Option
		if(afterSuccess.equals("1")) 
		{
			employeeLogin.employeeOption();	
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
					backOption(); 
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
