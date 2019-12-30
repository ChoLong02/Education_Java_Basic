package problem.bank;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.SqlMapConfig;

public class BankDAO {
	// MyBatis 세팅값 호출
	// Session을 생성하는 공장을 만드는 과정
	SqlSessionFactory sqlSessionFactory = SqlMapConfig.getSqlSession();
	
	// mapper에 접근하기 위한 SqlSession
	SqlSession sqlSession;
	
	List<BankDTO> list2;
	int result;
	
	// 신규계좌 개설
	public void insertBank(String bname, String pw) {
		sqlSession = sqlSessionFactory.openSession(true);
		
		try {
			BankDTO bDto = new BankDTO(bname, pw);
			result = sqlSession.insert("insertBank", bDto);
			// sqlSession.commit();
			if(result > 0) {
				System.out.println("■■ " + bname + "님 신규계좌를 개설하였습니다.");
			} else {
				System.out.println("■■ 계좌개설에 실패하였습니다. 관리자에게 문의해주세요.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	
	// 계좌 전체 조회
	public void selectBank() {
		sqlSession = sqlSessionFactory.openSession();
		
		try {
			list2 = sqlSession.selectList("selBank");
			
			for (BankDTO line : list2) {
				System.out.println(line.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	public void selectAccount(int bno, String pw) {
		sqlSession = sqlSessionFactory.openSession();
		try {
			BankDTO bDto = new BankDTO(bno, pw);
			bDto = sqlSession.selectOne("selectAccount", bDto);
			
			if(bDto == null) {
				System.out.println("■■ 존재하지 않는 계좌번호이거나 암호가 틀렸습니다.");
				return;
			} else {
				System.out.println("■■ "+bno+"계좌의 총 금액은 " + bDto.getMoney()+" 입니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	public void searchAccount(int size) {
		sqlSession = sqlSessionFactory.openSession();
		try {
			BankDTO bDto = sqlSession.selectOne("searchAccount", size);
			
			System.out.println(bDto.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
}








