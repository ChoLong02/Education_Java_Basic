package chapter05.obj_practice;

import java.util.Scanner;

public class GadgetMain {
    public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          GadgetGugudan gg = new GadgetGugudan();
          GadgetATM ga = new GadgetATM();
          GadgetBMI gb = new GadgetBMI();
          GadgetPibo gp = new GadgetPibo();
          
          Label1:while(true) {
          
               System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
               System.out.println("▒▒    가제트 프로그램 Ver2.5      ▒▒");
               System.out.println("▒▒         1. 구구단                ▒▒");
               System.out.println("▒▒       2. BMI 계산기             ▒▒");
               System.out.println("▒▒        3. ATM기                 ▒▒");
               System.out.println("▒▒       4. 피보나치 수열            ▒▒");
               System.out.println("▒▒    5. 프로그램 종료(exit)     ▒▒");
               System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
               
               int code = 0;
               
               while(true) {
                    System.out.print("▒▒ 번호 : ");
                    code = sc.nextInt();
                    
                    if(code >= 1 && code <= 5) {
                          break;
                    } else {
                          System.out.println("잘못  입력하셨습니다.");
                    }
               }
               
               if(code == 1) { // 구구단
                    while(true) {
                         System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
                          
                               System.out.print("   ♥ 구구단  단수 : ");
                               int num = sc.nextInt();
                               
                               gg.printGugu(num);
                               
                               System.out.println(" 1. 다시하기  | 2. 종료 ");
                               System.out.print("   ♥ 입력 :  ");
                               int gugudan = sc.nextInt();
                               
                               if(gugudan == 1) {
                                    continue;
                          } else if(gugudan == 2) {
                               System.out.println("구구단  종료");
                               break;
                          } else {
                               System.out.println("잘못  입력하셨습니다.");
                          }
                    }
               } else if(code == 2) { // BMI 계산기
                    System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
                    System.out.println("         BMI 계산기  실행           ");
                    
                    
                    // BMI지수 = 몸무게(kg) / (신장(m) x  신장(m))
                    // 18.5 미만 : 저체중
                    // 18.5 ~ 23미만 : 정상
                    // 23 ~ 26미만 : 과체중
                    // 26 ~ 30미만 : 비만
                    // 30 이상 : 고도비만
                    System.out.print("   ♥ 이름 : ");
                    sc.nextLine();  
                    String name = sc.nextLine();
                    System.out.print("   ♥ 몸무게(kg) : ");
                    double weight = sc.nextDouble();
                    System.out.print("   ♥ 키(cm) : ");
                    double height = sc.nextDouble();
                    
                    double en_height = height / 100;
                    double val = (weight / (en_height *  en_height));
                    String bmi = "";
                    
                    System.out.println(val);
                    System.out.println("BMI지수 : " + val);
                    
                    bmi = gb.printBMI(val, bmi);
                    
                    System.out.println(name + "님은 " + bmi +  "입니다.");
                    
                    
               } else if(code == 3) { // ATM기
                    
                    int money = 0;
                    
                    Label2:while(true) { // break시 빠져나감
                         System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
                          System.out.println("           ATM기  실행");
                         System.out.println("-----------------------------");
                          System.out.println(" 1.예금 | 2.출금 |  3.잔고 | 4.종료 ");
                         System.out.println("-----------------------------");
                          System.out.print("   ♥ 선택 : ");
                          int num = sc.nextInt();
                          
                          if(num == 1) {
                               System.out.print("   ♥ 예금액 >  ");
                               int plus = sc.nextInt();
                               money = ga.inputMoney(plus,  money);
                               
                               System.out.println("   ♥ 잔고 >  " + money);
                               
                          } else if(num == 2) {
                               System.out.print("   ♥ 출금액 >  ");
                               int minus = sc.nextInt();
                               if(money < minus) {
                                    System.out.println("잔고가  부족합니다.");
                                    continue;
                               }
                               money = ga.deleteMoney(minus,  money);
                               
                               System.out.println("   ♥ 잔고 >  " + money);
                               
                          } else if(num == 3) {
                               ga.selectMoney(money);
                               
                          } else if(num == 4) {
                               System.out.println("ATM 프로그램  종료");
                               break; // 반복문 2번 빠져나감
                               // break Label1; 반복문 1번을  빠져나감
                          } else {
                               System.out.println("잘못  입력하셨습니다.");
                          }
                    }
               } else if(code == 4) { // 피보나치 수열
                    System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
                    System.out.println("             피보나치  수열 실행");
                    System.out.print("첫번째 수 입력 : ");
                    int num1 = sc.nextInt();
                    System.out.print("첫번째 수 입력 : ");
                    int num2 = sc.nextInt();
                    
                    System.out.println(num1);
                    num1 = gp.printPibo(num1, num2);
                    
                    System.out.println(num1);
                          
               } else if(code == 5) { // 프로그램 종료(exit)
                    
                    System.out.print("정말  종료하시겠습니까?(Y/N) : ");
                    
                    sc.nextLine();
                    
                    String flag = sc.nextLine();
                    
                    String enCoding = flag.toUpperCase(); //  무조건 대문자로 바꿔준다.
                    System.out.println("======>" + enCoding);
                    
                    if(enCoding.equals("Y")) {
                          System.out.println("프로그램 종료");
                          System.exit(0);
                    } else if(enCoding.equals("N")) {
                          continue;
                    }
                    System.out.print("▒▒ 번호 : ");
               
               } else {
                    System.out.println("잘못 입력하셨습니다.");
               }
          }
    }
}
