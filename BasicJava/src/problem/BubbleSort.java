package problem;

import java.util.Scanner;

public class BubbleSort { 
	static int[] data = new int[5];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ 보글보글 버블정렬 Ver1.2");
		System.out.println("▒▒ 5개의 무작위 수를 입력해주세요.");
		for (int i = 0; i < data.length; i++) {
			while(true) {
				System.out.print("▒▒ "+(i+1)+"번수>>");
				int num = sc.nextInt();
				if(duplicateNum(num)) {
					data[i] = num;
					break;
				}
			}
		}
		// 초기값 출력
		System.out.println("초기값========================");
		viewData();
		
		// 정렬
		int temp = 0;
		for(int i = 0 ; i < data.length ; i ++) { //버블 정렬
			for(int j = 0 ; j < data.length -i -1 ; j ++) {
				if(data[j]>data[j+1])   {
					temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				} 
			}
			viewData();
		}
		
		// 출력
		// viewData();
	}
	public static boolean duplicateNum(int num) {
		boolean flag = true;
		for (int i = 0; i < data.length; i++) {
			if(data[i] == num) {
				flag = false;
			}
		}
		return flag; 
	}
	
	public static void viewData() {
		System.out.println("===========================");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
}
