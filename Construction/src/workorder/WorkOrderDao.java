package workorder;

import java.util.List;




import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
 
@Stateless
public class WorkOrderDao {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("constructionPal.odb");
    EntityManager em = emf.createEntityManager();
    // Injected database connection:
   // @PersistenceContext private EntityManager em;
 
    public void openTransaction(){
    	em.getTransaction().begin();
    }
     public void commitTransaction(){
    	 em.getTransaction().commit();
    	 //em.close();
     }
    // Stores a new employee:
    public void persist(WorkOrder wo) {
    		em.persist(wo);
    }
    
    
 
    // Retrieves all the employee:
    public List<WorkOrder> getWorkOrders() {
        TypedQuery<WorkOrder> query = em.createQuery(
            "SELECT g FROM Employee g ORDER BY g.id", WorkOrder.class);
        return query.getResultList();
    }
    
    
}
