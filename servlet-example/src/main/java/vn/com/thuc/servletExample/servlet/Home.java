/**
 * 
 */
package vn.com.thuc.servletExample.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ledongthuc
 *
 */
public class Home extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		resp.setContentType("");
		ServletOutputStream responseStream = resp.getOutputStream();
		
		responseStream.println("<html>");
		
		responseStream.println("<head>");
		responseStream.println("</head>");
		
		responseStream.println("<body>");
		responseStream.println("<H1>Test</H1>");
		responseStream.println("</body>");
		
		responseStream.println("</html>");
		
	}
	
}
