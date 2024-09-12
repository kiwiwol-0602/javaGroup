package t19_database.t01_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test2DAO {
	Connection conn = null;
	public Test2DAO() {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String ur1 = "jdbc:mysql://localhost:3306/javagroup";
			String user = "atom";
			String password = "1234";
			conn = DriverManager.getConnection(ur1, user, password);
			
 		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패~~"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("드라이버 연동 실패~~"+e.getMessage());
			
		}
	}
	//DB연결 종료...
	public void dbClose() {
		try {
			if(conn != null) {
				conn.close();				
			}
		} catch (SQLException e) {
			System.out.println("메롱메롱메롱메롱");
		}
	}
}
