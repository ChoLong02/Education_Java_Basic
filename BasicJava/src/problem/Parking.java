package problem;

public class Parking {
	int[] space = new int[5]; // 주차공간(5대)
	int carCnt; // 현재 주차된 차량수
	
	public Parking() {
	}
	
	// 1.주차타워 현황
	public void viewParking() {
		System.out.println("=============");
		for (int j = 0; j < space.length; j++) {
			System.out.println("|| "+(j+1)+"층:"+space[j]+" ||");
		}
		System.out.println("=============");
	}
	
	// 2.주차타워 입고
	public void inParking(int car) {
		// 현재 주차타워에 빈공간이 없는 경우
		if(carCnt == space.length) { // 설명하기!!!!!!!!
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			System.out.println("▒▒ 공간이 부족합니다. 2번타워를 이용해주세요.");
			return; // 메서드 실행종료!
		}
		// 주차공간을 순회하면서 비어있는(입고 할 공간)을 찾음
		for (int i = 0; i < space.length; i++) {
			// 비어있는 공간을 찾음(값이 0이면 비어있음)
			if(space[i] == 0) {
				space[i] = car;
				carCnt += 1;
				//carCnt = carCnt + 1;
				System.out.println("▒▒ "+(i+1)+"층:"+car+"입고완료!");
				viewParking();
				break;
			}
		}
	}
	
	// 3.주차타워 출고
	public void outParking(int car) {
		// 주차타워에 차량이 0대인 경우
		if(carCnt == 0) {
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			System.out.println("▒▒ 주차중인 차량이 없습니다. 확인해주세요.");
			return;
		}
		for (int i = 0; i < space.length; i++) {
			// 주차된 차량번호와 내가 입력한 차량번호가 같을때
			if(space[i] == car) {
				space[i] = 0; // 출고 => 공간 0
				carCnt -= 1; // 현재주차차량-1
				System.out.println("▒▒ "+(i+1)+"층:"+car+"출고완료!");
				viewParking();
				return;
			} 
		}
		
		// 입력한 차량번호가 해당 주차타워에 없음!!
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ 없는 차량번호 입니다. 다시 입력해주세요.");
	}
}








