package view.owner;

import java.util.Scanner;

import controller.loginValidation.LoginValidation;
import main.SathyamCinema;


public class SathyamCinemaLogin 
{
	
	//Object Creation
	Scanner scanner = new Scanner(System.in);	
	LoginValidation loginValidation = new LoginValidation();
	EmployeeRegistation employeeRegistation = new EmployeeRegistation();
	EmployeeBioData employeeBioData = new EmployeeBioData();
	
	boolean owLoginValidation;
		
	//Ownwe Login
	public void ownerLogin() 
	{
		 owLoginValidation = false ;
		
		//Object Creation
		SathyamCinema sathyamCinema = new SathyamCinema(); 
		
		//Owner Name get
		System.out.println("Enter the  OwnerName");
		String OwName =scanner.next();
		
		//Owner Password get
		System.out.println("Enter the OwnerPassword");
		String OwPassword =scanner.next();
		
		//Login Validation
		if(loginValidation.emLoginValidation(OwName, OwPassword, owLoginValidation)) 
		{
			//Success
			System.out.println("Login Success");
			System.out.println("\n............Welcome "+OwName+"............");
			ownerOption();
		}
		else 
		{
			//fail
			System.out.println("Login Failed");
			//Main Menu
			sathyamCinema.startingPage();				
		}		
	}
	
	//Owner Option
	public void ownerOption() 
	{
		//Object Creation
		SathyamCinema sathyamCinema = new SathyamCinema();
		
		//Option
		System.out.println("\nChoose 1 For Employee Bio Data , 2 For New Employee Registation ,3 For Main Menu or 4 For Exit");
		
		//Option gets
		String option = scanner.next();
		
		//OwnerOptions
		if(option.equals("1")) 
		{	
			//EmployeeBio
			employeeBioData.employeeBioData();
		}
		else if(option.equals("2"))
		{
			//EmployeeRegistation
			employeeRegistation.employeeRegistation();
		}
		else if(option.equals("3"))
		{
			//Main Menu
			sathyamCinema.startingPage();
		}
		else if(option.equals("4"))
		{
			//Exit
			return;
		}
		else 
		{
			//Invalid Answer Handle
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
					ownerOption();
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
