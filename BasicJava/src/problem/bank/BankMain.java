package problem.bank;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankDAO bDao = new BankDAO();
		int code = 0;
		
		while(true) {
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("■■ 허쉬 은행");
			System.out.println("■■ 1.계좌 개설");
			System.out.println("■■ 2.입금");
			System.out.println("■■ 3.출금");
			System.out.println("■■ 4.전체고객조회");
			System.out.println("■■ 5.계좌잔액조회");
			System.out.println("■■ 6.계좌해지");
			System.out.println("■■ 7.프로그램 종료");
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
				
				
			} else if(code == 2) {
				System.out.println("■■ 입금할 계좌와 금액을 입력해주세요.");
				System.out.print("■■ 계좌번호>>");
				int bno = sc.nextInt();
				System.out.print("■■ 입금액>>");
				int money = sc.nextInt();
				
				bDao.plusMoney(bno, money);
				
		    } else if(code == 3) {
		    	System.out.println("■■ 출금할 계좌번호와 암호를 입력해주세요.");
		    	System.out.print("■■ 계좌번호>");
				int bno = sc.nextInt();
				System.out.print("■■ 패스워드>");
				sc.nextLine();
				String pw = sc.nextLine();
				
				if(bDao.checkUser(bno, pw)) {
					int balance = bDao.balanceMoney(bno); // 잔액
					System.out.println("■■ 잔액:"+ balance);
					System.out.println("■■ 출금하실 금액을 입력해주세요.");
					System.out.print("■■ 출금액>>");
					int money = sc.nextInt(); // 출금액
					
					// 잔액 = 출금액 = 0         >> 출금
				    // 잔액 > 출금액 = 잔액-출금액    >> 출금
					// 잔액 < 출금액 = 잘못입력 = > 경고메세지
					if(balance < money) {
						System.out.println("■■ 잔액이 부족합니다. 확인해주세요.");
					} else {
						bDao.minusMoney(bno, money);
					}
					
					
				} else {
					System.out.println("■■ 존재하지 않는 계좌번호이거나 암호가 틀렸습니다.");
				}
				
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
				System.out.println("■■ 계좌를 해지합니다. 해지하고싶은 계좌번호를 입력해주세요.");
				System.out.print("■■ 계좌번호>> ");
				int bno = sc.nextInt();
				System.out.print("■■ 패스워드>> ");
				sc.nextLine();
				String pw = sc.nextLine();
				
				bDao.deleteAccount(bno, pw);
				
			} else if(code == 7) {
				System.out.print("■■ 프로그램 종료합니다.");
				System.exit(0);
			}
		}
	}
}











