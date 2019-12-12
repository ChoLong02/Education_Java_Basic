package problem;

import java.util.Scanner;

public class Bubble {
	static int[] data = new int[5];
	public static  void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ 보글보글 버블정렬 Ver1.2");
		System.out.println("▒▒ 5개의 무작위 수를 입력해주세요.");
//		System.out.print("▒▒ 1번수>>");
//		data[0] = sc.nextInt();
//		System.out.print("▒▒ 2번수>>");
//		data[1] = sc.nextInt();
//		System.out.print("▒▒ 3번수>>");
//		data[2] = sc.nextInt();
//		System.out.print("▒▒ 4번수>>");
//		data[3] = sc.nextInt();
//		System.out.print("▒▒ 5번수>>");
//		data[4] = sc.nextInt();
		// 입력부:data 배열에 5개의 값을 저장
		for (int i = 0; i < data.length; i++) {
			while(true) {
				System.out.print("▒▒ "+(i+1)+"번수>>");
				// 사용자로부터 키보드로 정수값을 입력받아
				// data[i]번지 배열에 값을 저장
				int num = sc.nextInt();
				// 중복값 판별
				// duplicateNum()함수에 매개변수로 data[i]번지 값을 전송
				// => 중복체크해주는 함수에 입력값으로 사용자가 키보드로 입력한값 전송
				// 중복체크함수 실행 결과 return값이 
				// true이면 중복아님 => break로 무한루프 빠져나가기
				// flase이면 중복 => 중복임으로 다시 입력(무한루프)
				if(duplicateNum(num)) {
					// 중복값이 아니면 break로 무한루프 빠져나가고
					// 다음 값을 입력하로 이동!
					data[i] = num;
					break;
				}
			}
		}
		viewData();
	}
	// 중복값 판별부: data 배열에 중복값이 입력되는지 여부를 체크하는 메서드
	// int num <- 사용자가 키보드로 입력한 값
	// num을 배열에 있는 값과 비교해서 중복인지 아닌지 판단
	// 중복이면 false, 중복이 아니면 true를 리턴값으로 전달
	public static boolean duplicateNum(int num) {
		// return값을 전달할 변수 선언 및 true로 초기화!
		boolean flag = true;
		
		// 반복을 돌면서 실행(0부터 4번까지 +1씩하면서 총 5번반복)
		for (int i=0; i<data.length; i++) {
			// 배열에 i번지값과 사용자가 입력한 값이 같은지 체크
			if(data[i] == num) {
				// 같으면 flag변수에 false를 담음!
				flag = false;
			}
		}
		// 나를 호출했던 곳으로 돌아가면서 boolean type의
		// return값 flag를 전달!
		return flag;
	}
	
	// 출력부:data 배열의 전체 값을 출력해주는 메서드
	public static void viewData() {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" ");
		}
	}
	
}












