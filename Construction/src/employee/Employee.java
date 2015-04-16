package employee;

import java.io.Serializable;

import javax.persistence.*;

//import workorder.WorkOrder;



@Entity
//@Table(name="Employee")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	 
    // Persistent Fields:
    @Id @GeneratedValue 
    Long Id;
    
  
    private String empFirstName;
    

    private String empLastName;
    
    private int ssn;
 
    private String position;
    
    private int age;
    
    private boolean isAdmin;
   
	
    
   //Employee and WorkOrder Table join.
  /*  @ManyToOne(optional=true)
    @JoinColumn(name="workorderId", nullable=true, updatable=false)
    public workorder.WorkOrder workorder;*/
    
   
    
   
    // Constructors:
    public Employee() {
    	
    }
    
  
 
    public Employee(String empFirstName, String empLastName, int ssn, String position, int age, boolean isAdmin) {
       
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.ssn = ssn;
        this.position = position;
        this.age = age;
        this.isAdmin = isAdmin;
        
    }
    
    //Access Methods
 
  /*  public WorkOrder getWorkOrder() {
        return workorder;
    }
    
    public void setWorkOrder(WorkOrder workorder) {
        this.workorder = workorder;
    }*/


/*
	public Long getEmpId() {
		return empId;
	}



	public void setEmpId(Long empId) {
		this.empId = empId;
	}



	public String getEmpFirstName() {
		return empFirstName;
	}



	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}



	public String getEmpLastName() {
		return empLastName;
	}



	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}



	public int getSsn() {
		return ssn;
	}



	public void setSsn(int ssn) {
		this.ssn = ssn;
	}



	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		this.position = position;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public boolean isAdmin() {
		return isAdmin;
	}



	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}*/
	
	// String Representation:
    @Override
    public String toString() {
        return  empFirstName + " " + empLastName
        		+ " " + ssn + " " + position + " " + age + " " + isAdmin;
    }
}
