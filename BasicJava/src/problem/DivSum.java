package problem;

import java.util.Scanner;

public class DivSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호>>");
		int num = sc.nextInt();
		
		int total = 0;
		int next = num;
		while(true) {
			total = total + (next % 10);
			next = next / 10;
			if(next == 0) { 
				break;
			}
		}
		System.out.println("총합>>" + total);
	}
}
