package controller.employeeBioData;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import model.dao.DAO;
import view.owner.EmployeeBioData;

public class EmployeeBioDataImplementation {
	
	//Object Creation
	DAO dao = new DAO();
	Scanner scanner = new  Scanner(System.in);
	EmployeeBioData employeeBioData = new EmployeeBioData();
	
	//Employee Bio Data Implementation with have Employee Nmae
	public void employeeBioDataImplementation(String emName) 
	{
		
		String name =null;
		String age = null;
		String password = null;
		String phoneNumber = null;
		
		boolean invalidName = false;
		
		//Qurey for Select All Employee Data from Data Base 
		String query ="SELECT * FROM SATHYAM_CINEMA_TABLE WHERE NAME = '"+emName+"'";
		
		//Object Creation
		DAO dao = new DAO();
		
		ResultSet resultSet = null;
		resultSet=dao.selectTable(query);
		try
		{
			//get Data from Data Base
			resultSet.next();
			name = resultSet.getString(1);
			age = resultSet.getString(2);
			password = resultSet.getString(3);
			phoneNumber = resultSet.getString(4);		
		}
		catch(SQLException ex) 
		{	
			//fail
			invalidName = true;
		}
		
		//Pass the Name ,Age ,Password  and PhoneNumber in Employee Boi Data 
		employeeBioData.employeeBioDataPrint(name, age, password, phoneNumber ,invalidName);		
	} 				
}
