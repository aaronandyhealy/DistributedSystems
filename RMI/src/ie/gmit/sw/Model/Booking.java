//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.10 at 12:36:57 AM GMT 
//


package ie.gmit.sw.Model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CustID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HireDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReturnDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CarID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingID",
    "custID",
    "hireDate",
    "returnDate",
    "carID"
})
@XmlRootElement(name = "Booking")
public class Booking implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name = "BookingID")
    protected int bookingID;
    @XmlElement(name = "CustID")
    protected int custID;
    @XmlElement(name = "HireDate", required = true)
    protected String hireDate;
    @XmlElement(name = "ReturnDate", required = true)
    protected String returnDate;
    @XmlElement(name = "CarID")
    protected int carID;

    public Booking(int bookingID, int custID, String hireDate, String returnDate, int carID) {
		super();
		this.bookingID = bookingID;
		this.custID = custID;
		this.hireDate = hireDate;
		this.returnDate = returnDate;
		this.carID = carID;
	}
    

	public Booking(int custID, String hireDate, String returnDate, int carID) {
		super();
		this.custID = custID;
		this.hireDate = hireDate;
		this.returnDate = returnDate;
		this.carID = carID;
	}

	

	public Booking(int bookingID) {
		super();
		this.bookingID = bookingID;
	}
	
	public Booking() {
		super();
		
	}


	/**
     * Gets the value of the bookingID property.
     * 
     */
    public int getBookingID() {
        return bookingID;
    }

    /**
     * Sets the value of the bookingID property.
     * 
     */
    public void setBookingID(int value) {
        this.bookingID = value;
    }

    /**
     * Gets the value of the custID property.
     * 
     */
    public int getCustID() {
        return custID;
    }

    /**
     * Sets the value of the custID property.
     * 
     */
    public void setCustID(int value) {
        this.custID = value;
    }

    /**
     * Gets the value of the hireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHireDate() {
        return hireDate;
    }

    /**
     * Sets the value of the hireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHireDate(String value) {
        this.hireDate = value;
    }

    /**
     * Gets the value of the returnDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDate() {
        return returnDate;
    }

    /**
     * Sets the value of the returnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDate(String value) {
        this.returnDate = value;
    }

    /**
     * Gets the value of the carID property.
     * 
     */
    public int getCarID() {
        return carID;
    }

    /**
     * Sets the value of the carID property.
     * 
     */
    public void setCarID(int value) {
        this.carID = value;
    }

}
