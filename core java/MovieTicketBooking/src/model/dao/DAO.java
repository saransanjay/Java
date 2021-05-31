package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAO {
		
	private Connection connection = null;
	private ResultSet resultSet = null;
	private int resultCode = 0;
	private String conUrl ="jdbc:oracle:thin:@localhost:1521:xe";
	private String conName="Saran";
	private String conPassword="root";
	private String conDriver ="oracle.jdbc.driver.OracleDriver";
	
	//get Connection
	public Connection getConnection() 
	{	
		try
		{		
			//convert ConDriver into Class
			Class.forName(conDriver);
			//Connect to Data Base
			connection = DriverManager.getConnection(conUrl, conName, conPassword);												
		}
		catch(Exception ex) 
		{
			//Fail
			System.out.println(ex);
		}
		
		return connection;
	}
	//Select Table
	public ResultSet selectTable(String query) 
	{
		try 
		{
			resultSet = getConnection().createStatement().executeQuery(query);
			
		}
		catch(Exception ex) 
		{
			System.out.println(ex);
		}
		//This Method Return the ResultSet(Data)
		return resultSet;
	}
	//Update ,Add, Remove Table
	public int updateTable(PreparedStatement statement) 
	{
		try 
		{
			resultCode = statement.executeUpdate();
		}
		catch(Exception ex)
		{
			//Fail
			System.out.println(ex);
		}
		//This method Return the ResultCode(Data Success)
		return resultCode;
	}
	//Close
	public void close() 
	{
		try
		{
			connection.close();
		}
		catch (SQLException ex) 
		{
			//Fail
			System.out.println(ex);		
		}
		
	}

}
