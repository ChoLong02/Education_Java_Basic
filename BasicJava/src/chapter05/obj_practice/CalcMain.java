package chapter05.obj_practice;

import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
          
          // +, -, *, /
          Scanner sc = new Scanner(System.in);
          CalcPlay cp = new CalcPlay();
          
          while(true) {
               System.out.println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨");
               System.out.println("        ♥ 계산기 프로그램  ♥");
               System.out.print("Number1 > ");
               int num1 = sc.nextInt();
               System.out.print("  연 산 자  > ");
               sc.nextLine();
               String code = sc.nextLine();
               System.out.print("Number2 > ");
               int num2 = sc.nextInt();
               int total = 0;
               int temp = 0;
               
               if(code.equals("+")) {
                    total = cp.sumCalc(num1, num2); //  return으로 돌아오면 ga.inputMoney(plus, money);는 변수로 변한다.
                    
               } else if(code.equals("-")) {
                    
                    if(num1 < num2) {
                          temp = num1;
                          num1 = num2;
                          num2 = temp;
                    }
                    
                    total = cp.subCalc(num1, num2, temp);
                    
               } else if(code.equals("*")) {
                    total = cp.multiCalc(num1, num2);
                    
               } else if(code.equals("/")) {
                    total = cp.divCalc(num1, num2);
                    
               } else {
                    System.out.println("잘못 입력하셨습니다.");
               }
               System.out.println(num1 + code + num2 + "=" +  total);
          }
          
    }
}
