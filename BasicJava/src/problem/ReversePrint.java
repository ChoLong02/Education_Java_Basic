package problem;

import java.util.Scanner;

public class ReversePrint {
	// 조건
	// 1.사용자가 임의의 정수를 입력
	// 2.사용자가 입력한 정수를 1부터 끝까지 출력
	// 출력 예제
	// 입력>> 5
	// 1
	// 2
	// 3
	// 4
	// 5
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호>>");
		// num = 키보드로 입력한 정수값
		// num = 3
		int num = sc.nextInt(); // 입력값
		
//		// 1번 방법
//		for(int i = num; i >= 1; i--) {
//			System.out.println(i);
//		}
		
//      // 2번 방법
//		int finalNum = num; // 종료값
//		num = num + 1;
//		for(int i = 1; i <= finalNum; i++) {
//			num = num-1;
//			System.out.println(num);
//		}
		
//		// 3번 방법
//		for(int i = 0; i < num; i++) {
//			System.out.println(num-i);
//		}
	}
}