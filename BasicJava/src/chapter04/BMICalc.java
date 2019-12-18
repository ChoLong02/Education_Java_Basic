package chapter04;

import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args) {
          
          // BMI지수 = 몸무게(kg) / (신장(m) x 신장(m))
          // 18.5 미만 : 저체중
          // 18.5 ~ 23미만 : 정상
          // 23 ~ 26미만 : 과체중
          // 26 ~ 30미만 : 비만
          // 30 이상 : 고도비만
          
          //1. 데이터 입력 (이름, 키, 몸무게)
          Scanner sc = new Scanner(System.in);
          System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
          System.out.println("BMI 계산기 Ver1.2");
          System.out.print("이름 : ");
          String user = sc.nextLine();
          System.out.print("몸무게(kg) : ");
          int weight = sc.nextInt();
          System.out.print("신장(cm) : ");
          //사용자의 편의에 맞게 전처리 해준다.
          int height = sc.nextInt();
          
          double en_height = (double)height / 100;
          
          //2. 데이터 연산
          double bmiVal = weight / (en_height * en_height);
          
          String bmiDegree = "";
          
          if(bmiVal < 18.5) {
               bmiDegree = "저체중";
          } else if((bmiVal >= 18.5) && (bmiVal < 23)) {
               bmiDegree = "정상";
          } else if((bmiVal >= 23) && (bmiVal < 26)) {
               bmiDegree = "과체중";
          } else if((bmiVal >= 26) && (bmiVal < 30)) {
               bmiDegree = "비만";
          } else if(bmiVal >= 30) {
               bmiDegree = "고도비만";
          }
          System.out.println(user + "님의 몸무게는 " + weight + "kg");
          System.out.println("신장은 " + height + "cm");
          System.out.println("BMI지수는 " + bmiVal + "로 " + bmiDegree + "입니다.");
          //3. 데이터 출력
          //000님의 키는 000cm, 몸무게는 00kg으로 "???"입니다.
	}
}
