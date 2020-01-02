package problem.DDBoard;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.SqlMapConfig;
import problem.common.DBManager;

public class BoardDAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	List<BoardDTO> list = new ArrayList<>();
	BoardDTO bDto;
	int result;
	SqlSessionFactory sqlSessionFactory = SqlMapConfig.getSqlSession();
	SqlSession sqlSession;
	
	
	public void BoardInsert(BoardDTO bDto) {
		sqlSession = sqlSessionFactory.openSession(true);
		try {
			result = sqlSession.insert("board.insert", bDto);
			if(result > 0) {
				System.out.println("■■ \""+bDto.getTitle()+"\" 게시글을 등록하였습니다.");
			} else {
				System.out.println("■■ 게시글 등록 실패, 관리자에게 문의하세요.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	public void BoardUpdate(BoardDTO bDto) {
		sqlSession = sqlSessionFactory.openSession(true);
		try {
			result = sqlSession.update("board.update", bDto);
			if(result > 0) {
				System.out.println("■■ "+bDto.getBno()+ "번 게시글을 수정하였습니다.");
			} else {
				System.out.println("■■ 게시글 수정 실패, 관리자에게 문의하세요.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	public void BoardDelete(int bno) {
		sqlSession = sqlSessionFactory.openSession(true);
		try {
			result = sqlSession.delete("board.delete", bno);
			if(result > 0) {
				System.out.println("■■ "+bno+"번 게시글을 삭제하였습니다.");
			} else {
				System.out.println("■■ 게시글 삭제 실패, 관리자에게 문의하세요.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	public void BoardSelect() {
		sqlSession = sqlSessionFactory.openSession();
		try {
			list = sqlSession.selectList("board.selectAll");
			printQuery(list);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	public void BoardSearch(String keyword) {
		sqlSession = sqlSessionFactory.openSession();
		try {
			list = sqlSession.selectList("board.search", keyword);
			System.out.println("■■\""+keyword + "\"로 검색한 결과 총 " + list.size() +"건이 검색되었습니다.");
			printQuery(list);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		
	}
	public void BoardView(int bno) {
		// 상세게시글 조회수 +1 증가
		int result = viewCntPlus(bno);
		if(!(result > 0)) {
			System.out.println("■■ 조회수 증가 실패, 관리자에게 문의하세요.");
			return;
		} 
		// 상세게시글 출력
		sqlSession = sqlSessionFactory.openSession();
		try {
			bDto = sqlSession.selectOne("board.view", bno);
			
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("■■ 게시글 번호: "+bno);
			System.out.println("■■ 작성일자: "+ bDto.getRegdate());
			System.out.println("■■ 작성자: " + bDto.getWriter());
			System.out.println("■■ 조회수: " + bDto.getViewcnt());
			System.out.println("■■ 제목: "+bDto.getTitle());
			System.out.println("■■ 내용: "+bDto.getContent());
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		
	}
	public void BoardSort() {
		sqlSession = sqlSessionFactory.openSession();
		try {
			list = sqlSession.selectList("sort");
			printQuery(list);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	public int viewCntPlus(int bno) {
		sqlSession = sqlSessionFactory.openSession(true);
		try {
			result = sqlSession.update("board.viewcnt", bno);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return result;
	}
	
	// 조회된 결과를 출력하는 함수
	public void printQuery(List<BoardDTO> list) {
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■ 번호 \t 제목 \t 내용 \t 작성자 \t 작성일자");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		for (BoardDTO line : list) {
			System.out.println(line.toString());
		}
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	}
	
}







