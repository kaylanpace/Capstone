package schedule;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


@Entity
public class Schedule implements Serializable {
	private static final long serialVersionUID = 1L;
	 
    // Persistent Fields:
    @Id @GeneratedValue 
    Long Id;
    private Date startDate;
    private Date finishDate;
    private Date expectedFinish;

    // Constructors:
    public Schedule() {
    	
    }
    
  
 
    public Schedule(Date startDate, Date finishDate,  Date expectedFinish) {
       this.startDate = startDate;
       this.finishDate = finishDate;
       this.expectedFinish = expectedFinish;
        
    }
    
    //Access Methods
    public Date getStartDate()
    {
    	return startDate;
    }
    
    public Date getFinishDate()
    {
    	return finishDate;
    }
    
    public Date getExpectedFinish()
    {
    	return expectedFinish;
    }
		
	// String Representation:
    @Override
    public String toString() {
        return  startDate + " " + finishDate + " " + expectedFinish;
    }

}
