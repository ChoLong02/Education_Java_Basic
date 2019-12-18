package problem.cafe;

import java.util.Scanner;

//프로젝트, 패키지명은 소문자로
//클래스명은 대문자로, 합성어도 대문자
//메소드명은 소문자로 시작, 합성어는 대문자
//생성자는 대문자로 시작, 합성어는 대문자
public class CoffeeMain {
  public static void main(String[] args) {
        int drink_cnt = 10; // 총 재료 수
        int total = 0;
        
        Scanner sc = new Scanner(System.in);
        CoffeeMade made = new CoffeeMade();
        
        while(true) {
             System.out.println("★☆★☆★별다방 ver  1.0★☆★☆★");
             System.out.println("1. 아메리카노");
             System.out.println("2. 카페라떼");
             System.out.println("3. 에스프레소");
             System.out.println("4. 청정과일에이드");
             System.out.println("5. 종료");
             System.out.print("★ 선택 > ");
             String cof = sc.nextLine();
             int num = Integer.parseInt(cof);
             
             if(num == 1) {
                  int order = made.coffeeMade1(num);
                  total = drink_cnt - order;
                  if(total < 0) {
                        total += order;
                        System.out.println("음료 재료가  부족합니다.");
                        System.out.println("★ 남은 음료 수량  > " + total);
                        System.out.println(          );
                  } else if(total >= 0) {
                        drink_cnt -= order;
                        System.out.println(order + "잔  나왔습니다. 맛있게 드세요^^");
                        System.out.println("★ 남은 음료 수량  > " + total);
                        System.out.println(          );
                  }
             }else if(num == 2) {
                  int order = made.coffeeMade2(num);
                  total = drink_cnt - order;
                  if(total < 0) {
                        total += order;
                        System.out.println("음료 재료가  부족합니다.");
                        System.out.println("★ 남은 음료 수량  > " + total);
                        System.out.println(          );
                  } else if(total >= 0) {
                  drink_cnt -= order;
                  System.out.println(order + "잔 나왔습니다.  맛있게 드세요^^");
                  System.out.println("★ 남은 음료 수량 > " +  total);
                  System.out.println(          );
                  }
             }else if(num == 3) {
                  int order = made.coffeeMade3(num);
                  total = drink_cnt - order;
                  if(total < 0) {
                        total += order;
                        System.out.println("음료 재료가  부족합니다.");
                        System.out.println("★ 남은 음료 수량  > " + total);
                        System.out.println(          );
                  } else if(total >= 0) {
                  drink_cnt -= order;
                  System.out.println(order + "잔 나왔습니다.  맛있게 드세요^^");
                  System.out.println("★ 남은 음료 수량 > " +  total);
                  System.out.println(          );
                  }
             }else if(num == 4) {
                  int order = made.coffeeMade4(num);
                  total = drink_cnt - order;
                  if(total < 0) {
                        total += order;
                        System.out.println("음료 재료가  부족합니다.");
                        System.out.println("★ 남은 음료 수량  > " + total);
                        System.out.println(          );
                  } else if(total >= 0) {
                  drink_cnt -= order;
                  System.out.println(order + "잔 나왔습니다.  맛있게 드세요^^");
                  System.out.println("★ 남은 음료 수량 > " +  total);
                  System.out.println(          );
                  }
             }else if(num == 5) {
                  System.out.println("다음에 또 오세요^^");
                  System.out.println("별다방 ver 1.0 종료");
                  break;
             }else {
                  System.out.println("잘못입력하셨습니다.");
             }
        }
        
        // 별다방 ver 1.0 (CoffeeMain)
        // 1. 아메리카노
        // 2. 카페라떼
        // 3. 에스프레소
        // 4. 청정과일에이드
        // 5. 종료
        // 선택 > 4
        
        // 에이드 종류를 선택하세요. (CoffeeMade)
        // 1. 망고에이드
        // 2. 청포도에이드
        // 3. 자몽에이드
        // 선택 > 1
        // 수량 > 3
        // 주문하신 망고에이드
        // 3잔이 완성되었습니다. 맛있게 드세요.(CoffeeMain)
  }
}
