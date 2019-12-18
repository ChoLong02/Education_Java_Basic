package chapter04;

import java.util.Scanner;

public class GuGuDan01 {
	public static void main(String[] args) {
        // 구구단 2단 출력
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("단수를 입력하세요.");
        System.out.print("단수 : ");
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int result = 0;
        
        if(num >= 2 && num <= 9) {
             for(int i = 1; i <= 9; i++) // ;는 끝 역할,  여기서는 파트를 나눠 줌
             {
             // 반복하는 동안 실행하는 실행문;
             result = num * i;
             System.out.println(num + "x" + i + "=" +  result);
        }
        } else {
             System.out.println("2~9의 수만 입력하세요!!");
        }
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
	}
}
