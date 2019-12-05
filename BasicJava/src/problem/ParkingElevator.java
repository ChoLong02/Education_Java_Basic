package problem;

import java.util.Scanner;

public class ParkingElevator { 
	public static void main(String[] args) {
		int[] space = new int[5]; // 0으로 자동(JAVA) 초기화
		int carCnt = 0;
		Scanner sc = new Scanner(System.in);
		label: while(true) {
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			System.out.println("▒▒ EZ Parking Ver3.2");
			System.out.print("▒▒ Car Number>>");
			int car = sc.nextInt();
			
			int code = 0;
			while(true) {
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println("▒▒ 1.차량입고");
				System.out.println("▒▒ 2.차량출고");
				System.out.println("▒▒ 3.취소");
				System.out.print("▒▒ 선택>>");
				code = sc.nextInt();
				if(code > 3 || code < 1) {
					System.out.println("▒▒ 1,2,3 중 하나를 입력해주세요.");
					continue;
				} else {
					break;
				}
			}
			
			if(code == 1) { // 입고 시스템
				if(carCnt == space.length) {
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println("▒▒ 죄송합니다. 공간이 부족합니다.");
					for (int i = 0; i < space.length; i++) {
						System.out.println("▒▒ "+(i+1)+":"+space[i]);
					}
					continue;
				}
				for (int i = 0; i < space.length; i++) {
					if(space[i] == 0) {
						space[i] = car;
						System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
						System.out.println("▒▒ " + (i+1) + "층:" + car + "입고 완료");
						for (int j = 0; j < space.length; j++) {
							System.out.println("▒▒ "+(j+1)+":"+space[j]);
						}
						carCnt += 1;
						break;
					}
				}
			} else if(code == 2) { // 출고 시스템
				if(carCnt == 0) {
					System.out.println("▒▒ 주차중인 차량이 없습니다. 확인해주세요.");
					for (int i = 0; i < space.length; i++) {
						System.out.println("▒▒ "+(i+1)+":"+space[i]);
					}
				} else if(carCnt >= 1 || carCnt <= 5) {
					for (int i = 0; i < space.length; i++) {
						if(space[i] == car) {
							System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
							System.out.println("▒▒ " + (i+1) + "층:" + car + "출고 완료");
							space[i] = 0;
							carCnt -= 1;
							for (int j = 0; j < space.length; j++) {
								System.out.println("▒▒ "+(j+1)+":"+space[j]);
							}
							continue label;
						}
					}
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println("▒▒ 차량이 존재하지 않습니다. 다시 입력해주세요.");
					for (int i = 0; i < space.length; i++) {
						System.out.println("▒▒ "+(i+1)+":"+space[i]);
					}
					continue;
				}
				
			} else if(code == 3) { // 취소
				car = 0;
				System.out.println("▒▒ 다음에 또 이용해주세요.");
				continue;
			}
		}
	}
}
