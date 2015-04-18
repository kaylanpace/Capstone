package supplies;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


@Entity
public class Supplies implements Serializable {
	private static final long serialVersionUID = 1L;
	 
    // Persistent Fields:
    @Id @GeneratedValue 
    Long Id;
    private String supplyName;
    private double quantity;
    private String UOM;
    private String description;
    private Date expirationDate;
    private String vendorPOC;
    private Date checkCycle;

    // Constructors:
    public Supplies() {
    	
    }
    
  
 
    public Supplies(String supplyName, double quantity, String UOM, String description, Date expirationDate, String vendorPOC, Date checkCycle) {
       this.supplyName = supplyName;
       this.quantity = quantity;
       this.UOM = UOM;
       this.description = description;
       this.expirationDate = expirationDate;
       this.vendorPOC = vendorPOC;
       this.checkCycle = checkCycle;
       
        
    }
    
    //Access Methods
	public Long getId() {
		return Id;
	}



	public void setId(Long id) {
		Id = id;
	}



	public String getSupplyName() {
		return supplyName;
	}



	public void setSupplyName(String supplyName) {
		this.supplyName = supplyName;
	}



	public double getQuantity() {
		return quantity;
	}



	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}



	public String getUOM() {
		return UOM;
	}



	public void setUOM(String uOM) {
		UOM = uOM;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Date getExpirationDate() {
		return expirationDate;
	}



	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}



	public String getVendorPOC() {
		return vendorPOC;
	}



	public void setVendorPOC(String vendorPOC) {
		this.vendorPOC = vendorPOC;
	}



	public Date getCheckCycle() {
		return checkCycle;
	}



	public void setCheckCycle(Date checkCycle) {
		this.checkCycle = checkCycle;
	}

	
	// String Representation:
    @Override
    public String toString() {
        return  supplyName + " " + quantity + " "  + UOM
        		+ " " + description + " " + expirationDate + " " + vendorPOC + " " + checkCycle;
    }
}
