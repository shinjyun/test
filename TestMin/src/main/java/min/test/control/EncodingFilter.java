package min.test.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import min.test.dto.ParameterDTO;

@WebServlet("/EncodingFilter")
public class EncodingFilter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		ParameterDTO parameterDTO = new ParameterDTO();
		parameterDTO.setName(name);
		parameterDTO.setAge(age);
		
		name = parameterDTO.getName();
		age = parameterDTO.getAge();
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("./encoding_filter_view.jsp");
		
		dispatcher.forward(request, response);
	}

}
