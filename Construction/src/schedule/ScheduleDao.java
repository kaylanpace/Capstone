package schedule;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

//import schedule.Schedule;

@Stateless
public class ScheduleDao {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("constructionPal.odb");
    EntityManager em = emf.createEntityManager();
    // Injected database connection:
   //@PersistenceContext private EntityManager em;
 
    public void openTransaction(){
    	em.getTransaction().begin();
    }
     public void commitTransaction(){
    	 em.getTransaction().commit();
    	// em.close();
     }
    // Stores a new Schedule:
    public void persist(Schedule schedule) {
    		em.persist(schedule);
    }
  

    // Retrieves all the schedules:
    public List<Schedule> getAllSchedules() {
        TypedQuery<Schedule> query = em.createQuery(
            "SELECT s FROM Schedule s ORDER BY s.Id", Schedule.class);
        return query.getResultList();
    }
    
    
}