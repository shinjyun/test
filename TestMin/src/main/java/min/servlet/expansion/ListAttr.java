package min.servlet.expansion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@WebServlet("/ListAttr")
public class ListAttr extends HttpServlet {
	private static Log log = LogFactory.getLog(ListAttr.class);
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 멀티 스레드에서는 반드시 다형성을 사용
		List<String> list = new ArrayList<String>();
		list.add("순두부");
		list.add("된장찌개");
		list.add("제육덮밥");
		
		request.setAttribute("list", list);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("./test/call.jsp");
		dispatcher.forward(request, response);
	}

	

}
