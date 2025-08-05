/*
 * JDBC
 *  - JAVA와 DB를 연결해서 사용할 수 있도록 도와줌
 *  - 사용하는 DB의 Driver 파일 필수!
 * 
 */

package lecture_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcEx01 {
	public static void main(String[] args) {
		// MariaDB Connection
		final String URL = "jdbc:mariadb://127.0.0.1:3306/chosun";
		final String USER = "root";
		final String PASSWORD = "1234";
		
		try {
			// MariaDB 드라이버 로드
			Class.forName("org.mariadb.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			if(conn != null) {
				System.out.println("연결 성공");
			}
			
			// DB에 저장
			//  CRUD
			//   - CREATE → SQL(INSERT)
			Statement st = conn.createStatement();
			String sql = "INSERT INTO tbl_student "
					   + "VALUES('1001', '최철웅', 37)";
			int result = st.executeUpdate(sql);
			if(result > 0) {
				System.out.println("저장 성공");
			} else {
				System.out.println("저장 실패");
			}
			
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			
		}
	}
}








