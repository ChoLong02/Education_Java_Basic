package problem;

import java.util.Scanner;

public class Pibonachi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ 피보나치 수열 출력 Ver1.2");
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.print("▒▒ Depth>> ");
		int depth = sc.nextInt();
		 
		int front = 1;  // 첫번째 항
		int end = 1;    // 두번째 항
		int sum = front + end;    // 첫번째항 + 두번째항
		
		System.out.println("▒▒ 피보나치 Depth " + depth + "수열 값: ");
		System.out.print("▒▒ 1 1 ");
		for(int i=2; i<=depth; i++) {
			sum = end;
			end = front+end;
			front = sum;
			
			System.out.print(end + " ");
		}
		System.out.println();
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
	}
}
