package min.servlet.expansion;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@WebServlet("/JoinMembership")
public class JoinMembership extends HttpServlet {
	private static Log log = LogFactory.getLog(JoinMembership.class);
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("./program/join_membership.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String[] hobbyAarray = request.getParameterValues("hobby");
		
		String hobby = "";
		for (int i = 0; i < hobbyAarray.length; i++) {
			hobby += hobbyAarray[i] + " ";
		}
		log.info(hobby);
		JoinMembershipDTO membershipDTO = new JoinMembershipDTO();
		
		membershipDTO.setName(name);
		membershipDTO.setId(id);
		membershipDTO.setPassword(password);
		membershipDTO.setGender(gender);
		membershipDTO.setHobby(hobby);
		log.info(membershipDTO);
		
		request.setAttribute("membershipDTO", membershipDTO);
		RequestDispatcher dispatcher = request.getRequestDispatcher("./program/join_membership_view.jsp");
		dispatcher.forward(request, response);
	}

}
