package controller.moviePrintImplementation;

import java.sql.ResultSet;
import java.sql.SQLException;
import view.employee.MoviePrint;
import model.dao.DAO;

public class MoviePrintInplementation {

	private ResultSet resultSet = null; 
	private String movie1 = null;
	private String movie2 = null;
	private String movie3 = null;
	private String movie4 = null;
	private String query = null;
	
	//Get Movie
	public void getMovie()
	{
		//Object Creation
		DAO dao = new DAO();
		MoviePrint moviePrint = new MoviePrint();
		
		//Query for Select Movie Name From Data Base 
		query ="SELECT MOVIE_NAME FROM SATHYAM_CINEMA_TABLE_MOVIES";
		try
		{
			//get Movie Name in Data Base	
			resultSet = dao.selectTable(query);
			resultSet.next();
			movie1 = resultSet.getString(1);
			resultSet.next();
			movie2 = resultSet.getString(1);
			resultSet.next();
			movie3 = resultSet.getString(1);
			resultSet.next();
			movie4 = resultSet.getString(1);
    	}
		catch(SQLException ex)
		{	
			//Fail
			System.out.println(ex);
		}
		//Pass All Movie Name in Movie Print for Current Running print
		moviePrint.currentMovie(movie1, movie2, movie3, movie4);
	}
}
