package ji.dept.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import ji.dept.control.Controller;
import ji.dept.dao.DeptDAO;
import ji.dept.dto.DeptDTO;
import ji.dept.handler.DeptHandlerAdapter;

public class DeptInsertController implements Controller {
	private static Log log = LogFactory.getLog(DeptInsertController.class);
	@Override
	public DeptHandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
		int deptno = Integer.parseInt(request.getParameter("deptno"));
		log.info(deptno);
		
		String dname = request.getParameter("dname");
		log.info(dname);
		
		String loc = request.getParameter("loc");
		log.info(loc);
		
		DeptDAO deptDao = new DeptDAO();
		DeptDTO deptDTO = new DeptDTO();
		ArrayList<DeptDTO> arrayList = new ArrayList<DeptDTO>();
		
		arrayList = deptDao.deptSelectAll();
		log.info(arrayList);
		request.setAttribute("arrayList", arrayList);
		
		deptDTO.setDeptno(deptno);
		deptDTO.setDname(dname);
		deptDTO.setLoc(loc);
		
		deptDTO = deptDao.deptInsert(deptDTO);
		log.info(deptDTO);
		
		request.setAttribute("deptDTO", deptDTO);
		log.info("부서 정보 등록");
		
		DeptHandlerAdapter deptHandlerAdapter= new DeptHandlerAdapter();
		
		deptHandlerAdapter.setPath("./dept/dept_insert_view.jsp");
		
		return deptHandlerAdapter;
		
		
		
	}

}
