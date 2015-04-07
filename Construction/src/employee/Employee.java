package employee;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	 
    // Persistent Fields:
    @Id @GeneratedValue
    Long id;
    private String empFirstName;
    private String empLastName;
    private int ssn;
    private String position;
    private int age;
    private boolean isAdmin;
 
    // Constructors:
    public Employee() {
    }
 
    public Employee(String empFirstName, String empLastName, int ssn, String position, int age, boolean isAdmin ) {
       
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.ssn = ssn;
        this.position = position;
        this.age = age;
        this.isAdmin = isAdmin;
    }
 
    // String Representation:
    @Override
    public String toString() {
        return id + " " + empFirstName + " " + empLastName
        		+ " " + ssn + " " + position + " " + age + " " + isAdmin;
    }
}
