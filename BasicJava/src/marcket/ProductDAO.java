package marcket;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.SqlMapConfig;

public class ProductDAO {
	SqlSessionFactory sqlSessionFactory = SqlMapConfig.getSqlSession();
	SqlSession sqlSession;
	int result;
	List<ProductDTO> list;
	Boolean flag = false; // default: false
	
	// 제품 등록&추가 기능 작동시 기존에 등록된 제품인지 최초입고제품인지 판별하는 기능
	public boolean pdtAlready(String pname) {
		sqlSession = sqlSessionFactory.openSession();
		try {
			result = sqlSession.selectOne("pdt.already", pname);
			if(result > 0) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return flag;
	}
	
	// 기존에 등록된 제품 수량 추가
	public void cntPlusPdt(String pname, int cnt) {
		sqlSession = sqlSessionFactory.openSession(true);
		HashMap<String, Object> map = new HashMap<>();
		map.put("pname", pname);
		map.put("cnt", cnt);
		try {
			result = sqlSession.update("pdt.cntplus", map);
			if(result > 0) {
				System.out.println("▧▨ \""+pname+"\" 제품의 수량을 " + cnt +"개 추가하였습니다.");
			} else {
				System.out.println("▧▨  [Msg] Error, Contact your admin.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	// 신규상품 입고 등록
	public void insertPdt(ProductDTO pDto) {
		sqlSession = sqlSessionFactory.openSession(true);
		try {
			result = sqlSession.insert("pdt.insert", pDto);
			if(result > 0) {
				System.out.println("▧▨  \""+pDto.getPname()+"\"제품"+pDto.getCnt()+"개를 신규 등록하였습니다.");
			} else {
				System.out.println("▧▨  [Msg] Error, Contact your admin.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	// 제품 삭제
	public void deletePdt(String pname) {
		sqlSession = sqlSessionFactory.openSession(true);
		try {
			result = sqlSession.delete("pdt.delete", pname);
			if(result > 0) {
				System.out.println("▧▨  \""+pname+"\"제품을 삭제하였습니다.");
			} else {
				System.out.println("▧▨  [Msg] Error, Contact your admin.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	// 제품 전체 조회
	public void selectPdt() {
		sqlSession = sqlSessionFactory.openSession();
		try {
			list = sqlSession.selectList("pdt.select");
			printList(list);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	public void printList(List<ProductDTO> list) {
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ 제품번호 \t 제품명 \t 제조사 \t 가격 \t 재고 \t 입고일자 ▒▒");
		System.out.println("▒▒==================================================================================");
		for (ProductDTO line : list) {
			System.out.println("▒▒ "+line.toString());
		}
		System.out.println("▒▒==================================================================================");
		System.out.println("▒▒ 제품은 총 "+list.size()+"개 입니다.");
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
	}
}
