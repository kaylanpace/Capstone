package buiding;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

//import workorder.WorkOrder;



@Entity
public class Building implements Serializable {
	private static final long serialVersionUID = 1L;
	 
    // Persistent Fields:
    @Id @GeneratedValue 
    Long Id;  
	String buildingName;
	@Temporal(TemporalType.DATE)
	Date checkCycle;
	String POC;
	String street;
	String city;
	String state;
	String country;
	int zip;

   

    // Constructors:
    public Building() {
    	
    }
    
  
 
    public Building(String buildingName, Date checkCycle, String POC, String street, String city, String state, int zip) {
       
        this.buildingName = buildingName;
        this.checkCycle = checkCycle;
        this.POC = POC;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        
        
        
    }
    
    //Access Methods
    public Long getId() {
		return Id;
	}



	public void setId(Long id) {
		Id = id;
	}



	public String getBuildingName() {
		return buildingName;
	}



	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}



	public Date getCheckCycle() {
		return checkCycle;
	}



	public void setCheckCycle(Date checkCycle) {
		this.checkCycle = checkCycle;
	}



	public String getPOC() {
		return POC;
	}



	public void setPOC(String pOC) {
		POC = pOC;
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public int getZip() {
		return zip;
	}



	public void setZip(int zip) {
		this.zip = zip;
	}

	// String Representation:
    @Override
    public String toString() {
        return  buildingName + " " + checkCycle
        		+ " " + POC + " " + street + " " + city + " " + state + " " + zip;
    }

}
