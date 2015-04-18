package workorder;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class WorkOrder implements Serializable {
	private static final long serialVersionUID = 1L;
	 
    // Persistent Fields:
    @Id @GeneratedValue
    Long Id;
	private String description;
	private String priorityLevel;
    private String POC;
    private String status;
    
    public Long getWorkorderId() {
		return Id;
	}
    
	public void setWorkorderId(Long Id) {
		this.Id = Id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPriorityLevel() {
		return priorityLevel;
	}

	public void setPriorityLevel(String priorityLevel) {
		this.priorityLevel = priorityLevel;
	}

	public String getPOC() {
		return POC;
	}

	public void setPOC(String pOC) {
		POC = pOC;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
    
    // Constructors:
    public WorkOrder() {
    }
    
 // Constructors:
    public WorkOrder(String description, String priorityLevel, String POC, String status) {
    	//this.workorderId = workorderId;
    	this.description = description;
    	this.priorityLevel = priorityLevel;
    	this.POC = POC;
    	this.status = status;
    }
    
    @Override
    public String toString() {
        return description + " " + priorityLevel + " " + POC + " " + status;
    }
}
