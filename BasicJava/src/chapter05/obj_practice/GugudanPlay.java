package chapter05.obj_practice;

import java.util.Scanner;

public class GugudanPlay {
	   
    Scanner sc = new Scanner(System.in);
    int num; // 선언
    int result; // 전역 변수 선언(클래스에 속해있다.), 클래스를  제외한 변수는 지역 변수
   
   
    // 지정어 생략가능!!
    public void guguCalc() {
          // int num = 20; // 지역 변수
          System.out.println("3333333");
          System.out.println("구구단 프로그램");
          System.out.print("단수 : ");
          num = sc.nextInt();
         
          for(int i = 1; i <= 9; i++) {
               result = num * i;
               System.out.println(num + " X " + i + " = " +  result);
          }
    }
}
