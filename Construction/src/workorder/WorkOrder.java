package workorder;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
//@Table(name="WorkOrder")
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
  


  public WorkOrder(String empFirstName, String empLastName, int ssn, String position, int age, boolean isAdmin) {
     
      this.description = description;
      this.priorityLevel = priorityLevel;
      this.POC = POC;
      this.status = status;
    
      
  }
  
	
	// String Representation:
  @Override
  public String toString() {
      return  description + " " + priorityLevel
      		+ " " + POC + " " + status;
  }
}
