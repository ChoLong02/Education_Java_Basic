package problem.bank;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankDAO bDao = new BankDAO();
		int code = 0;
		
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■ 허쉬 은행");
		System.out.println("■■ 1. 계좌 개설");
		System.out.println("■■ 2. 입금");
		System.out.println("■■ 3. 출금");
		System.out.println("■■ 4. 고객조회");
		System.out.println("■■ 5. 계좌조회");
		System.out.println("■■ 6. 사용자 검색");
		System.out.println("■■ 7. 프로그램 종료");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.print("■■ 번호>>");
		code = sc.nextInt();
		// 1.프로그램 전체반복
		// 2.1~6번까지 번호만 허용(나머지는 무한반복 다시 입력)
		// 3.계좌 개설 만들기(INSERT)
		// 4.계좌 조회 만들기(SELECT, 전체조회)
		// 5.사용자 검색 만들기(이름으로)
		// 6.프로그램 종료기능 만들기
		if(code == 1) {
			System.out.println("■■ 신규계좌를 개설합니다. 값을 입력해주세요.");
			System.out.print("■■ 계좌주>>");
			sc.nextLine();
			String bname = sc.nextLine();
			System.out.print("■■ 패스워드>>");
			String pw = sc.nextLine();
			
			bDao.insertBank(bname, pw);
			
			
		} else if(code == 4) {
			bDao.selectBank();
		} else if(code == 5) { // 계좌 조회(1건)
			// 계좌번호, 패스워드
			System.out.println("■■ 계좌를 조회합니다. 계좌번호와 암호를 입력해주세요.");
			System.out.print("■■ 계좌번호>");
			int bno = sc.nextInt();
			System.out.print("■■ 패스워드>");
			sc.nextLine();
			String pw = sc.nextLine();
			
			bDao.selectAccount(bno, pw);
		} else if(code == 6) {
			
			bDao.searchAccount(101);
		}
	}
}











