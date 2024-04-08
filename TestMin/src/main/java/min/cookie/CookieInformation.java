package min.cookie;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieInformation")
public class CookieInformation extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		if (cookies == null) {
		} else {
			for (int i = 0; i < cookies.length; i++) {
				String name = cookies[i].getName();
				request.setAttribute("name", name);
				
				String value = cookies[i].getValue();
				request.setAttribute("value", value);
				
			}
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(".cookie//cookie_information.jsp");
		dispatcher.forward(request, response);
		
	}


}
