package view.employee;

import java.util.Scanner;

import controller.moviePrintImplementation.MoviePrintInplementation;
import controller.loginValidation.LoginValidation;
import main.SathyamCinema;

public class EmployeeLogin 
{
	
	//Object Creation
	Scanner scanner =new Scanner(System.in); 
	LoginValidation loginValidation = new LoginValidation();
	MoviePrint moviePrint = new MoviePrint();
	MoviePrintInplementation moviePrintInplementation = new MoviePrintInplementation();
	ShowTimeDecider showTimeDecider = new ShowTimeDecider();
	
	boolean emLoginValidation;
	
	//EmployeeLogin
	public void employeeLogin() 
	{
		//Employee validation Selection in Controller
		emLoginValidation = true ;
		
		//Objection Creation
		SathyamCinema sathyamCinema = new SathyamCinema();
		
		//get Employee Name
		System.out.println("Enter the Employee Name");
		String emName =scanner.next();
		
		//get Employee Password
		System.out.println("Enter the Employee Password");
		String emPassword =scanner.next();
		
		//Login Validation
		if(loginValidation.emLoginValidation(emName, emPassword,emLoginValidation)) 
		{
			//Success
			System.out.println("Login Success");
			System.out.println("\n............Welcome "+emName+"............");
			moviePrintInplementation.getMovie();
			employeeOption();
		}
		else 
		{
			//Fail
			System.out.println("Login Failed");
			//Main Menu
			sathyamCinema.startingPage();			
		}
	}
	
	//Employee Option
	public void employeeOption()
	{	
		//get Employee Option
		System.out.println("\nEnter the Number \n\n1 For Add Movie \n2 For Remove Movie \n3 For Update Movie \n4 For Clear Seat");
		String  owOption =scanner.next();
		
		//OwnerOption
		//Add option
		if(owOption.equals("1")) 			
		{	
			//Pass  Employee Option in Show Time Decider
			showTimeDecider.showTime(owOption);		
		}
		//Remove Option
		else if(owOption.equals("2")) 
		{				
			//Pass  Employee Option in Show Time Decider
			showTimeDecider.showTime(owOption);
		}
		//Update Option
		else if(owOption.equals("3"))
		{				
			//Pass  Employee Option in Show Time Decider
			showTimeDecider.showTime(owOption);	
		}
		//Clear Seat
		else if(owOption.equals("4"))
		{
			//Pass  Employee Option in Show Time Decider
			showTimeDecider.showTime(owOption);	
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
					//Recall the EmployeeOption
					employeeOption();
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
	}
}
