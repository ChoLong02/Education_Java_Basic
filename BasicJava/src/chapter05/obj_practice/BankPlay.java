package chapter05.obj_practice;

import java.util.Scanner;

public class BankPlay {
    Scanner sc = new Scanner(System.in);
    int myMoney; // 나의 계좌
    String name = "박선미";
    
    // 입금을 담당하는 행위(메서드)
    public void inputMoney() {
          System.out.print("입금 : ");
          int money = sc.nextInt();
          
          myMoney = myMoney + money;
    }
    
    // 출금을 담당하는 행위(메서드)
    public void deleteMoney() {
          System.out.print("출금 : ");
          int money = sc.nextInt();
          // 잔고보다 출금금액이 많은 경우
          if(money > myMoney) {
               System.out.println("잔액 부족");
          } else {
               myMoney = myMoney - money;
          }
    }
    
    // 잔고 확인하는 행위(메서드)
    public void selectMoney() {
          System.out.println("잔고 : " + myMoney);
    }
}
