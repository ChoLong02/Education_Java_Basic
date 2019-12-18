package chapter04;

import java.util.Scanner;

public class DrinkBeer_SwitchCase {
	public static void main(String[] args) {
        // Switch~case
        Scanner sc = new Scanner(System.in);
        System.out.println("구매하실 주류를 선택하세요.");
        System.out.println("가. 맥주   나. 양주   다. 소주");
        System.out.print("번호 : ");
  //   int num = sc.nextInt(); // 키보드 값 입력
        String code = sc.nextLine();
        
        switch(code) {
             
             // switch의 단점 : 6버전 아래까지는 case 뒤에  숫자밖에 못온다.
             case "가":   // if
                  System.out.println("맥주, 9,000원");
                  break; // 중괄호를 깨고 나간다.(여기까지  멈춘다.)
             case "나":   // else if
                  System.out.println("양주, 100,000원");
                  break;
             case "다":   // else of
                  System.out.println("소주, 4,500원");
                  break;
             default:   //else
             System.out.println("잘못 입력하셨습니다.");
                  break;
        }
	}
}
