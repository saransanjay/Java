package view.owner;

import java.util.Scanner;

import controller.employeeBioData.EmployeeBioDataImplementation;
import main.SathyamCinema;


public class EmployeeBioData {
	
	//Object Creation
	Scanner scanner = new  Scanner(System.in);
	
	
	//Empolyee Bio Data
	public void employeeBioData()
	{
		
		//Object Creation
		EmployeeBioDataImplementation employeeBioDataImplementation = new EmployeeBioDataImplementation();
		
		//Employee get
		System.out.println("\nEnter the Employee Name");						
		String emName = scanner.next();
		
		//Give The Employee Name to DataBase
		employeeBioDataImplementation.employeeBioDataImplementation(emName);
		
	}
	
	//Receive Bio Data in Data Base
	public void employeeBioDataPrint(String Name, String age, String password , String phoneNumber ,boolean invalidName) 
	{
		//Invalid Name Handle
		if(invalidName)
		{
			//Fail
			System.out.println("\nInvaild Employee Name");
			
			System.out.println("\nInvalid Answer..... Try Again....");
			System.out.println("Do you want to try again....?.. Y /N ");
			
			boolean tryAgainHandle = true;
			
			//Try Again Option Loop
			while(tryAgainHandle) 
			{
				//get TryAgain Answer
				String tryAgain = null;
				tryAgain = scanner.next();
				
				//Option for Yes
				if(tryAgain.toLowerCase().equals("y"))
				{					
					tryAgainHandle=false;
					//Recall the Employee Bio Data
					employeeBioData();					
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
		else 
		{
			//Success
			//Printing the Data
			System.out.println("Name = "+Name);
			System.out.println("Age = "+age);
			System.out.println("Password = "+password);
			System.out.println("Phone Number = "+phoneNumber);
			//BackOption
			backOption(); 
		}
	}
	
	//BackOption	
	public void backOption() 
	{
			//Object Creation
			SathyamCinema sathyamCinema = new SathyamCinema(); 
			
		//Back or Exit Option
		System.out.println("\nChoose 1 For TryAgain Employee Bio Data ,2 For Main Menu or 3 For Exit");
		String afterSuccess = scanner.next();
				
		//options
		// Try Again Bio Data
		if(afterSuccess.equals("1")) 
		{
			employeeBioData();
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
