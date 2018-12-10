package ie.gmit.sw.RestJersey;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.List;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ie.gmit.sw.Model.Booking;
import ie.gmit.sw.rmi.DatabaseService;


@Path("myresource")
public class MyResource {
	
   
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_XML)
    public List<Booking> getIt() throws MalformedURLException, RemoteException, Exception {
    	
    	DatabaseService ds;
    	ds = (DatabaseService) Naming.lookup("rmi://127.0.0.1:1099/database");

    	//ds.read();
        return ds.read();
    }
	
	
	@POST
	@Path("/createBooking")
	@Produces(MediaType.APPLICATION_XML)
    public void postIt(@FormParam("CustID") int CustID,@FormParam("HireDate") String HireDate,@FormParam("ReturnDate") String ReturnDate,@FormParam("CarID") int CarID) throws MalformedURLException, RemoteException, Exception {
    	
    	DatabaseService ds;
    	ds = (DatabaseService) Naming.lookup("rmi://127.0.0.1:1099/database");
    	//ds.read();
        ds.create(new Booking(CustID,HireDate,ReturnDate,CarID));
    }
	
	@POST
	@Path("/deleteBooking")
	@Produces(MediaType.APPLICATION_XML)
    public void deleteIt(@FormParam("BookingID") int BookingID )throws MalformedURLException, RemoteException, Exception {
    	
    	DatabaseService ds;
    	ds = (DatabaseService) Naming.lookup("rmi://127.0.0.1:1099/database");
    	
        ds.delete(new Booking(BookingID));
    }
	
	@POST
	@Path("/updateBooking")
	@Produces(MediaType.APPLICATION_XML)
    public void updateIt(@FormParam("CustID") int CustID,@FormParam("HireDate") String HireDate,@FormParam("ReturnDate") String ReturnDate,@FormParam("CarID") int CarID) throws MalformedURLException, RemoteException, Exception {
    	
    	DatabaseService ds;
    	ds = (DatabaseService) Naming.lookup("rmi://127.0.0.1:1099/database");
    	
        ds.update(new Booking(CustID,HireDate,ReturnDate,CarID));
    }

}
