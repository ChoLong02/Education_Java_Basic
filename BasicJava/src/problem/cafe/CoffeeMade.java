package problem.cafe;

import java.util.Scanner;

public class CoffeeMade {
    
    Scanner sc = new Scanner(System.in);
    int order = 0;
    
    public CoffeeMade() {
          
    }
    
    public int coffeeMade1(int num) {
          while(true) {
               System.out.println("1. 아이스아메리카노");
               System.out.println("2. 핫아메리카노");
               System.out.print("★ 선택 > ");
               int num2 = sc.nextInt();
               System.out.print("★ 수량 > ");
               order = sc.nextInt();
               
               if(num2 == 1) {
                    System.out.print("아이스아메리카노 ");
               } else if(num2 == 2) {
                    System.out.print("핫아메리카노 ");
               } else {
                    System.out.println("잘못입력하셨습니다.");
                    continue;
               }
               return order;
          }
    }
    
    public int coffeeMade2(int num) {
          while(true) {
               System.out.println("1. 카페라떼");
               System.out.println("2. 녹차라떼");
               System.out.println("3. 고구마라떼");
               System.out.print("★ 선택 > ");
               int num2 = sc.nextInt();
               System.out.print("★ 수량 > ");
               order = sc.nextInt();
               
               if(num2 == 1) {
                    System.out.print("카페라떼 ");
               } else if(num2 == 2) {
                    System.out.print("녹차라떼");
               } else if(num2 == 3) {
                    System.out.print("고구마라떼");
               } else {
                    System.out.println("잘못입력하셨습니다.");
               }
               return order;   
          }
    }
    
    public int coffeeMade3(int num) {
          while(true) {
               System.out.println("1. 1샷");
               System.out.println("2. 2샷");
               System.out.print("★ 선택 > ");
               int num2 = sc.nextInt();
               System.out.print("★ 수량 > ");
               order = sc.nextInt();
               
               if(num2 == 1) {
                    System.out.print("에스프레소 1샷 ");
               } else if(num2 == 2) {
                    System.out.print("에스프레소 2샷 ");
               } else {
                    System.out.println("잘못입력하셨습니다.");
               }
               return order;
          }
    }
    
    public int coffeeMade4(int num) {
          while(true) {
               System.out.println("1. 망고에이드");
               System.out.println("2. 청포도에이드");
               System.out.println("3. 자몽에이드");
               System.out.print("★ 선택 > ");
               int num2 = sc.nextInt();
               System.out.print("★ 수량 > ");
               order = sc.nextInt();
               
               if(num2 == 1) {
                    System.out.print("망고에이드 ");
               } else if(num2 == 2) {
                    System.out.print("청포도에이드 ");
               } else if(num2 == 3) {
                    System.out.print("자몽에이드 ");
               }
               return order;
          }
    }
}
