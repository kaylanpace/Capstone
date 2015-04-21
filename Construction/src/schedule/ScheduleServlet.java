package schedule;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import workorder.*;
import employee.*;

@WebServlet(name = "ScheduleServlet", urlPatterns={"/schedule"})
public class ScheduleServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	// Injected DAO EJB:
    @EJB ScheduleDao ScheduleDao;
 
    @Override
    public void doGet(
        HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
        // Display the list of schedules:
       request.setAttribute("schedules", ScheduleDao.getAllSchedules());
        request.getRequestDispatcher("/schedule.jsp").forward(request, response);
        return;
    }
    
    @Override
    protected void doPost(
        HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        // Handle a new schedule:
    	ScheduleDao.openTransaction();
		
        String startDatestr = request.getParameter("startDate");
        Date startDate = null;
        try {
        startDate = new SimpleDateFormat("MM-dd-yyyy").parse(startDatestr);
        }
        catch (ParseException e) {
        e.printStackTrace();
        }
		
		String finishDatestr = request.getParameter("finishDate");
        Date finishDate = null;
        try {
        finishDate = new SimpleDateFormat("MM-dd-yyyy").parse(finishDatestr);
        }
        catch (ParseException e) {
        e.printStackTrace();
        }
		
		String expectedFinishstr = request.getParameter("expectedFinish");
        Date expectedFinish = null;
        try {
        expectedFinish = new SimpleDateFormat("MM-dd-yyyy").parse(expectedFinishstr);
        }
        catch (ParseException e) {
        e.printStackTrace();
        }
		
        if (startDate != null){
        	ScheduleDao.persist(new Schedule(startDate, finishDate, expectedFinish));
        	ScheduleDao.commitTransaction();
        }
       
        
        doGet(request, response);
    }
}
