package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcEx01 {
    public static void main(String[] args) {
        // MariaDB 접속 정보
        String url = "jdbc:mariadb://127.0.0.1:3306/your_database"; // 데이터베이스 이름으로 수정
        String user = "your_username";  // 사용자 이름으로 수정
        String password = "your_password";  // 비밀번호로 수정

        try {
            // MariaDB 드라이버 로딩
            Class.forName("org.mariadb.jdbc.Driver");

            // 연결
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("접속 성공!!!");

            // SQL 실행
            Statement st = conn.createStatement();
            String sql = "INSERT INTO tbl_study VALUES('5', '미경', 24)";
            int result = st.executeUpdate(sql);

            if (result > 0) {
                System.out.println("등록 성공");
            } else {
                System.out.println("등록 실패");
            }

            st.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
