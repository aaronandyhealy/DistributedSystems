package ie.gmit.sw.rmi;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.List;


import ie.gmit.sw.Model.Booking;

public class DatabaseServiceImpl extends UnicastRemoteObject implements DatabaseService {
	
	private static final long serialVersionUID = 1L;
	private Connection conn;
	private Statement stmt;

	protected DatabaseServiceImpl() throws RemoteException, SQLException {
		super();
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/carBookingSystem?useSSL=false", "root", "");
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Booking> read() throws SQLException {
		System.out.println("In read");

		stmt = conn.createStatement();

		List<Booking> List = new ArrayList<Booking>();
		String strSelect = "select * from bookings";
		
		ResultSet rset = stmt.executeQuery(strSelect);

		while (rset.next()) { 
			
			int BookingID = rset.getInt("BookingID");
			int CustID = rset.getInt("CustID");
			String hireDate = rset.getString("HireDate");
			String returnDate = rset.getString("ReturnDate");
			int CarID = rset.getInt("CarID");
			Booking s = new Booking(BookingID,CustID,hireDate,returnDate,CarID);
			List.add(s);	
		}
		return List;
	}
	
	@Override
	public void create(Booking booking) throws RemoteException, SQLException {
		
		
		System.out.println("In Create");
		stmt = conn.createStatement();
		String strSelect = "INSERT INTO Bookings(CustID,hireDate,returnDate,CarID) VALUES (" + booking.getCustID() + ",'" + booking.getHireDate() + "', '" + booking.getReturnDate() + "',"  +  booking.getCarID() + " );"; 
		stmt.execute(strSelect);
		
	}
	
	@Override
	public void delete(Booking booking) throws RemoteException, SQLException {
		
		
		System.out.println("In Delete");
		stmt = conn.createStatement();
		String strSelect = "DELETE FROM Bookings WHERE BookingID = "  + booking.getBookingID() + " ;"; 
		stmt.execute(strSelect);
		
	}
	
	@Override
	public void update(Booking booking) throws RemoteException, SQLException {
		
		
		System.out.println("In Update");
		stmt = conn.createStatement();
		String strSelect = "UPDATE bookings SET hireDate = '" + booking.getHireDate() + "', returnDate = '" + booking.getReturnDate() + "', carID = " + booking.getCarID() + "  WHERE CustID = " + booking.getCustID() +";";
		stmt.execute(strSelect);
		
	}
	
	
	
}


