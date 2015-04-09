package workorder;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class WorkOrder implements Serializable {
	private static final long serialVersionUID = 1L;
	 
    // Persistent Fields:
    @Id @GeneratedValue
    Long workorderId;
    private String description;
    private String priorityLevel;
    private String POC;
    private String status;
    
    // Constructors:
    public WorkOrder() {
    }
    
 // Constructors:
    public WorkOrder(Long workorderId, String description, String priorityLevel, String POC, String status) {
    	this.workorderId = workorderId;
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
