package problem.DDBoard;

import java.util.Scanner;

public class DDBoardMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardDAO bDao = new BoardDAO();
		int code = 0; // 사용자가 선택한 프로그램 번호
		
		while(true) {
			System.out.println("▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧");
			System.out.println("▨▧ 더블디 게시판");
			bDao.BoardSelect();
			System.out.println("▨▧ 1.게시글 등록");
			System.out.println("▨▧ 2.게시글 수정");
			System.out.println("▨▧ 3.게시글 삭제");
			System.out.println("▨▧ 4.게시글 조회");
			System.out.println("▨▧ 5.게시글 검색");
			System.out.println("▨▧ 6.게시글 정렬");
			System.out.println("▨▧ 7.상세 게시글");
			System.out.println("▨▧ 8.만든이");
			System.out.println("▨▧ 9.프로그램 종료");
			System.out.println("▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧");
			
			while(true) {
				System.out.print("▨▧ 번호>> ");
				code = sc.nextInt();
				if(code >= 1 && code <= 9) {
					break;
				} else {
					System.out.println("▨▧ 1~9의 값을 입력하세요.");
					continue;
				}
			}
			
			if(code == 1) {
				
			} else if(code == 2) {
				
			} else if(code == 3) {
				
			} else if(code == 4) {
				// 직접 만들어 보세용!
				System.out.println("▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧");
				bDao.BoardSelect();
			} else if(code == 5) {
				System.out.println("▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧");
				System.out.println("▨▧ 검색할 키워드를 입력하세요.");
				System.out.print("▨▧ 검색>>");
				sc.nextLine();
				String keyword = sc.nextLine();
				
				bDao.BoardSearch(keyword);
			} else if(code == 6) {
				System.out.println("▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧");
				System.out.println("▨▧ 날짜순으로 정렬합니다.");
				bDao.BoardSort();
			} else if(code == 7) {
				System.out.println("▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧");
				System.out.println("▨▧ 보고싶은 게시글번호를 입력하세요.");
				System.out.print("▨▧ 게시글번호>>");
				int bno = sc.nextInt();
				
				bDao.BoardView(bno);
			} else if(code == 8) {
				System.out.println("▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧");
				System.out.println("▨▧ Name: DD Board Program");
				System.out.println("▨▧ Version: 1.7");
				System.out.println("▨▧ Use: JAVA, ORACLE");
				System.out.println("▨▧ Date: 2019.12.17");
				System.out.println("▨▧ made by ChoLong02");
				System.out.println("▨▧ sentilemon02@gmail.com");
			} else if(code == 9) {
				System.out.println("▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧▨▧");
				System.out.println("▨▧ [프로그램 종료]");
				System.exit(0);
			}
			
			
			
		}
	}
}