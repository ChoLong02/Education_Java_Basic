package market;

import java.util.Scanner;

public class MarketMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductDAO pDao = new ProductDAO();
		int code = 0;  // 실행할 기능 번호
		
		while(true) {  // 전체 프로그램 반복
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("■■ Market System Ver 1.1 ■■");
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("■ 1. 제품 판매");
			System.out.println("■ 2. 제품 등록");
			System.out.println("■ 3. 제품 수정");
			System.out.println("■ 4. 제품 삭제");
			System.out.println("■ 5. 제품 조회");
			System.out.println("■ 6. 제품 검색");
			System.out.println("■ 7. 제품 일일매출");
			System.out.println("■ 8. 프로그램 종료");
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.print("■■ Code >> ");
			code = sc.nextInt();
			
			if(code == 1) {
				/*
				 * 제품 판매 비즈니스 로직
				 *  제품 판매
				 *   [트랜잭션]
				 *   1. 매출 테이블에 매출 기록 저장
				 *    - 어떤 상품이 언제 몇개 얼마에 팔렸나...
				 *   2. 제품 테이블에서 판매한 수량만큼 discount
				 */
				
			}else if(code == 2) {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.print("■■ 제품명: ");
				sc.nextLine();
				String pName = sc.nextLine();
				System.out.print("■■ 가격: ");
				int pPrice = sc.nextInt();
				System.out.print("■■ 수량: ");
				int pCnt = sc.nextInt();
				
				ProductDTO pDto = new ProductDTO(pName, pPrice, pCnt);
				pDao.insertProduct(pDto);
				
				
			}else if(code == 3) {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.print("제품번호: ");
				int pno = sc.nextInt();
				System.out.print("가격: ");
				int pprice = sc.nextInt();
				ProductDTO pDto = new ProductDTO(pno, pprice);
				pDao.updateProduct(pDto);
						
				
			}else if(code == 4) {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.print("제품번호: ");
				int pno = sc.nextInt();
				pDao.deleteProduct(pno);
				
			}else if(code == 5) {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				pDao.selectProduct();
				
			}else if(code == 6) {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.print("키워드>> ");
				sc.nextLine();
				String keyword = sc.nextLine();
				pDao.searchProduct(keyword);
				
			}else if(code == 7) {
				/*
				 * 매출현황
				 *   - 매출 테이블
				 *   SELECT~FROM~WHERE 날짜 조건
				 *   1) 날짜조건을 당일로
				 *   2) 날짜조건을 6월 1~30
				 *   → 매출가격을 모두 더하면 → 총 매출 현황	
				 */
				
			}else if(code == 8) {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			} else {
				System.out.println("올바른 값을 입력해주세요:)");
			}
			
			
		}
	}
}
