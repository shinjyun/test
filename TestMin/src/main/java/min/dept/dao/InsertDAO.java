package min.dept.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import min.dept.dto.DeptDTO;

public class InsertDAO {
	private static Log log = LogFactory.getLog(InsertDAO.class);
	
	public DeptDTO insert(int deptno, String dname, String loc) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		DeptDTO deptDTO = new DeptDTO();
		deptDTO.setDeptno(deptno);
		deptDTO.setDname(dname);
		deptDTO.setLoc(loc);
		log.info(deptDTO);
		
		try {
			Context context = new InitialContext();
			DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc");
			connection = dataSource.getConnection();
			String sql = "insert into dept (deptno, dname, loc)";
			sql += " values (?, ?, ?)";
			log.info("SQL 확인 - " + sql);
			
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, deptDTO.getDeptno());
			preparedStatement.setString(2, deptDTO.getDname());
			preparedStatement.setString(3, deptDTO.getLoc());
			
			preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			log.info("부서 입력 실패 - " + e);
		} finally {
			try {
				preparedStatement.close(); connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return deptDTO;
		
	}
}
