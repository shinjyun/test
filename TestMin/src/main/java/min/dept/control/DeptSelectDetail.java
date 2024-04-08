package min.dept.control;

import java.io.IOException;

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

@WebServlet("/DeptSelectDetail")
public class DeptSelectDetail extends HttpServlet {
	private static Log log = LogFactory.getLog(DeptSelect.class);
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int deptno = Integer.parseInt(request.getParameter("deptno"));
		log.info(deptno);
		DeptDAO deptDao = new DeptDAO();
		DeptDTO deptDTO = new DeptDTO();
		
		deptDTO = deptDao.deptSelect(deptno);
		
		request.setAttribute("dname", deptDTO.getDname());
		request.setAttribute("loc", deptDTO.getLoc());
		RequestDispatcher dispatcher = request.getRequestDispatcher("./dept/dept_select_detail_view.jsp");
		dispatcher.forward(request, response);
	}

}
