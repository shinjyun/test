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

public class DeptSelectController implements Controller {
	private static Log log = LogFactory.getLog(DeptSelectController.class);

	@Override
	public DeptHandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
		DeptDAO deptDao = new DeptDAO();
		DeptDTO deptDTO = new DeptDTO();
		log.info(deptDTO);
		ArrayList<DeptDTO> arrayList = new ArrayList<DeptDTO>();
		
		arrayList = deptDao.deptSelectAll();
		request.setAttribute("arrayList", arrayList);
		log.info(arrayList);
		
		DeptHandlerAdapter deptHandlerAdapter= new DeptHandlerAdapter();
		log.info("부서 정보 조회");
		
		deptHandlerAdapter.setPath("./dept/dept_select_view.jsp");
		return deptHandlerAdapter;
		
	}
	
	
}
