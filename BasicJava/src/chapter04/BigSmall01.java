package chapter04;

import java.util.Scanner;

public class BigSmall01 {
	public static void main(String[] args) { // []는 배열
        // 1. 숫자 입력받는 부분
        Scanner sc = new Scanner(System.in);
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("BigSmall Ver2.5");
        System.out.print("Number01: ");
        int num1 = sc.nextInt();
        System.out.print("Number02: ");
        int num2 = sc.nextInt();
        
        // 2. 크기 비교하는 부분
        if(num1 > num2) {
             System.out.println(num1 + "이 더 크다.");
        } else if(num1 < num2) {
             System.out.println(num2 + "이 더 크다.");
        } else {
             System.out.println(num1 + "과 " + num2 +"이 같다.");
        }
        // 3. 숫자 출력하는 부분
	}
}
