package equipment;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


@Entity
public class Equipment implements Serializable {
	private static final long serialVersionUID = 1L;
	 
    // Persistent Fields:
    @Id @GeneratedValue 
    Long Id;
    private String equipName;
    private String equipType;
    private String description;
    private String vendorPOC;
    private Date checkCycle;

    // Constructors:
    public Equipment() {
    	
    }
    
  
 
    public Equipment(String equipName, String equipType,  String description, String vendorPOC, Date checkCycle) {
       this.equipName = equipName;
       this.equipType = equipType;
       this.description = description;
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



	public String getEquipName() {
		return equipName;
	}



	public void setEquipName(String equipName) {
		this.equipName = equipName;
	}



	public String getEquipType() {
		return equipType;
	}



	public void setEquipType(String equipType) {
		this.equipType = equipType;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
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
        return  equipName + " " + equipType 
        		+ " " + description +  " " + vendorPOC + " " + checkCycle;
    }

}
