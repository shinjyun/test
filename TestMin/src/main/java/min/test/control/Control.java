package min.test.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import min.test.dto.MemberDTO;

@WebServlet("/Control")
public class Control extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String[] hobbyAarray = request.getParameterValues("hobby");
		String hobby = "";
		for (int i = 0; i < hobbyAarray.length; i++) {
			hobby += hobbyAarray[i] + " ";
		}
		String age = request.getParameter("age");
		String birth = request.getParameter("birth");
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setName(name);
		memberDTO.setId(id);
		memberDTO.setPassword(password);
		memberDTO.setGender(gender);
		memberDTO.setHobby(hobby);
		memberDTO.setAge(Integer.parseInt(age));
		memberDTO.setBirth(birth);

		request.setAttribute("name", memberDTO.getName());
		request.setAttribute("id", memberDTO.getId());
		request.setAttribute("password", memberDTO.getPassword());
		request.setAttribute("gender", memberDTO.getGender());
		request.setAttribute("hobby", memberDTO.getHobby());
		request.setAttribute("age", memberDTO.getAge());
		request.setAttribute("birth", memberDTO.getBirth());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("./view/Output.jsp");
		
		dispatcher.forward(request, response);
	}
}
