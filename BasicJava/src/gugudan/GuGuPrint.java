package gugudan;

public class GuGuPrint {
	
	public String guGuDan(int dansu) {
		int result; // 변수선언, 초기화X
		System.out.println("구구단 " + dansu + "단 출력");
		for(int i = 1; i <= 9; i++) {
			result = dansu * i;
			System.out.println(dansu + " x " + i + " = " + result);
		}
		return "바보야";
	}
	
}
