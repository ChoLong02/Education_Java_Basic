package chapter05.obj_practice;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          
          // 2. 객체 생성
          // 객체자료형 객체참조변수 = new 생성자();
          // 객체자료형에는 class 이름이 들어온다.
          
          BankPlay bp = new BankPlay(); // ()를 붙여야 메소드로  인식, 없으면 class로 인식
          
          while(true) {
               System.out.println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨");
               System.out.println("▨                            1. 입금              ▨");
               System.out.println("▨                            2. 출금              ▨");
               System.out.println("▨                            3. 잔고              ▨");
               System.out.println("▨                            4. 종료              ▨");
               System.out.println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨");
               System.out.print("   ★ 선택 : ");
               int num = sc.nextInt();
               
               if (num == 1) { // 입금
                    // 4. 인스턴스 사용
                    bp.inputMoney();
               } else if(num == 2) { // 출금
                    bp.deleteMoney();
               } else if(num == 3) { // 잔고
                    bp.selectMoney();
               } else if(num == 4) { // 종료
                    System.out.println("감사합니다.");
                    System.exit(0);
               } else {
                    System.out.println("잘못 입력하셨습니다.");
               }
          }
    }
}
