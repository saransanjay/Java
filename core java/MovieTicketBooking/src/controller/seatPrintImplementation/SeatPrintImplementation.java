package controller.seatPrintImplementation;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.dao.DAO;
import view.ticket.TicketPrint;

import java.util.TreeMap;

public class SeatPrintImplementation {
	
	private boolean freeSeat = false; 
	private String query = null;	
	private ResultSet resultSet = null;
	private int row1 = 0;
	private int row2 = 0;
	private int row3 = 0;
	private int row4 = 0;
	private int row5 = 0;
	private int row6 = 0;
	private int row7 = 0;
	private int row8 = 0;
	private int row9 = 0;
	private int row10 = 0;

	//Object Creation
	DAO dao = new DAO();
	TreeMap<Integer,Integer> trmap =new TreeMap<Integer,Integer>();
	TicketPrint ticketPrint = new TicketPrint();
	
	//Full Seat Detial with have Show Time
	public void fullSeatDetail(String showTime)
	{
		//Quert Select Row 1 to Row 10 Data from Data Base
		query ="SELECT row_1,row_2,row_3,row_4,row_5,row_6,row_7,row_8,row_9,row_10 FROM CINEMA_"+showTime+"_SEATS";
		try 
		{
			
			resultSet=dao.selectTable(query);
			int key = 0;
			
			//Loop get Next Column Data in Data Base
			while(resultSet.next()) 
			{
				//get Row 1 
				row1 = resultSet.getInt(1);
				//Free Seat Available
				if(row1==0)
				{
					freeSeat =true;
				}
				//Store Data in  Tree Map
				trmap.put(key,row1);
				key++;
				
				//get Row 2 
				row2 = resultSet.getInt(2);
				//Free Seat Available
				if(row1==0)
				{
					freeSeat =true;
				}
				//Store Data in  Tree Map
				trmap.put(key,row2);
				key++;
				
				//get Row 3 
				row3 = resultSet.getInt(3);
				//Free Seat Available
				if(row1==0)
				{
					freeSeat =true;
				}
				//Store Data in  Tree Map
				trmap.put(key,row3);
				key++; 
				
				//get Row 4 
				row4 = resultSet.getInt(4);
				//Free Seat Available
				if(row1==0)
				{
					freeSeat =true;
				}
				//Store Data in  Tree Map
				trmap.put(key,row4);
				key++;
				
				//get Row 5 
				row5 = resultSet.getInt(5);
				//Free Seat Available
				if(row1==0)
				{
					freeSeat =true;
				}
				//Store Data in  Tree Map
				trmap.put(key,row5);
				key++;
				
				//get Row 6 
				row6 = resultSet.getInt(6);
				//Free Seat Available
				if(row1==0)
				{
					freeSeat =true;
				}
				//Store Data in  Tree Map
				trmap.put(key,row6);
				key++;
				
				//get Row 7 
				row7 = resultSet.getInt(7);
				//Free Seat Available
				if(row1==0)
				{
					freeSeat =true;
				}
				//Store Data in  Tree Map
				trmap.put(key,row7);
				key++;
				
				//get Row 8 
				row8 = resultSet.getInt(8);
				//Free Seat Available
				if(row1==0)
				{
					freeSeat =true;
				}
				//Store Data in  Tree Map
				trmap.put(key,row8);
				key++;
				
				//get Row 9 
				row9 = resultSet.getInt(9);
				//Free Seat Available
				if(row1==0)
				{
					freeSeat =true;
				}
				//Store Data in  Tree Map
				trmap.put(key,row9);
				key++;
				
				//get Row 10 
				row10 = resultSet.getInt(10);
				//Free Seat Available
				if(row1==0)
				{
					freeSeat =true;
				}
				//Store Data in  Tree Map
				trmap.put(key,row10);
				key++;			
			}
		}
		catch(SQLException ex)
		{
			//Fail
			System.out.println(ex);
		}
		
		//Pass TreeMap Data(Full Seat Detial) and Show Time
		ticketPrint.seatPrint(trmap,showTime,freeSeat);		
	}
}
