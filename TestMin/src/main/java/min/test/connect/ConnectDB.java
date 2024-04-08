package min.test.connect;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@WebServlet("/ConnectDB")
public class ConnectDB extends HttpServlet {
	private static Log log = LogFactory.getLog(ConnectDB.class);
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "scott";
		String passwd = "tiger";
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		try {
			Class.forName(driver);
			DriverManager.getConnection(url, userid, passwd);
			
			out.println("<title> 데이터베이스 연결 </title>");
			out.println("데이터베이스와 연결되었습니다.");
			out.close();
		} catch (SQLException e) {
			log.info("데이터베이스 연결 실패 - " + e);
		} catch(ClassNotFoundException e) {
			log.info("클래스 파일 등록 실패 - " + e);
		}
	}

}
