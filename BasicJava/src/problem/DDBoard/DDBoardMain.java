package problem.DDBoard;

import java.util.Scanner;

public class DDBoardMain {
	static String session = "NO"; // 로그인 유무(YES:LOGIN OK) 
	static String userid = "";     // 로그인 유저의 ID값
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardDAO bDao = new BoardDAO();   // 게시글관련 기능
		MemberDAO mDao = new MemberDAO(); // 회원관련 기능
		int code = 0; // 사용자가 선택한 프로그램 번호
		
		while(true) {
			System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□");
			System.out.println("■□ 더블디 게시판 ■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□");
			bDao.BoardSelect();
			System.out.println("■□ 0.로그인");
			System.out.println("■□ 1.게시글 등록");
			System.out.println("■□ 2.게시글 수정");
			System.out.println("■□ 3.게시글 삭제");
			System.out.println("■□ 4.게시글 조회");
			System.out.println("■□ 5.게시글 검색");
			System.out.println("■□ 6.게시글 정렬");
			System.out.println("■□ 7.상세 게시글");
			System.out.println("■□ 8.만든이");
			System.out.println("■□ 9.로그아웃");
			System.out.println("■□ 10.프로그램 종료");
			if(DDBoardMain.session.equals("YES")) {
				System.out.println("■□ \""+DDBoardMain.userid+"\"님 방문을 환영합니다.");
			}
			System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□");
			
			while(true) {
				System.out.print("■■ 번호>> ");
				code = sc.nextInt();
				if(code >= 0 && code <= 10) {
					break;
				} else {
					System.out.println("■■ 0~10의 값을 입력하세요.");
					continue;
				}
			}
			
			if(code == 0) {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("■■ 로그인할 ID와 PW를 입력해주세요.");
				System.out.print("■■ ID>>");
				sc.nextLine();
				String id = sc.nextLine();
				System.out.print("■■ PW>>");
				String pw = sc.nextLine();
				
				mDao.login(id, pw);
			} else if(code == 1) {
				if(DDBoardMain.session.equals("NO")) { // 로그인 NO
					System.out.println("■■ 로그인이 필요한 기능입니다.");
					continue;
				}
				
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("■■ 게시글을 등록합니다. 값을 입력해주세요.");
				System.out.print("■■ 제목>>");
				sc.nextLine();
				String title = sc.nextLine();
				System.out.print("■■ 내용>>");
				String content = sc.nextLine();
				String writer = DDBoardMain.userid; // 로그인한 유저 ID = 작성자
				
				BoardDTO bDto = new BoardDTO(title, content, writer);
				bDao.BoardInsert(bDto);
			} else if(code == 2) {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("■■ 게시글을 수정합니다. 값을 입력해주세요.");
				System.out.print("■■ 번호>>");
				int bno = sc.nextInt();
				System.out.print("■■ 제목>>");
				sc.nextLine();
				String title = sc.nextLine();
				System.out.print("■■ 내용>>");
				String content = sc.nextLine();
				System.out.print("■■ 작성자>>");
				String writer = sc.nextLine();
				BoardDTO bDto = new BoardDTO(bno, title, content, writer);
				bDao.BoardUpdate(bDto);
			} else if(code == 3) {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("■■ 게시글을 삭제합니다. 삭제할 게시글 번호를 입력하세요.");
				System.out.print("■■ 번호>>");
				int bno = sc.nextInt();
				bDao.BoardDelete(bno);
			} else if(code == 4) {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				bDao.BoardSelect();
			} else if(code == 5) {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("■■ 검색할 키워드를 입력하세요.");
				System.out.print("■■ 검색>>");
				sc.nextLine();
				String keyword = sc.nextLine();
				
				bDao.BoardSearch(keyword);
			} else if(code == 6) {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("■■ 조회순으로 정렬합니다.");
				bDao.BoardSort();
			} else if(code == 7) {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("■■ 보고싶은 게시글번호를 입력하세요.");
				System.out.print("■■ 게시글번호>>");
				int bno = sc.nextInt();
				
				bDao.BoardView(bno);
			} else if(code == 8) {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("■■ Name: DD Board Program");
				System.out.println("■■ Version: 1.7");
				System.out.println("■■ Use: JAVA, ORACLE");
				System.out.println("■■ Date: 2019.12.17");
				System.out.println("■■ made by ChoLong02");
				System.out.println("■■ sentilemon02@gmail.com");
			} else if(code == 9) {
				if(DDBoardMain.session.equals("YES")) { // 로그인 -> 로그아웃
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					System.out.println("■■ "+DDBoardMain.userid+"님 로그아웃 되었습니다.");
					DDBoardMain.session = "NO";
					DDBoardMain.userid = "";
				} else {
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					System.out.println("■■ 로그인이 필요한 기능입니다.");
				}
				
			} else if(code == 10) {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("■■ [프로그램 종료] ■■");
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.exit(0);
			}
			
			
			
		}
	}
}
