package min.login.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import min.test.dto.MemberDTO;


@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String save = request.getParameter("save");
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId(id);
		memberDTO.setPassword(password);
		
		id = memberDTO.getId();
		password = memberDTO.getPassword();
		if (id.equals("minhaett") & password.equals("1234")) {
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("id", id);
			
			if (save != null) {
				Cookie cookie = new Cookie("id", id);
				cookie.setMaxAge(60 * 60 * 24);
				cookie.setPath("/");
				response.addCookie(cookie);
			}
			response.sendRedirect("./login_cookie/preference_select.jsp?id=" + id);
		} else {
			response.sendRedirect("./login_cookie/logcheck.jsp?id=" + id);
		}
		
	}

}
