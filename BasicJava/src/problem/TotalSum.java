package problem;

public class TotalSum {
	public static void main(String[] args) {
		// 1~100중에 짝수, 홀수 각각 더해서 출력하세요.
		// 시작값: 1
		// 종료값: 100
		// 짝수 누적합: even
		// 홀수 누적합: odd
		
		int odd = 0; // 덧셈 결과의 누적
		int even = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) { // 짝수
				even = even + i;
			} else { // 홀수
				odd = odd + i;
			}
		}
		System.out.println("1~100까지 짝수총합: " + even);
		System.out.println("1~100까지 홀수총합: " + odd);
	}
	
	
}
