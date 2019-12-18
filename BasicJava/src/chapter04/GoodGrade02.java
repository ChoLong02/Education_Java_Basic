package chapter04;

import java.util.Scanner;

public class GoodGrade02 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          
          System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
          System.out.println("           학점 계산기");
          System.out.print("♥ 이름 : ");
          String name = sc.nextLine();
          System.out.print("♥ 국어 : ");
          int kor = sc.nextInt();
          System.out.print("♥ 영어 : ");
          int eng = sc.nextInt();
          System.out.print("♥ 수학 : ");
          int math = sc.nextInt();
          
          int total = kor + eng + math;
          double avg = total / 3.0; // total 앞에 (double)을  하거나 뒤에 3을 실수로 만들어준다.
                                          // int (연산) int =  int
                                          // double (연산) int  = double
                                          // 크기가 큰  데이터타입으로 자동 형변환
          String grade = "";
          
          System.out.println("▒▒평균점수 : " + avg);
          
          if(100 >= avg && 91 <= avg) { // A+, A, A-
               
               if(avg >= 98) {
                    grade = "A+";
               } else if(avg >= 95) {
                    grade = "A";
               } else if(avg >= 91) {
                    grade = "A-";
               }
               
          } else if(avg >= 81) { // B+, B, B-
               
               if(avg >= 88) {
                    grade = "B+";
               } else if(avg >= 85) {
                    grade = "B";
               } else if(avg >= 81) {
                    grade = "B-";
               }
               
          } else if(avg >= 71) { // C+, C, C-
               
               if(avg >= 78) {
                    grade = "C+";
               } else if(avg >= 75) {
                    grade = "C";
               } else if(avg >= 71) {
                    grade = "C-";
               }
               
          } else if(avg >= 61) { // D+, D, D-
               
               if(avg >= 68) {
                    grade = "D+";
               } else if(avg >= 65) {
                    grade = "D";
               } else if(avg >= 61) {
                    grade = "D-";
               }
               
          } else { // F
               grade = "F";
          }
          System.out.println(name + "학생의 학점은 " + grade +  "입니다.");
    }
}
