package ji.dept.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import ji.dept.control.Controller;
import ji.dept.dao.DeptDAO;
import ji.dept.dto.DeptDTO;
import ji.dept.handler.DeptHandlerAdapter;

public class DeptSelectDetailController implements Controller{
	private static Log log = LogFactory.getLog(DeptSelectDetailController.class);
	
	@Override
	public DeptHandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
		int deptno = Integer.parseInt(request.getParameter("deptno"));
		log.info(deptno);
		
		DeptDAO deptDao = new DeptDAO();
		DeptDTO deptDTO = new DeptDTO();
		
		deptDTO = deptDao.deptSelect(deptno);
		log.info(deptDTO);
		
		request.setAttribute("deptDTO", deptDTO);
		DeptHandlerAdapter deptHandlerAdapter = new DeptHandlerAdapter();
		log.info("특정 부서 조회");
		
		deptHandlerAdapter.setPath("./dept/dept_select_detail_view.jsp");
		return deptHandlerAdapter;
	}

	}

