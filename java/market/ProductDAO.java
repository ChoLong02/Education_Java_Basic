package market;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.SqlMapConfig;

public class ProductDAO {
	SqlSessionFactory sqlSessionFactory = SqlMapConfig.getSqlSession();
	SqlSession sqlSession;
	int result;
	List<ProductDTO> list;
	
	// 제품 등록
	public void insertProduct(ProductDTO pDto) {
		sqlSession = sqlSessionFactory.openSession(true);
		
		try {
			result = sqlSession.insert("pdt.insert", pDto);
			if (result > 0) {
				System.out.println("MSG: 제품 신규등록 완료");
			} else {
				System.out.println("ERROR: 제품 등록 실패");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	// 제품 조회
	public void selectProduct() {
		sqlSession = sqlSessionFactory.openSession(true);
		try {
			list = sqlSession.selectList("pdt.select");
			viewData(list);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	// 제품 검색
	public void searchProduct(String keyword) {
		sqlSession = sqlSessionFactory.openSession(true);
		try {
			/*
			 * 검색은 크게 2가지
			 *   1. 키워드랑 완벽하게 동일한 검색
			 *     - SELECT~WHERE절
			 *   2. 키워드가 포함된 값을 검색
			 *     - SELECT~WHERE~LIKE절
			 */
			list = sqlSession.selectList("pdt.search", keyword);
			viewData(list);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	// 제품 삭제
	public void deleteProduct(int pno) {
		sqlSession = sqlSessionFactory.openSession(true);
		try {
			result = sqlSession.delete("pdt.delete", pno);
			if (result > 0) {
				System.out.println("MSG: 제품 삭제 완료");
			} else {
				System.out.println("ERROR: 제품 삭제 실패");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	// 제품 가격 수정
	public void updateProduct(ProductDTO pDto) {
		sqlSession = sqlSessionFactory.openSession(true);
		try {
			result = sqlSession.update("pdt.update", pDto);
			if (result > 0) {
				System.out.println("MSG: 제품 수정 완료");
			} else {
				System.out.println("ERROR: 제품 수정 실패");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	// 전체 데이터 출력
	public void viewData(List<ProductDTO> list) {
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■ 제품번호 \t 제품명 \t 가격 \t 수량 \t 입고일자 ■■");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		for (ProductDTO line : list) {
			System.out.println("■■ " + line.toString());
		}
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■ 제품은 총 " + list.size() + "개 입니다.");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	}
	
}














