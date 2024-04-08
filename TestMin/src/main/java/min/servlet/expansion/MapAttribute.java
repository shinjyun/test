package min.servlet.expansion;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@WebServlet("/MapAttribute")
public class MapAttribute extends HttpServlet {
	private static Log log = LogFactory.getLog(MapAttribute.class);
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("순두부", "5,000원");
		map.put("된장찌개", "6,000원");
		map.put("제육덮밥", "7,000원");
		log.info(map);
		
		request.setAttribute("map", map);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("./expansion/map_attribute.jsp");
		dispatcher.forward(request, response);
	}

}
