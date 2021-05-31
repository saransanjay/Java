package view.employee;

import java.util.Scanner;


public class ShowTimeDecider {

	//Object Creation
	Scanner scanner =new Scanner(System.in);
	MovieTable movieTable =new MovieTable();
	
	//Show Time Decider with have Operation Option
	public void showTime(String operation) 
	{	
		//get Show Time Option
		System.out.println("\nChoose the Show Time \n\n1 For Morning Show \n2 For Afternoon Show \n3 For Evening Show \n4 For Night Show");
		String showOption = scanner.next();
		
		//Morning
		if(showOption.equals("1"))
		{
			String shTime="Morning";
			//Pass the Opertion and ShowTime Option in Movie Table
			movieTable.movieName(shTime, operation);
		}
		
		//Afternoon
		else if(showOption.equals("2"))
		{
			String shTime="Afternoon";
			//Pass the Opertion and ShowTime Option in Movie Table
			movieTable.movieName(shTime, operation);
		}
		
		//Evening
		else if(showOption.equals("3"))
		{
			String shTime="Evening";
			//Pass the Opertion and ShowTime Option in Movie Table
			movieTable.movieName(shTime, operation);		
		}
		
		//Nigth
		else if(showOption.equals("4"))
		{
			String shTime="Night";
			//Pass the Opertion and ShowTime Option in Movie Table
			movieTable.movieName(shTime, operation);		
		}
		
		//Invalid Answer
		else
		{
			System.out.println("Invalid Answer..... Try Again....");
			System.out.println("Do you want to try again....?.. Y /N ");
			
			//get TryAgain Answer
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
					//Recall the Show Time Decider
					showTime(operation);
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
