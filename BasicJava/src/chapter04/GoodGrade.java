package chapter04;

import java.util.Scanner;

public class GoodGrade {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
   
    	System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
	    System.out.println("GoodGrade Ver1.2");
	    System.out.println("by Seonmi");
	    System.out.println("===============================");
	    System.out.print("학생이름 : ");
	   
	    String name = sc.nextLine();
	    System.out.print("국어점수 : ");
	    int kor = sc.nextInt();
	    System.out.print("영어점수 : ");
	    int eng = sc.nextInt();
	    System.out.print("수학점수 : ");
	    int math = sc.nextInt();
	    //System.out.println(name + ", " + kor + ", " + eng +  ", " + math);
	    // 문자열 + 숫자하면 무조건 문자열 옴. +를 결합연산자라고  함.
	   
	    int total = 0;
	    int avg = 0; // 소수점까지 나오게 하고싶으면 double,  avg는 평균이라는 뜻
	    String grade = "";
	   
	    // 100~91 A
	    // 90~81 B
	    // 80~71 C
	    // 70~61 D
	    // 60~0 F
	   
	   
	    total = kor + eng + math;
	    avg = total/3; // %는 나누고 나머지 구할때, /는 나눌때
	    System.out.println("총합 : " + total);
	    System.out.println("평균점수 : " + avg);
	   
	    if((avg <= 100) && (avg >= 91)) {
	    	grade = "A";
	        System.out.println(name + "학생의 등급은 " +  grade + "입니다.^^");
	    } else if((avg <= 90) && (avg >= 81)) {
	        grade = "B";
	        System.out.println(name + "학생의 등급은 " +  grade + "입니다.^^");
	    } else if((avg <= 80) && (avg >= 71)) {
	        grade = "C";
	        System.out.println(name + "학생의 등급은 " +  grade + "입니다.^^");
	    } else if((avg <= 70) && (avg >= 61)) {
	        grade = "D";
	        System.out.println(name + "학생의 등급은 " +  grade + "입니다.^^");
	    } else {
	        grade = "F";
	        System.out.println(name + "학생의 등급은 " +  grade + "입니다.^^");
	    }
	}
}
