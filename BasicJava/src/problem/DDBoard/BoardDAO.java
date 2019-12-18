package problem.DDBoard;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import problem.common.DBManager;

public class BoardDAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	ArrayList<BoardDTO> list = new ArrayList<>();
	BoardDTO bDto;
	int result;
	
	public void BoardInsert() {}
	public void BoardUpdate() {}
	public void BoardDelete() {}
	public void BoardSelect() {
		try {
			conn = DBManager.getConnection();
			String sql = "SELECT * FROM tbl_board "
					   + "ORDER BY bno DESC";
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			list.clear();
			while(rs.next()) {
				int bno = rs.getInt("bno");
				String title = rs.getString("title");
				String content = rs.getString("content");;
				String writer = rs.getString("writer");
				int viewcnt = rs.getInt("viewcnt");
				Date regdate = rs.getDate("regdate");
				BoardDTO bDto = new BoardDTO(bno, title, content, writer, viewcnt, regdate);
				list.add(bDto);
			}
			printQuery(list);	
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
	public void BoardSearch(String keyword) {
		try {
			conn = DBManager.getConnection();
			String sql = "SELECT * " + 
					     "FROM tbl_board " + 
					     "WHERE title LIKE ? OR " + 
					     "content LIKE ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+keyword+"%");
			pstmt.setString(2, "%"+keyword+"%");
			
			rs = pstmt.executeQuery();
			
			list.clear();
			while(rs.next()) {
				int bno = rs.getInt("bno");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String writer = rs.getString("writer");
				int viewcnt = rs.getInt("viewcnt");
				Date regdate = rs.getDate("regdate");
				BoardDTO bDto = new BoardDTO(bno, title, content, writer, viewcnt, regdate);
				list.add(bDto);
			}
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("■■\""+keyword + "\"로 검색한 결과 총 " + list.size() +"건이 검색되었습니다.");
			printQuery(list);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
	}
	public void BoardView(int bno) {
		// 상세게시글 조회수 +1 증가
		int result = viewCntPlus(bno);
		if(!(result > 0)) {
			System.out.println("▨▧ 조회수 증가 실패, 관리자에게 문의하세요.");
			return;
		} 
		
		// 상세게시글 출력
		try {
			conn = DBManager.getConnection();
			String sql = "SELECT * " + 
					     "FROM tbl_board " + 
					     "WHERE bno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				bno = rs.getInt("bno");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String writer = rs.getString("writer");
				int viewcnt = rs.getInt("viewcnt");
				Date regdate = rs.getDate("regdate");
				bDto = new BoardDTO(bno, title, content, writer, viewcnt, regdate);
			}
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("■■ 게시글 번호: "+bno);
			System.out.println("■■ 작성일자: "+ bDto.getRegdate());
			System.out.println("■■ 작성자: " + bDto.getWriter());
			System.out.println("■■ 조회수: " + bDto.getViewcnt());
			System.out.println("■■ 제목: "+bDto.getTitle());
			System.out.println("■■ 내용: "+bDto.getContent());
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
	}
	public void BoardSort() {
		try {
			conn = DBManager.getConnection();
			String sql = "SELECT * FROM tbl_board "
					   + "ORDER BY regdate DESC";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			list.clear();
			while(rs.next()) {
				int bno = rs.getInt("bno");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String writer = rs.getString("writer");
				int viewcnt = rs.getInt("viewcnt");
				Date regdate = rs.getDate("regdate");
				bDto = new BoardDTO(bno, title, content, writer, viewcnt, regdate);
				list.add(bDto);
			}
			printQuery(list);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
	
	public int viewCntPlus(int bno) {
		try {
			conn = DBManager.getConnection();
			String sql = "UPDATE tbl_board " + 
					     "   SET viewcnt = viewcnt + 1 " + 
					     " WHERE bno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
		return result;
	}
	
	// 조회된 결과를 출력하는 함수
	public void printQuery(ArrayList<BoardDTO> list) {
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■ 번호 \t 제목 \t 내용 \t 작성자 \t 작성일자");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		for (BoardDTO line : list) {
			System.out.println(line.toString());
		}
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	}
	
}







