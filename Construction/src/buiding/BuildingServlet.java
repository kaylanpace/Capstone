package buiding;

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

@WebServlet(name = "BuildingServlet", urlPatterns={"/building"})
public class BuildingServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	// Injected DAO EJB:
    @EJB BuildingDao BuildingDao;
 
    @Override
    public void doGet(
        HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
        // Display the list of buildings:
       request.setAttribute("builidng", BuildingDao.getAllBuildings());
        request.getRequestDispatcher("/building.jsp").forward(request, response);
        return;
    }
    
    @Override
    protected void doPost(
        HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        // Handle a new building:
    	BuildingDao.openTransaction();
        String buildingname = request.getParameter("buildingname");
        
        String startDateStr = request.getParameter("startDate");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date checkCycle = null;
		try {
			checkCycle = sdf.parse(startDateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        String poc = request.getParameter("POC");
        String street = request.getParameter("street");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		int zip = Integer.parseInt(request.getParameter("zip"));
		
        if (buildingname != null){
        	BuildingDao.persist(new Building(buildingname, checkCycle, poc, street, city, state, zip));
        	BuildingDao.commitTransaction();
        }
       
        
        doGet(request, response);
    }
}
