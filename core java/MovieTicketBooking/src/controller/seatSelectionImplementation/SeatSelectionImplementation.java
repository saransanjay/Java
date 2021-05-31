package controller.seatSelectionImplementation;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.dao.DAO;
import view.ticket.SeatSelection;

public class SeatSelectionImplementation {
	
	private PreparedStatement stmt = null;
	private String query = null;	
	private ResultSet resultSet = null; 
	private int seatStatus = 0;
	boolean success = false; 
	
	//Seat Selection Implementation with have Row ,SeatNumber and ShowTime  
	public void seatSelection(String row ,int seatNumber ,String showTime)
	{		
		//Object Creation
		DAO dao = new DAO();
		SeatSelection seatSelection = new SeatSelection();
		
		try 
		{
			//Morning
			if(showTime.equals("Morning"))
			{
				//Query Select Morning Seat Data in Data Base
				query="Select ROW_"+seatNumber+" from CINEMA_MORNING_SEATS where MOVIECLASS ='"+row+"'";
				resultSet =dao.selectTable(query);			
				resultSet.next();
				seatStatus = resultSet.getInt(1);
				
				//Seat Data Equal to 0 in Data Base
				if(seatStatus == 0) 		
				{
					//Success
					//Query Update Morning Seat = 1 in Data Base
					query="update CINEMA_MORNING_SEATS set ROW_"+seatNumber+"='1' where MOVIECLASS ='"+row+"'";
					stmt = dao.getConnection().prepareStatement(query);										
					dao.updateTable(stmt);
					success = true;
				}
				else
				{
					//Fail
					success = false;
				}				
			}
			
			//Afternoon
			else if(showTime.equals("Afternoon"))
			{
				//Query Select Afternooon Seat Data in Data Base
				query="Select ROW_"+seatNumber+" from CINEMA_AFTERNOON_SEATS where MOVIECLASS ='"+row+"'";
				resultSet =dao.selectTable(query);			
				resultSet.next();
				seatStatus = resultSet.getInt(1);
				
				//Seat Data Equal to 0 in Data Base
				if(seatStatus == 0) 		
				{
					//Success
					//Query Update Afternoon Seat = 1 in Data Base
					query="update CINEMA_AFTERNOON_SEATS set ROW_"+seatNumber+"='1' where MOVIECLASS ='"+row+"'";
					stmt = dao.getConnection().prepareStatement(query);										
					dao.updateTable(stmt);
					success = true;

				}
				else
				{
					//Fail
					success = false;
				}
			}
		
			//Evening
			else if(showTime.equals("Evening"))		
			{		
				//Query Select Evening Seat Data in Data Base
				query="Select ROW_"+seatNumber+" from CINEMA_EVENING_SEATS where MOVIECLASS ='"+row+"'";
				resultSet =dao.selectTable(query);			
				resultSet.next();
				seatStatus = resultSet.getInt(1);
					
				//Seat Data Equal to 0 in Data Base
				if(seatStatus == 0) 		
				{
					//Success
					//Query Update Evening Seat = 1 in Data Base
					query="update CINEMA_EVENING_SEATS set ROW_"+seatNumber+"='1' where MOVIECLASS ='"+row+"'";
					stmt = dao.getConnection().prepareStatement(query);										
					dao.updateTable(stmt);
					success = true;
				}
				else
				{
					//Fail
					success = false;
				}
			}
		
			//Night
			else if(showTime.equals("Night"))
			{
				//Query Select Night Seat Data in Data Base
				query="Select ROW_"+seatNumber+" from CINEMA_NIGHT_SEATS where MOVIECLASS ='"+row+"'";
				resultSet =dao.selectTable(query);			
				resultSet.next();
				seatStatus = resultSet.getInt(1);
					
				//Seat Data Equal to 0 in Data Base
				if(seatStatus == 0) 		
				{
					//Success
					//Query Update Night Seat = 1 in Data Base
					query="update CINEMA_NIGHT_SEATS set ROW_"+seatNumber+"='1' where MOVIECLASS ='"+row+"'";
					stmt = dao.getConnection().prepareStatement(query);										
					dao.updateTable(stmt);
					success = true;
				}
				else
				{
					//Fail
					success = false;
				}
			}
		}
		catch(SQLException ex) 
		{
			//Fail
			System.out.println(ex);
		}
		//Pass the Success and Show Time in SeatHandle
		seatSelection.seatSelectionHandle(success,showTime);
	}	
}
