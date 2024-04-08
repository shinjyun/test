package min.a.b;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@WebServlet("/CollectionInformation")
public class CollectionInformation extends HttpServlet {
	private static Log log = LogFactory.getLog(CollectionInformation.class);
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("순두부");
		arrayList.add("된장찌개");
		arrayList.add("제육덮밥");
		log.info(arrayList);
		
		request.setAttribute("menu", arrayList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("./test/collection_information.jsp");
		dispatcher.forward(request, response);
		
	}

}
