package ie.gmit.sw.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import ie.gmit.sw.Model.Booking;



public interface DatabaseService extends Remote {
	public List<Booking> read() throws RemoteException, SQLException;
	public void create(Booking booking) throws RemoteException, SQLException;
	public void delete(Booking booking) throws RemoteException, SQLException;
	public void update(Booking booking) throws RemoteException, SQLException;
}
