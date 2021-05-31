package view.owner;

import java.util.Scanner;
import controller.employeeRegistationImplementation.EmployeeRegistationImplementation;
import main.SathyamCinema;

public class EmployeeRegistation {
	
	EmployeeRegistationImplementation employeeRegistationImplementation = new EmployeeRegistationImplementation();
	Scanner scanner = new Scanner(System.in);
	
	private String name = null;
	private String age = null;
	private String password = null;
	private String confrimPassword = null;
	private String phoneNumber = null;
	private boolean decider = false;
	
	
	public void employeeRegistation() 
	{
		//get Name
		System.out.println("\nEnter your Name");
		name = scanner.next();
		decider = true; 
		
		//Name Handle
		if(name.isEmpty())
		{
			//fail
			System.out.println("Invalid Name");
			System.out.println("\n......Try Again......");
			//employeeRegistation();
			decider = false;
		}
		
		//After Name Handle
		if(decider != false)
		{
			System.out.println("Enter your Age");
			try
			{
				//get Age
				age = scanner.next();
				Integer.parseInt(age);
				decider = true;
				//Age Handle
				if(age.length()>2)
				{		
					//fail
					System.out.println("Invalid Age");
					System.out.println("\n......Try Again......");
					//employeeRegistation();
					decider = false;
				}
			}
			catch(NumberFormatException ex)
			{
				//Invalid Answer
				System.out.println( "\nEnter only numbers....");
				System.out.println(".....ReEnter from the begining....");
				//employeeRegistation();
				decider = false;
			}
		}
		
		//After Age Handle
		if(decider != false)
		{	
			//get Password
			System.out.println("Enter your Password");
		    password = scanner.next();
		    decider = true;
		    
		    //Password Handle
		    if(password.isEmpty())
			{
		    	//fail
				System.out.println("Invalid Password");
				System.out.println("\n......Try Again......");
				//employeeRegistation();
				decider = false;
			}
		}
		 
		//After Password Handle
		if(decider != false)
		{	
			//get Comfrim Password
			System.out.println("Enter your Password Again to Confirm");
			confrimPassword = scanner.next();
			decider = true;
			//Comfrim Password Handle
			if(!password.equals(confrimPassword))
			{
				//fail
				System.out.println("Invalid Confrim Password");
				System.out.println("\n......Try Again......");
				//employeeRegistation();
				decider = false;
			}
			
		}
		
		// After Confrim Password Handle
		if(decider)
		{
			try
			{
				//get Phone Number
				System.out.println("Enter your Phone Number");		
				phoneNumber = scanner.next();
				Integer.parseInt(phoneNumber);
				decider = true;
				
				//Phone Number Handle
				if(phoneNumber.length() != 10)
				{
					System.out.println("Invalid Phone Number");
					System.out.println("\n......Try Again......");
					//employeeRegistation();
					decider = false;
				}
			}
		
		catch(NumberFormatException ex)
		{
			//Invalid Answer
			System.out.println( "\nEnter only numbers....");
			System.out.println(".....ReEnter from the begining....");
			//employeeRegistation();
			decider = false;
		}	
		}
		
		//After Phone Number Handle
		if(decider)
		{
			//Insert Employee Bio Data in Data Base 
			employeeRegistationImplementation.dataInsert(name, age, password, phoneNumber);
			System.out.println("Successfully Registed");
		}
		else
		{
			//fail
			//Recall the Employee Registation
			employeeRegistation();
		}
		//BackOption
		backOption();
	}
	
	//BackOption	
	public void backOption() 
	{
		//Object Creation
		SathyamCinema sathyamCinema = new SathyamCinema(); 
				
		//Back or Exit Option
		System.out.println("\nChoose 1 For TryAgain Employee Registation ,2 For Main Menu or 3 For Exit");
		String afterSuccess = scanner.next();
					
		//options
		// Try Again Employee Registation
		if(afterSuccess.equals("1")) 
		{
			employeeRegistation(); 
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
