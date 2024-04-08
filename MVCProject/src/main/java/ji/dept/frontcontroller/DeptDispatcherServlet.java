package ji.dept.frontcontroller;

import java.io.IOException;
import java.lang.ModuleLayer.Controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import ji.dept.controller.DeptDeleteController;
import ji.dept.controller.DeptInsertController;
import ji.dept.controller.DeptSelectController;
import ji.dept.controller.DeptSelectDetailController;
import ji.dept.controller.DeptUpdateController;
import ji.dept.controller.DeptUpdateViewController;
import ji.dept.handler.DeptHandlerAdapter;

@WebServlet("/DeptDispatcherServlet")
public class DeptDispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Log log = LogFactory.getLog(DeptDispatcherServlet.class);
    
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String pathURL = requestURI.substring(contextPath.length());
		log.info("매핑명 조회 - " + pathURL);
		
		DeptHandlerAdapter deptHandlerAdapter = null;
		ji.dept.control.Controller controller = null;
		
		if (pathURL.equals("/DeptSelect.do")) {
			controller = new DeptSelectController();
			deptHandlerAdapter = controller.execute(request, response);
			log.info("부서 조회 확인 - " + deptHandlerAdapter);
		}
		else if (pathURL.equals("/DeptSelectDetail.do")) {
			controller = new DeptSelectDetailController();
			deptHandlerAdapter = controller.execute(request, response);
			log.info("상세 부서 조회 확인 - " + deptHandlerAdapter);
		}
		else if (pathURL.equals("/DeptInsertView.do")) {
			deptHandlerAdapter = new DeptHandlerAdapter();
			deptHandlerAdapter.setPath("./dept/dept_insert.jsp");
			log.info("부서 등록 화면 뷰 확인 - " + deptHandlerAdapter);
		}
		else if (pathURL.equals("/DeptInsert.do")) {
			controller = new DeptInsertController();
			deptHandlerAdapter = controller.execute(request, response);
			log.info("부서 등록 확인 - " + deptHandlerAdapter);
		}
		else if (pathURL.equals("/DeptUpdateView.do")) {
			controller = new DeptUpdateViewController();
			deptHandlerAdapter = controller.execute(request, response);
			log.info("부서 수정 화면 뷰 확인 - " + deptHandlerAdapter);
		}
		else if (pathURL.equals("/DeptUpdate.do")) {
			controller = new DeptUpdateController();
			deptHandlerAdapter = controller.execute(request, response);
			log.info("부서 수정 확인 - " + deptHandlerAdapter);
		}
		else if (pathURL.equals("/DeptDeleteView.do")) {
			deptHandlerAdapter = new DeptHandlerAdapter();
			deptHandlerAdapter.setPath("/WEB-INF/view/dept/dept_delete.jsp");
			log.info("부서 삭제 화면 뷰 확인 - " + deptHandlerAdapter);
		}
		else if (pathURL.equals("/DeptDelete.do")) {
			controller = new DeptDeleteController();
			deptHandlerAdapter = controller.execute(request, response);
			log.info("부서 삭제 확인 - " + deptHandlerAdapter);
		}
		
		if (deptHandlerAdapter != null) {
			if (deptHandlerAdapter.isRedirect()) {
				response.sendRedirect(deptHandlerAdapter.getPath());
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(deptHandlerAdapter.getPath());
				dispatcher.forward(request, response);
			}
		}
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

}
