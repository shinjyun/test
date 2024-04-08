package min.test.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import min.test.dto.MemberDTO;

@WebServlet("/Member")
public class Member extends HttpServlet {
	private static Log log = LogFactory.getLog(Member.class);
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
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setName(name);
		memberDTO.setId(id);
		memberDTO.setPassword(password);
		memberDTO.setGender(gender);
		memberDTO.setHobby(hobby);
		log.info(memberDTO);
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<title> 회원 정보 </title>");
		out.println("이름 : " + memberDTO.getName() + "<br>");
		out.println("아이디 : " + memberDTO.getId() + "<br>");
		out.println("패스워드 : " + memberDTO.getPassword() + "<br>");
		if (memberDTO.getGender().equals("m")) {
			out.println("성별 : 남자 <br> ");
		} else {
			out.println("성별 : 여자 <br> ");
		}
		out.println("취미 : " + memberDTO.getHobby());
	}

}
