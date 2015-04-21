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

@WebServlet(name = "SuppliesServlet", urlPatterns={"/supplies"})
public class SuppliesServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	// Injected DAO EJB:
    @EJB SuppliesDao SuppliesDao;
 
    @Override
    public void doGet(
        HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
        // Display the list of supplies:
       request.setAttribute("supplies", SuppliesDao.getAllSupplies());
        request.getRequestDispatcher("/supplies.jsp").forward(request, response);
        return;
    }
    
    @Override
    protected void doPost(
        HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        // Handle new supplies:
    	SuppliesDao.openTransaction();
		
		String supplyName = request.getParameter("supplyName");
		Double quantity = Double.parseDouble(request.getParameter("quantity"));
		String UOM = request.getParameter("UOM");
		String description = request.getParameter("description");
		
		String expirationDatestr = request.getParameter("expirationDate");
        Date expirationDate = null;
        try {
        expirationDate = new SimpleDateFormat("MM-dd-yyyy").parse(expirationDatestr);
        }
        catch (ParseException e) {
        e.printStackTrace();
        }
		
		String vendorPOC = request.getParameter("vendorPOC");
		
		String checkCyclestr = request.getParameter("checkCycle");
        Date checkcycle = null;
        try {
        checkcycle = new SimpleDateFormat("MM-dd-yyyy").parse(checkCyclestr);
        }
        catch (ParseException e) {
        e.printStackTrace();
        }
		
        if (supplyName != null){
        	SuppliesDao.persist(new Supplies(supplyName, quantity, UOM, description, expirationDate, vendorPOC, checkCycle ));
        	SuppliestDao.commitTransaction();
        }
       
        
        doGet(request, response);
    }
}
