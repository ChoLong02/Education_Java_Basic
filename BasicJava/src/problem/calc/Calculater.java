package problem.calc;

public class Calculater {
	int result; // 연산결과를 저장할 변수
	
	// 덧셈기능
	public int sum(int first, int second) {
		return first + second;
	}
	// 뺄셈기능
	public int sub(int first, int second) {
		return first - second;
	}
	// 곱셈기능
	public int multi(int first, int second) {
		return first * second;
	}
	// 나눗셈기능
	public int div(int first, int second) {
		return first / second;
	}
}
