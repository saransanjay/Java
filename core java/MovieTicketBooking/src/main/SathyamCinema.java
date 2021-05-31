package main;

import java.util.Scanner;

import view.employee.EmployeeLogin;
import view.owner.SathyamCinemaLogin;
import view.ticket.TicketPrint;

public class SathyamCinema {
	
	//Object Creation
	Scanner scanner = new Scanner(System.in);	
	EmployeeLogin emlogin =new EmployeeLogin();
	SathyamCinemaLogin scLogin = new SathyamCinemaLogin();
	TicketPrint ticketPrint = new TicketPrint();
	// static boolean n = false;

	public void startingPage()
	{								
		boolean choosingHandle = true;
		String tryAgain = null;
		
		//Loop for Option
		while(choosingHandle) 
		{
			
				System.out.println("\n************Welcome to Sathyam Cinema*************");
				System.out.println("\nChoose 1 For Employee Login , 2 For Ticket Booking , 3 For Sathyam Cinema Login or 4 Exit");
				
				String option =scanner.next();
				
				//Option Selection
				
				//Option for Employee Login
				if(option.equals("1")) 
				{ 	
					emlogin.employeeLogin();
					choosingHandle=false;
					
				}
				
				//Option for TicketBooking
				else if(option.equals("2"))
				{
					ticketPrint.ticket();
					choosingHandle=false;
				}
				
				//Option for Sathyam Cinema Login
				else if(option.equals("3"))
				{
					scLogin.ownerLogin();
					choosingHandle=false;	
				}
				
				//Option for Exit
				else if(option.equals("4"))
				{
					return;
				}
				
				//Invalid Option Handle
				else 
				{	
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
							choosingHandle = true;
							tryAgainHandle=false;
						}
						
						//Option for No
						else if(tryAgain.toLowerCase().equals("n"))
						{
							choosingHandle = false;
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
		scanner.close();
	}	
			
	//Main Method
	public static void main(String[] args) 
	{
		SathyamCinema sathyamCinema =new SathyamCinema();
		sathyamCinema.startingPage();
		System.out.print("......Thank you.......");
	}
}
