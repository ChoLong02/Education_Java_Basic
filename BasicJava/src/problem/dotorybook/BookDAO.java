package problem.dotorybook;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BookDAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	ArrayList<BookDTO> list = new ArrayList<>();
	
	public void bookInsert() {}
	public void bookUpdate() {}
	public void bookDelete() {}
	public void bookSelect() {
		try {
			conn = DBManager.getConnection();
			String sql = "SELECT * FROM tbl_book";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
			    String bno = rs.getString("bno");
			    String bname = rs.getString("bname");
			    int price = rs.getInt("price");
			    String company = rs.getString("company");
			    String writer = rs.getString("writer");
			    Date regdate = rs.getDate("regdate");
			    BookDTO bDto = new BookDTO(bno, bname, price, company, writer, regdate);
			    list.add(bDto);
			}
			for (BookDTO line : list) {
				System.out.print(line.getBno() + "\t");
				System.out.print(line.getBname() + "\t");
				System.out.print(line.getPrice() + "\t");
				System.out.print(line.getCompany() + "\t");
				System.out.print(line.getWriter() + "\t");
				System.out.print(line.getRegdate() + "\t");
				System.out.println();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
	public void bookSearch() {}
	public void madeBy() {}
}






