package chapter04;

import java.util.Scanner;

public class TwoSum {
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("   ☆★☆★☆★☆　홀짝 계산기　☆★☆★☆★☆");
        System.out.print("final num : ");
        int num = sc.nextInt();
        
        // 1~5까지 합을 구하는 코드 작성
        // 1+2+3+4+5
        
        int onetotal = 0;
        int twototal = 0; // 총합을 계산
        int two = 0;
        
        for(int i = 1; i <= num; i++) {
             two = i % 2;
             
             if(two == 0) { // 짝수의 총합
                  onetotal = onetotal + i;
                  System.out.println("짝수 " + i + "번, 총합  : " + onetotal);
             } else if(two == 1) { // 홀수의 총합
                  twototal = twototal + i;
                  System.out.println("홀수 " + i + "번, 총합  : " + twototal);
             }
        }
        System.out.println();
        System.out.println("짝수총합 : " + onetotal);
        System.out.println("홀수총합 : " + twototal);
        System.out.print("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
	}
}
