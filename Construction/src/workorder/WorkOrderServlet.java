package workorder;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import workorder.*;
import employee.*;

@WebServlet(name = "WorkOrderServlet", urlPatterns={"/workorder"})
public class WorkOrderServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	// Injected DAO EJB:
    @EJB WorkOrderDao workorderDao;
 
    @Override
    public void doGet(
        HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
        // Display the list of employees:
       request.setAttribute("workorders", workorderDao.getWorkOrders());
        request.getRequestDispatcher("/workorder.jsp").forward(request, response);
        return;
    }
    
    @Override
    protected void doPost(
        HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        // Handle a new work order:
    	workorderDao.openTransaction();
        String description = request.getParameter("description");
        String priorityLevel = request.getParameter("priorityLevel");
        String poc = request.getParameter("POC");
        String status = request.getParameter("status");
        //
//        String comments = request.getParameter("comments");
//        String totalWorkHours = request.getParameter("totalWorkHours");
//        String instruction = request.getParameter("instruction");
        if (description != null){
        	workorderDao.persist(new WorkOrder(description, priorityLevel, poc, status));
        	workorderDao.commitTransaction();
        }
       
        
        doGet(request, response);
    }
}
