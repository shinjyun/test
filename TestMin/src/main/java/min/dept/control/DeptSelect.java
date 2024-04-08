package min.dept.control;

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

import min.dept.dao.DeptDAO;
import min.dept.dto.DeptDTO;


@WebServlet("/DeptSelect")
public class DeptSelect extends HttpServlet {
	private static Log log = LogFactory.getLog(DeptSelect.class);
	
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DeptDAO deptDao = new DeptDAO();
		DeptDTO deptDTO = new DeptDTO();
		log.info(deptDTO);
		ArrayList<DeptDTO> arrayList = new ArrayList<DeptDTO>();
		
		arrayList = deptDao.deptSelectAll();
		log.info(arrayList);
		
		request.setAttribute("arrayList", arrayList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("./dept/dept_select_view.jsp");
		dispatcher.forward(request, response);
	}


}
