package controller.loginValidation;

import java.sql.ResultSet;
import java.sql.SQLException;

//import main.SathyamCinema;
import model.dao.DAO;

public class LoginValidation {
	
	
	private String emQuery = null;
	private String owQuery = null;
	private String actualPassword = null;
	boolean isValidLogin = false;
	
	//Login Validation with have Name ,Password and Validation
	public boolean emLoginValidation(String Name,String Password ,boolean validation ) 
	{
		//Quert for Select Employee Password from in Data Base
		emQuery ="SELECT password FROM sathyam_cinema_table WHERE name ='"+Name+"'";
		//Quert for Select Onwer Password from in Data Base
		owQuery ="SELECT owner_password FROM sathyam_cinema_table WHERE name ='"+Name+"'";
		
		//Object Creation
		DAO dao = new DAO();
		ResultSet resultSet = null;
		
		try {	
			//Employee Login Validation
			if(validation)
			{				
				//Employee Success
				resultSet = dao.selectTable(emQuery);
				resultSet.next();
				actualPassword = resultSet.getString(1);
			}
			//Owner Login Validation
			else
			{
					//Owner Success
					resultSet = dao.selectTable(owQuery);	
					resultSet.next();
					actualPassword = resultSet.getString(1);				
			}			
		} 
		catch (SQLException ex) 
		{
			//Error
			System.out.println(ex);
		}
		
		
		//Login Success
		if(actualPassword != null && actualPassword.equals(Password))
		{
			
			isValidLogin = true;
		}
		//Login Fail 
		else
		{
			
			isValidLogin = false;
		}	
		//This Method Return the isValidLogin 
		return isValidLogin;				
	}
}
