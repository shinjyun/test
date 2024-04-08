package min.a.b;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookCall")
public class CookCall extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		if (cookies == null) {
			// 이건 syso로 쓰면 안되고 log로 해야함
			// 개발자 확인용
			System.out.println("쿠키가 존재하지 않는다.");
			System.out.println(cookies);

		} else {
			// cook_info.jsp로 보내줘야 함
			// cookie는 배열로 되어 있음. for문으로 각각 불러오기
			for (int i = 0; i < cookies.length; i++) {
				String name = cookies[i].getName();
				System.out.println(name);
				request.setAttribute("name", name); // 문자열 형태
				
				String value = cookies[i].getValue();
				System.out.println(value);
				request.setAttribute("value", value);
			}
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("./cook_info.jsp");
		dispatcher.forward(request, response);
	}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//	}

}
