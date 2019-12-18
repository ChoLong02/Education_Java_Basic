package chapter04;

import java.util.Scanner;

public class DrinkBeer {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // new : 객체생성연산제
        // Scanner : 생성자 메소드(메소드 중에 유일하게 첫 글자가  대문자)
        // System.in : 시스템에 입력
        // 키보드입력을 사용하려면 Scanner를 불러와야 함
        
        // 나이를 입력, 20살 이상이면 주류를 판매
        // 19살 이하면 바나나우유를 판매
        
        int age;
        
        System.out.println("나이를 입력하세요.");
        System.out.print("나이 : ");
        age = sc.nextInt(); // nextInt() : 정수형 숫자를  키보드로 입력받는 메소드
        
        if(age >= 20) {
             System.out.println("주류구매가 가능합니다.");
             System.out.println("주류를 선택하세요.");
             System.out.println("1. 맥주, 2. 양주, 3. 소주");
             System.out.print("주류 : ");
             int num = sc.nextInt();
             
        
             if(num == 1) {
                  System.out.println("호가든 로제 1병,  9,000원입니다.");
             } else if(num == 2) {
                  System.out.println("양주 1병,  200,000원입니다.*^^*");
             } else if(num == 3) {
                  System.out.println("잎새주 1병,  5,000원입니다.");
             } else {
                  System.out.println("잘못입력하셨습니다.");
             }
        } else {
             System.out.println("미성년자입니다.");
        }
	}
}
