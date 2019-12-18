package chapter04;

public class ThreeMulti {
	public static void main(String[] args) {
	     // 3의 배수의 총합 : 18
	     // 3의 배수를 제외한 총합 : ?
	     // 1~10까지의 수
	     
		int finalNum = 10;
		int threeTotal = 0;
		int etcTotal = 0;
	     
		for(int i = 1; i <= finalNum; i++) {
			if(i % 3 == 0) {
				// threeTotal = threeTotal + i;
	            threeTotal += i;
	        } else {
	            // etcTotal = etcTotal + i;
	            etcTotal += i;
	        }
		}
		System.out.println("3의 배수의 총합 : " + threeTotal);
		System.out.println("나머지의 총합 : " + etcTotal);
	}
}
