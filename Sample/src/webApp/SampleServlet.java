package webApp;




import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet {
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");//setting the content type  
		PrintWriter pw=response.getWriter();//get the stream to write the data  
		  
		//writing html in the stream  
		pw.println("<html><body>");  
		pw.println("Welcome to servlet");  
		pw.println("</body></html>");  
		  
		pw.close();//closing the stream  
	}

}
