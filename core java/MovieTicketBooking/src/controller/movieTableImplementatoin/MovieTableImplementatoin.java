package controller.movieTableImplementatoin;

import java.sql.PreparedStatement;

import view.employee.MovieTable;
import view.ticket.MovieSelection;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.dao.DAO;

public class MovieTableImplementatoin {
	
	String query = null;
	ResultSet resultSet= null;
	String dbMovieName = null;
	private PreparedStatement stmt = null;
	
	//Movie Table Implementation with have Show time , operation and Movie Name 
	public void movieTable(String showTime,String operation,String movieName)
	{
		//Object Creation
		DAO dao = new DAO();	
		MovieTable movieTable = new MovieTable();
		MovieSelection movieSelection =  new MovieSelection();
		
		boolean success = false;
		boolean ticketSuccess = false;
		
		try
		{	
			//Query for Select Movie Name with Selected Show Time in Data Base 
			query="SELECT MOVIE_NAME  FROM SATHYAM_CINEMA_TABLE_MOVIES WHERE SHOW_TIMING ='"+showTime+"'";
			resultSet = dao.selectTable(query);
			resultSet.next();
			dbMovieName=resultSet.getString(1);
			
			//Add Operation
			if(operation.equals("1"))				
			{	
				//Movie is Empty
				if(dbMovieName==null)
				{
					//Success
					//Query for Update Data in Data Base
					query ="UPDATE SATHYAM_CINEMA_TABLE_MOVIES SET MOVIE_NAME ='"+movieName+"'"+"WHERE SHOW_TIMING ='"+showTime+"'";
					stmt = dao.getConnection().prepareStatement(query);										
					dao.updateTable(stmt);
					success = true;
				}
				else 
				{
					//Fail
					success = false;					
				}
				//Pass Success and operation in Movie Table Handle
				movieTable.movieTableHandle(success, operation);
			}	
			//Remove Operation
			else if(operation.equals("2")) 
			{
				//Movie is Not Empty
				if(dbMovieName!=null)
				{
					//Success
					//Query for Update Data in Data Base
					query="UPDATE SATHYAM_CINEMA_TABLE_MOVIES SET MOVIE_NAME =null WHERE SHOW_TIMING ='"+showTime+"'";
					stmt = dao.getConnection().prepareStatement(query);	
					success = true;				
					dao.updateTable(stmt);
				}
				else 
				{
					//Fail
					success = false;
				}
				//Pass Success and operation in Movie Table Handle
				movieTable.movieTableHandle(success, operation);
			}	
			//Update Operation
			else if(operation.equals("3"))
			{		
				//Movie is Not Empty
				if(dbMovieName!=null)
				{
					//Success
					//Query for Update Data in Data Base
					query ="UPDATE SATHYAM_CINEMA_TABLE_MOVIES SET MOVIE_NAME ='"+movieName+"'"+"WHERE SHOW_TIMING ='"+showTime+"'";
					stmt = dao.getConnection().prepareStatement(query);					
					success = true;
					dao.updateTable(stmt);
				}
				else 
				{
					//Fail
					success = false;
				}
				//Pass Success and operation in Movie Table Handle
				movieTable.movieTableHandle(success, operation);
			}
			//Clear Seat
			else if(operation.equals("4"))
			{
				//Success
				//Query for Update to Clear the Seat in Data Base
				
				//A ROW
				query ="Update CINEMA_"+showTime+"_SEATS set ROW_1 = '0',ROW_2= '0',ROW_3= '0',ROW_4= '0',ROW_5= '0',ROW_6= '0',ROW_7= '0',ROW_8= '0',ROW_9= '0',ROW_10 = '0'  where MOVIECLASS ='A'";
				stmt = dao.getConnection().prepareStatement(query);					
				success = true;
				dao.updateTable(stmt);
				
				//B ROW
				query ="Update CINEMA_"+showTime+"_SEATS set ROW_1 = '0',ROW_2= '0',ROW_3= '0',ROW_4= '0',ROW_5= '0',ROW_6= '0',ROW_7= '0',ROW_8= '0',ROW_9= '0',ROW_10 = '0'  where MOVIECLASS ='B'";
				stmt = dao.getConnection().prepareStatement(query);					
				success = true;
				dao.updateTable(stmt);
				
				//C ROW
				query ="Update CINEMA_"+showTime+"_SEATS set ROW_1 = '0',ROW_2= '0',ROW_3= '0',ROW_4= '0',ROW_5= '0',ROW_6= '0',ROW_7= '0',ROW_8= '0',ROW_9= '0',ROW_10 = '0'  where MOVIECLASS ='C'";
				stmt = dao.getConnection().prepareStatement(query);					
				success = true;
				dao.updateTable(stmt);
				
				//D ROW
				query ="Update CINEMA_"+showTime+"_SEATS set ROW_1 = '0',ROW_2= '0',ROW_3= '0',ROW_4= '0',ROW_5= '0',ROW_6= '0',ROW_7= '0',ROW_8= '0',ROW_9= '0',ROW_10 = '0'  where MOVIECLASS ='D'";
				stmt = dao.getConnection().prepareStatement(query);					
				success = true;
				dao.updateTable(stmt);
				
				//E ROW
				query ="Update CINEMA_"+showTime+"_SEATS set ROW_1 = '0',ROW_2= '0',ROW_3= '0',ROW_4= '0',ROW_5= '0',ROW_6= '0',ROW_7= '0',ROW_8= '0',ROW_9= '0',ROW_10 = '0'  where MOVIECLASS ='E'";
				stmt = dao.getConnection().prepareStatement(query);					
				success = true;
				dao.updateTable(stmt);
				
				//Pass Success and operation in Movie Table Handle
				movieTable.movieTableHandle(success, operation);
			}
			//Ticket Movie Handel
			else
			{
				//Movie is Not Empty
				if(dbMovieName!=null) 
				{
					//Success
					ticketSuccess = true;
				}
				else 
				{
					//Fail
					ticketSuccess = false;
				}
				//Pass TicketSuccess ,ShowTime MovieName in Ticket Movie Handle
				movieSelection.movieHandel(ticketSuccess, showTime, dbMovieName);
			}
		}
		catch(SQLException ex)
		{
			//Fail
			System.out.println(ex);
		}
		
	}
}
