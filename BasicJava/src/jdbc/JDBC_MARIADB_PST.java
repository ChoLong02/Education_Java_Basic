package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcEx01 {
    public static void main(String[] args) {
        // MariaDB 접속 정보
        String url = "jdbc:mariadb://127.0.0.1:3306/your_database"; // DB 이름 변경
        String user = "your_username";   // 사용자 이름
        String password = "your_password";  // 비밀번호

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // JDBC 드라이버 로딩
            Class.forName("org.mariadb.jdbc.Driver");

            // DB 연결
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("접속 성공!!!");

            // SQL 준비 (물음표로 값 위치 지정)
            String sql = "INSERT INTO tbl_study (id, name, age) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(sql);

            // 값 바인딩
            pstmt.setString(1, "5");
            pstmt.setString(2, "미경");
            pstmt.setInt(3, 24);

            // SQL 실행
            int result = pstmt.executeUpdate();
            if (result > 0) {
                System.out.println("등록 성공");
            } else {
                System.out.println("등록 실패");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
