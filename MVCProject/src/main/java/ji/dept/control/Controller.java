package ji.dept.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ji.dept.handler.DeptHandlerAdapter;

public interface Controller {
	public DeptHandlerAdapter execute(HttpServletRequest request, HttpServletResponse response);
}
