package lecture_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JdbcEx02 {
	public static void main(String[] args) {
		// MariaDB Connection
		final String URL = "jdbc:mariadb://127.0.0.1:3306/chosun";
		final String USER = "root";
		final String PASSWORD = "1234";
		
		PreparedStatement pstmt = null;
		Connection conn = null;
		try {
			// MariaDB 드라이버 로드
			Class.forName("org.mariadb.jdbc.Driver");
			
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			if(conn != null) {
				System.out.println("연결 성공");
			}
			
			// DB에 저장
			//  CRUD
			//   - CREATE → SQL(INSERT)
			String sql = "INSERT INTO tbl_student "
					   + "VALUES(?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "1002");
			pstmt.setString(2, "최우진");
			pstmt.setInt(3,  4);
			
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("저장 성공");
			} else {
				System.out.println("저장 실패");
			}
			
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			// 자원 해제(반납)
			pstmt.close();
			conn.close();
		}
	}
}





//public void memberAdd(String id, String name, int age) {
//	// MariaDB Connection
//		final String URL = "jdbc:mariadb://127.0.0.1:3306/chosun";
//		final String USER = "root";
//		final String PASSWORD = "1234";
//		
//		PreparedStatement pstmt = null;
//		Connection conn = null;
//		try {
//			// MariaDB 드라이버 로드
//			Class.forName("org.mariadb.jdbc.Driver");
//			
//			conn = DriverManager.getConnection(URL, USER, PASSWORD);
//			if(conn != null) {
//				System.out.println("연결 성공");
//			}
//			
//			// DB에 저장
//			//  CRUD
//			//   - CREATE → SQL(INSERT)
//			String sql = "INSERT INTO tbl_student "
//					   + "VALUES(?, ?, ?)";
//			pstmt = conn.prepareStatement(sql);
//			
//			pstmt.setString(1, id);
//			pstmt.setString(2, name);
//			pstmt.setInt(3,  age);
//			
//			int result = pstmt.executeUpdate();
//			if(result > 0) {
//				System.out.println("저장 성공");
//			} else {
//				System.out.println("저장 실패");
//			}
//			
//		} catch(Exception e) {
//			System.out.println(e);
//		} finally {
//		// 자원 해제(반납)
//		pstmt.close();
//		conn.close();
//		}
//}










