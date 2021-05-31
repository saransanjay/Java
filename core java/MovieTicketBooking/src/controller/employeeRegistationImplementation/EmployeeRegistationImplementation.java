package controller.employeeRegistationImplementation;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.dao.DAO;

public class EmployeeRegistationImplementation {
	
	private String query = null;
	private PreparedStatement stmt = null;
	
	//Object Creation
	DAO  dao = new DAO(); 
	
	//Data Insert with have Name ,Age , Password and Phone Number
	public int dataInsert(String name ,String age ,String password ,String phoneNumber )
	{
		//Qyery for Insert Employee Name , Age , Password and Phone Number in Data Base
		query = "INSERT INTO sathyam_cinema_table values(?,?,?,?,?)";
		try 
		{
			//Insert Data in Data Base
			stmt = dao.getConnection().prepareStatement(query);
			stmt.setString(1,name);
			stmt.setString(2,age);
			stmt.setString(3, password);
			stmt.setString(4,phoneNumber);
			stmt.setString(5, null);
						
		}
		catch (SQLException e) 
		{
			//Error
			e.printStackTrace();
		}
		
		//This Method Return the Result Code in DAO
		return dao.updateTable(stmt);
	}
}
